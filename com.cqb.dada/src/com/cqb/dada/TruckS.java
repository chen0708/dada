package com.cqb.dada;

public class TruckS extends Car {
	private Integer day;

	public void trucks() {
		int num=5;
		Car truck = new TruckS();
		truck.setName("松花江");
		truck.setRent(400);
		truck.setCargocapacit(4);
		System.out.println(num + "\t" +truck.getName() + "\t" + truck.getRent() + "元/天" + "\t" + truck.getCargocapacit()+"吨");	

	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}
    public void zrent() {
    	Car truck = new TruckS();
    	truck.setRent(400);
		System.out.println("租金为：  "+this.day * truck.getRent());
	}
}