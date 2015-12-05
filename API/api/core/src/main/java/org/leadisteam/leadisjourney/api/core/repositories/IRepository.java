package org.leadisteam.leadisjourney.api.core.repositories;

import java.util.List;

//Generic Interface
public interface IRepository<TModel> {

	public void persist(TModel obj); // Put an object in its repository
	public TModel retrieve(int id); // Find an object in repository
	public List<TModel> retrieveAll(); // Retrieve all the objects
	public void delete(TModel obj); // Delete the object
}
