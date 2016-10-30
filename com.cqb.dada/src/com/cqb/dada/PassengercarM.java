package com.cqb.dada;

public class PassengercarM extends Car {
	private Integer day;
	public void passengercarM() {
		int num=2;
		Car passengercar = new PassengercarM();
		passengercar.setName("马自达6");
		passengercar.setRent(400);
		passengercar.setMannedquantity(20);
		//passengercar.setCargocapacit(2);
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

