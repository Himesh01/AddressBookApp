package com.addressBook.apps.model;

import java.util.Objects;
import java.sql.Date;
import java.time.LocalDate;

public class Contact {
	private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNo;
    private String email;
    private LocalDate dateAdded;
    
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
		this.dateAdded =LocalDate.now();

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
	 public LocalDate getDateAdded() {
		 return dateAdded;
	 }
	 public void setDate(Date date) {
		 this.dateAdded = LocalDate.parse(date.toString());
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
		 
		 return firstName.equalsIgnoreCase(c.firstName)
		            && lastName.equalsIgnoreCase(c.lastName)
		            && Objects.equals(address, c.address)
		            && Objects.equals(city, c.city)
		            && Objects.equals(state, c.state)
		            && Objects.equals(zip, c.zip)
		            && Objects.equals(phoneNo, c.phoneNo)
		            && Objects.equals(email, c.email);
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
		}
	}