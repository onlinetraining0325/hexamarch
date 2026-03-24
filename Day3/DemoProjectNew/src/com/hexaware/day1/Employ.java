package com.hexaware.day1;

import java.util.Objects;

public class Employ {

	int empno;
	String name;
	double basic;
	
	public Employ() {
		
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(basic, empno, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employ other = (Employ) obj;
		return Double.doubleToLongBits(basic) == Double.doubleToLongBits(other.basic) && empno == other.empno
				&& Objects.equals(name, other.name);
	}



	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
	
}
