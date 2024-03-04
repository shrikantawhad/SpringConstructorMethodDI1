package com.ncs.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pinCode;

	

	public Address(int houseNo, String city, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseNo + ", " + city + " - " + pinCode;
	}
}
