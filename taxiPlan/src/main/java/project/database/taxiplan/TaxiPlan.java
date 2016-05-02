package project.database.taxiplan;

import org.hibernate.Session;

import project.database.taxiplan.model.Job;
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

		
		
		Transaction transaction = new Transaction();
		transaction.setIdTransaction(123);
//		em.setName("John");
//		em.setAge(35);


		session.save(transaction);

		
		Job job = new Job();
		session.save(job);

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
