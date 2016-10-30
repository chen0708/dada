package com.cqb.dada;

public class Picard extends Car {
	private Integer day;

	public void picard() {
		int num=3;
		Car picard = new Picard();
		picard.setName("皮卡雪6");
		picard.setRent(450);
		picard.setMannedquantity(4);
		picard.setCargocapacit(2);
		System.out.println(num + "\t" +picard.getName() + "\t" + picard.getRent() + "元/人" + "\t" + picard.getMannedquantity()+"人"+picard.getCargocapacit() + "吨");

	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public void zrent() {
		Car picard = new TruckY();
		picard.setRent(450);
		System.out.println("租金为：  " + this.day * picard.getRent());
	}
}
