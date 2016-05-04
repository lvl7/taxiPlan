package project.database.taxiplan.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTS")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CLIENT", nullable = false)
	private long idClient;


  @OneToMany(mappedBy="client")
	private Set<Order> orders;


	public Client() {
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long id) {
		this.idClient = id;
	}

  public Set<Order> getOrders() {
		return orders;
	}

	public void setOrder(Set<Order> orders) {
		this.orders = orders;
	}
}
