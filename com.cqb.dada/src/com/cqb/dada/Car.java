package com.cqb.dada;

public class Car {
	private String name;
	private double rent;
	private Integer Mannedquantity;
	private Integer Cargocapacit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public Integer getMannedquantity() {
		return Mannedquantity;
	}
	public void setMannedquantity(Integer mannedquantity) {
		Mannedquantity = mannedquantity;
	}
	
	public Integer getCargocapacit() {
		return Cargocapacit;
	}
	public void setCargocapacit(Integer cargocapacit) {
		Cargocapacit = cargocapacit;
	}
	/*@Override
	public String toString() {
		return "Car [name=" + name + ", rent=" + rent + ", Mannedquantity=" + Mannedquantity + ", Cargocapacit="
				+ Cargocapacit + "]";
	}*/
	/*public Car(String name, Integer rent, Integer mannedquantity, Integer cargocapacit) {
		super();
		this.name = name;
		this.rent = rent;
		Mannedquantity = mannedquantity;
		Cargocapacit = cargocapacit;
	}
	*/
}
