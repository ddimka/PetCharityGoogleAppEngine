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

@Api(name = "kalbiyaendpoint", namespace = @ApiNamespace(ownerDomain = "work.com", ownerName = "work.com", packagePath = "petcharity"))
public class KalbiyaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore. It uses HTTP
	 * GET method and paging support.
	 * 
	 * @return A CollectionResponse class containing the list of all entities
	 *         persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listKalbiya")
	public CollectionResponse<Kalbiya> listKalbiya(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Kalbiya> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Kalbiya.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Kalbiya>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and
			// accomodate
			// for lazy fetch.
			for (Kalbiya obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Kalbiya> builder().setItems(execute)
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
	@ApiMethod(name = "getKalbiya")
	public Kalbiya getKalbiya(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Kalbiya kalbiya = null;
		try {
			kalbiya = mgr.getObjectById(Kalbiya.class, id);
		} finally {
			mgr.close();
		}
		return kalbiya;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity
	 * already exists in the datastore, an exception is thrown. It uses HTTP
	 * POST method.
	 * 
	 * @param kalbiya
	 *            the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertKalbiya")
	public Kalbiya insertKalbiya(Kalbiya kalbiya) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (kalbiya.getId() != null) {
				if (kalbiya.getId() != null) {
					if (containsKalbiya(kalbiya)) {
						throw new EntityExistsException("Object already exists");
					}
				}
			}
			mgr.makePersistent(kalbiya);
		} finally {
			mgr.close();
		}
		return kalbiya;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does
	 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
	 * method.
	 * 
	 * @param kalbiya
	 *            the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateKalbiya")
	public Kalbiya updateKalbiya(Kalbiya kalbiya) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsKalbiya(kalbiya)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(kalbiya);
		} finally {
			mgr.close();
		}
		return kalbiya;
	}

	/**
	 * This method removes the entity with primary key id. It uses HTTP DELETE
	 * method.
	 * 
	 * @param id
	 *            the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeKalbiya")
	public void removeKalbiya(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			Kalbiya kalbiya = mgr.getObjectById(Kalbiya.class, id);
			mgr.deletePersistent(kalbiya);
		} finally {
			mgr.close();
		}
	}

	private boolean containsKalbiya(Kalbiya kalbiya) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Kalbiya.class, kalbiya.getId());
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
