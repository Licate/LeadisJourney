package org.leadisteam.leadisjourney.api.core.repositories;

public interface IRepository<TModel> {

	public void Persist(TModel obj);
	public TModel Retrieve();
}
