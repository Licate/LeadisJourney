package org.leadisteam.leadisjourney.api.core.repositories;

//Interface générique
public interface IRepository<TModel> {

	public void Persist(TModel obj); // Mettre un objet dans son repository
	public TModel Retrieve(); // Trouver l'objet dans le repository
}
