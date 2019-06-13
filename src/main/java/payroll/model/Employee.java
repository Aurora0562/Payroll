package payroll.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String role;

	public Employee() {}

	public Employee(String firstName, String lastName, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public Long getId(){return id;}
	public String getRole(){return role;}
	public void setId(Long id){this.id = id;}
	public void setRole(String role){this.role = role;}


	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public void setName(String name) {
		String[] parts =name.split(" ");
		this.firstName = parts[0];
		this.lastName = parts[1];
	}
}