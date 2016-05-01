package project.database.taxiplan.dao;

import project.database.taxiplan.model.Employee;

public interface EmployeeDAO {
	
		  void persistEmployee(Employee employee);
		  
		  Employee findEmployeeById(String id);
		  
		  void updateEmployee(Employee employee);
		  
		  void deleteEmployee(Employee employee);
		  
}
