package com.cqb.dada;

public class PassengercarA extends Car {
	private Integer day;
	public void passengercarA() {
		int num=1;
		Car passengercar = new PassengercarA();
		passengercar.setName("奥迪A4");
		passengercar.setRent(500);
	passengercar.setMannedquantity(4);
		//passengercar.setCargocapacit(4);
		System.out.println(num + "\t" +passengercar.getName() + "\t" + passengercar.getRent() + "元/天" + "\t" + passengercar.getMannedquantity()+"人");

	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public void zrent() {
		Car truck = new TruckY();
		truck.setRent(450);
		System.out.println("租金为：  " + this.day * truck.getRent());
	}
}

