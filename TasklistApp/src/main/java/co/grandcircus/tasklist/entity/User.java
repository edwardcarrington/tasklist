package co.grandcircus.tasklist.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String emailAddress;
	private String password;
	@OneToMany(mappedBy = "user")
	List<Tasklist> tasks;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String emailAddress, String password, List<Tasklist> tasks) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.password = password;
		this.tasks = tasks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Tasklist> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasklist> tasks) {
		this.tasks = tasks;
	}

}
