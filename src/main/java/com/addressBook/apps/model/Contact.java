package com.addressBook.apps.model;

import java.util.Objects;

public class Contact {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNo;
    private String email;
    public Contact(String firstName, String lastName, String address, String city, String state, String arr,
    		String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = arr;
		this.phoneNo = phoneNo;
		this.email = email;
	 }
    
	 public Contact() {
		// TODO Auto-generated constructor stub
	}

	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 this.city = city;
	 }
	 public String getState() {
		 return state;
	 }
	 public void setState(String state) {
		 this.state = state;
	 }
	 public String getZip() {
		 return zip;
	 }
	 public void setZip(String i) {
		 this.zip = i;
	 }
	 public String getPhoneNo() {
		 return phoneNo;
	 }
	 public void setPhoneNo(String phoneNo) {
		 this.phoneNo = phoneNo;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 @Override
	 public String toString() {
		 return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	 }
	 @Override
	 
	 public boolean equals(Object obj) {
		 if(this == obj) return true;
		 if(obj==null || getClass()!=obj.getClass()) return false;
			
		 Contact c = (Contact) obj;
		 
		 return firstName.equalsIgnoreCase(c.getFirstName())
				 && lastName.equalsIgnoreCase(c.getLastName());
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
		}
	}