package com.worldpay.hashmap;

public class Employee {
	 int eno, salary;
	
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desg == null) ? 0 : desg.hashCode());
		result = prime * result + eno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (desg == null) {
			if (other.desg != null)
				return false;
		} else if (!desg.equals(other.desg))
			return false;
		if (eno != other.eno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	String name, desg;

	public Employee(int eno, String name, int salary, String desg) {
		
		this.eno = eno;
		this.salary = salary;
		this.name = name;
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + ", name=" + name + ", desg=" + desg + "]";
	}

}
