package project.database.taxiplan.model;

import java.util.List;
import java.util.Set;

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
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ORDER", nullable = false)
	private long idOrder;

	@Column(name = "EARN")
	private long earn;

	@OneToMany(mappedBy="order")
	private Set<Transaction> transactions;

	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	//TODO note
	//TODO id_client

//
//	@Column(name = "NAME", nullable = false)
//	private String name;
//
//	@Column(name = "AGE", nullable = false)
//	private long age;
//
	public Order() {
	}

	public long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(long id) {
		this.idOrder = id;
	}

	public long getEarn() {
		return earn;
	}

	public void setEarn(long earn) {
		this.earn = earn;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransaction(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

  public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
