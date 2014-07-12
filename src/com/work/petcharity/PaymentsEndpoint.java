package com.work.petcharity;

import com.work.petcharity.PMF;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "paymentsendpoint", namespace = @ApiNamespace(ownerDomain = "work.com", ownerName = "work.com", packagePath = "petcharity"))
public class PaymentsEndpoint {

	/**
	 * This method lists all the entities inserted in datastore. It uses HTTP
	 * GET method and paging support.
	 * 
	 * @return A CollectionResponse class containing the list of all entities
	 *         persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPayments")
	public CollectionResponse<Payments> listPayments(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Payments> execute = null;

		try {
			mgr = getPersistenceManager();
//			Query query = mgr.newQuery(Payments.class,"SELECT * FROM Payments WHERE kalbiya  = 'Hadera'");
			Query query = mgr.newQuery(Payments.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Payments>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and
			// accomodate
			// for lazy fetch.
			for (Payments obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Payments> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET
	 * method.
	 * 
	 * @param id
	 *            the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getPayments")
	public Payments getPayments(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Payments payments = null;
		try {
			payments = mgr.getObjectById(Payments.class, id);
		} finally {
			mgr.close();
		}
		return payments;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity
	 * already exists in the datastore, an exception is thrown. It uses HTTP
	 * POST method.
	 * 
	 * @param payments
	 *            the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPayments")
	public Payments insertPayments(Payments payments) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (payments.getPaymentId() != null) {
				if (containsPayments(payments)) {
					throw new EntityExistsException("Object already exists");
				}
			}
			mgr.makePersistent(payments);
		} finally {
			mgr.close();
		}
		return payments;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does
	 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
	 * method.
	 * 
	 * @param payments
	 *            the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePayments")
	public Payments updatePayments(Payments payments) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsPayments(payments)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(payments);
		} finally {
			mgr.close();
		}
		return payments;
	}

	/**
	 * This method removes the entity with primary key id. It uses HTTP DELETE
	 * method.
	 * 
	 * @param id
	 *            the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removePayments")
	public void removePayments(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			Payments payments = mgr.getObjectById(Payments.class, id);
			mgr.deletePersistent(payments);
		} finally {
			mgr.close();
		}
	}

	private boolean containsPayments(Payments payments) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Payments.class, payments.getPaymentId());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}

}
