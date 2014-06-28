package com.work.petcharity;

import com.work.petcharity.PMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.users.User;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "petendpoint", namespace = @ApiNamespace(ownerDomain = "work.com", ownerName = "work.com", packagePath = "petcharity"))
public class PetEndpoint{

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPet")
	public CollectionResponse<Pet> listPet(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<Pet> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(Pet.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<Pet>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Pet obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Pet> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getPet")
	public Pet getPet(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		Pet pet = null;
		try {
			pet = mgr.getObjectById(Pet.class, id);
		} finally {
			mgr.close();
		}
		return pet;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param pet the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPet")
	
	public Pet insertPet(Pet pet) {
		
			
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (pet.getId() != null) { // || pet.getId() != 0
				if (containsPet(pet)) {
					throw new EntityExistsException("Object already exists");
				}
			}
			mgr.makePersistent(pet);
		} finally {
			mgr.close();
		}
		return pet;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param pet the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePet")
	public Pet updatePet(Pet pet) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsPet(pet)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.makePersistent(pet);
		} finally {
			mgr.close();
		}
		return pet;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removePet")
	
	public void removePet(@Named("id") Long id) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			Pet pet = mgr.getObjectById(Pet.class, id);
			mgr.deletePersistent(pet);
		} finally {
			mgr.close();
		}
	}

	private boolean containsPet(Pet pet) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(Pet.class, pet.getId());
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
