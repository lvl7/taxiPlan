package project.database.taxiplan.service.client;

import project.database.taxiplan.model.Client;

public interface ClientService {

	void persistClient(Client client);

	Client findClientById(String id);

	void updateClient(Client client);

	void deleteClient(Client client);
}
