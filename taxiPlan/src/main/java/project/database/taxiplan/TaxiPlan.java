package project.database.taxiplan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import org.hibernate.Session;

import project.database.taxiplan.model.Order;
import project.database.taxiplan.model.Transaction;
import project.database.taxiplan.util.HibernateUtil;

public class TaxiPlan {

	public static void main(String[] args) {
		System.out.println("load context");


		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

//		String stringQuery = "select 'drop table '||table_name||' cascade constraints;' from user_tables";
//		Query query = session.createQuery(stringQuery);
//		query.executeUpdate();



		
		Order order1 = new Order();
		order1.setEarn(new Random().nextInt() % 100);
		
		Order order2 = new Order();
			
		session.save(order1);
		session.save(order2);

		Order order = new Order();
		session.save(order);
		

		Transaction transaction = new Transaction();
		transaction.setIdTransaction(123);
		transaction.setOrder(order1);
		
		session.save(transaction);

		transaction = new Transaction();
		transaction.setIdTransaction(123);
		transaction.setOrder(order1);

		session.save(transaction);

		transaction = new Transaction();
		transaction.setIdTransaction(123);
		transaction.setOrder(order2);

		session.save(transaction);
		
		transaction = new Transaction();
		transaction.setIdTransaction(123);

		session.save(transaction);

		
		session.getTransaction().commit();
		session.close();

//		EmployeeService emService = (EmployeeService) context.getBean("employeeService");
//		emService.persistEmployee(em);
//		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
//		em.setAge(32);
//		emService.updateEmployee(em);
//		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
////		emService.deleteEmployee(em);
//		context.close();
	}

}
