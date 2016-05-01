package project.database.taxiplan;

import org.hibernate.Session;

import project.database.taxiplan.model.Employee;
import project.database.taxiplan.util.HibernateUtil;

public class TaxiPlan {

	public static void main(String[] args) {
		System.out.println("load context");

			
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Employee em = new Employee();
		em.setId("123");
		em.setName("John");
		em.setAge(35);

		
		session.save(em);
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
