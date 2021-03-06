package project.database.taxiplan.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TRANSACTION", nullable = false)
	private long idTransaction;


	@ManyToOne
	@JoinColumn(name="ID_ORDER")
	private Order order;
	
	//TODO idJob
	//TODO date
	//TODO type
	//TODO idTaxi
	//TODO position
	//TODO state
	
//	
//	@Column(name = "NAME", nullable = false)
//	private String name;
//
//	@Column(name = "AGE", nullable = false)
//	private long age;
//	
//	public Employee() {
//	}

	public long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(long id) {
		this.idTransaction = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public long getAge() {
//		return age;
//	}
//
//	public void setAge(long age) {
//		this.age = age;
//	}

}
