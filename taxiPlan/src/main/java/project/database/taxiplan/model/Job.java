package project.database.taxiplan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JOBS")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_JOB", nullable = false)
	private long idJob;

	//TODO earn
	//TODO note
	//TODO id_client

//
//	@Column(name = "NAME", nullable = false)
//	private String name;
//
//	@Column(name = "AGE", nullable = false)
//	private long age;
//
//	public Employee() {
//	}

	public long getIdJob() {
		return idJob;
	}

	public void setIdJob(long id) {
		this.idJob = id;
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
