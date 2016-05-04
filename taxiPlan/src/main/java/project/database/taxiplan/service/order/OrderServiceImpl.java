package project.database.taxiplan.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.database.taxiplan.dao.order.OrderDAO;
import project.database.taxiplan.model.Order;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderDAO orderDAO;

	@Override
	@Transactional
	public void persistOrder(Order order) {
		orderDAO.persistOrder(order);

	}

	@Override
	@Transactional
	public void updateOrder(Order order) {
		orderDAO.updateOrder(order);

	}
	@Override
	@Transactional
	public Order findOrderById(String id) {
		return orderDAO.findOrderById(id);
	}

	@Override
	@Transactional
	public void deleteOrder(Order order) {
		orderDAO.deleteOrder(order);

	}

}
