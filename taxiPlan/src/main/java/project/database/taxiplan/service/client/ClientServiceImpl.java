package project.database.taxiplan.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.database.taxiplan.dao.client.ClientDAO;
import project.database.taxiplan.model.Client;

@Service("clientService")
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientDAO clientDAO;

	@Override
	@Transactional
	public void persistClient(Client client) {
		clientDAO.persistClient(client);

	}

	@Override
	@Transactional
	public void updateClient(Client client) {
		clientDAO.updateClient(client);

	}
	@Override
	@Transactional
	public Client findClientById(String id) {
		return clientDAO.findClientById(id);
	}

	@Override
	@Transactional
	public void deleteClient(Client client) {
		clientDAO.deleteClient(client);

	}

}
