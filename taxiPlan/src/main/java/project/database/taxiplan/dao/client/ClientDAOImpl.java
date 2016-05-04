package project.database.taxiplan.dao.client;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.database.taxiplan.model.Client;

@Repository("clientDAO")
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistClient(Client client) {
		sessionFactory.getCurrentSession().persist(client);
	}

	@Override
	public Client findClientById(String id) {
		return (Client) sessionFactory.getCurrentSession().get(Client.class, id);
	}

	@Override
	public void updateClient(Client client) {
		sessionFactory.getCurrentSession().update(client);

	}
	@Override
	public void deleteClient(Client client) {
		sessionFactory.getCurrentSession().delete(client);
	}

}
