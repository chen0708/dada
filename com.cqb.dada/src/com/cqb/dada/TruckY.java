package com.cqb.dada;

public class TruckY extends Car {
	private Integer day;

	public void trucky() {
		int num=6;
		Car truck = new TruckY();
		truck.setName("依柯维");
		truck.setRent(1000);
		truck.setCargocapacit(20);
		System.out.println(num + "\t" +truck.getName() + "\t" + truck.getRent() + "元/天" + "\t" + truck.getCargocapacit() + "吨");

	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public void zrent() {
		Car truck = new TruckY();
		truck.setRent(1000);
		System.out.println("租金为：  " + this.day * truck.getRent());
	}
}