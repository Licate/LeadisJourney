package org.leadisteam.leadisjourney.api.repositories.hibernate;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.leadisteam.leadisjourney.api.core.Account;
import org.leadisteam.leadisjourney.api.core.repositories.IAccountRepository;

@Repository("account")
public class AccountRepository implements IAccountRepository {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Account obj) {
		getSession().persist(obj);
	}

	public Account retrieve(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Account> retrieveAll() {
		Session session = this.sessionFactory.openSession();
		List<Account> accounts = session.createQuery("from Account").list();
		session.close();
		return accounts;
	}

	public void delete(Account obj) {
		getSession().delete(obj);

	}

}
