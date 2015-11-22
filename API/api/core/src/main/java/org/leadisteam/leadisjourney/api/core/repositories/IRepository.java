package org.leadisteam.leadisjourney.api.core.repositories;

import java.util.List;

//Interface générique
public interface IRepository<TModel> {

	public void persist(TModel obj); // Mettre un objet dans son repository
	public TModel retrieve(int id); // Trouver l'objet dans le repository
	public List<TModel> retrieveAll(); // Récupère l'ensemble des objets
	public void delete(TModel obj); // Delete l'objet
}
