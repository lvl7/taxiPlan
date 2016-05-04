package project.database.taxiplan.dao.client;

import project.database.taxiplan.model.Client;

public interface ClientDAO {

		  void persistClient(Client client);

		  Client findClientById(String id);

		  void updateClient(Client client);

		  void deleteClient(Client client);

}
