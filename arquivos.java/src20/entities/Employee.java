package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		//pode-se ordenar tambem por salario de forma crescente ou decrescente utilizando o (-).
		//return salary.compareTo(other.getSalary());
		//return -salary.compareTo(other.getSalary());
		
		return name.compareTo(other.getName());
	}
}
