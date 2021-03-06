package project.database.taxiplan.dao.order;

import project.database.taxiplan.model.Order;

public interface OrderDAO {

		  void persistOrder(Order order);

		  Order findOrderById(String id);

		  void updateOrder(Order order);

		  void deleteOrder(Order order);

}
