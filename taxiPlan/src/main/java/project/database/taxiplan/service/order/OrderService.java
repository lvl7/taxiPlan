package project.database.taxiplan.service.order;

import project.database.taxiplan.model.Order;

public interface OrderService {

	void persistOrder(Order order);

	Order findOrderById(String id);

	void updateOrder(Order order);

	void deleteOrder(Order order);
}
