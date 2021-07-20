package com.JDBC.EmpAddress.Entity;

public class Address {
int addressId;
String address;

public Address(String address) {
	super();
//	this.addressId = addressId;
	this.address = address;
}

public Address() {
	super();
}

//public int getAddressId() {
//	return addressId;
//}
//public void setAddressId(int addressId) {
//	this.addressId = addressId;
//}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}



}
