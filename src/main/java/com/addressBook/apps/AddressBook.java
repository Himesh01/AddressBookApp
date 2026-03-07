package com.addressBook.apps;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import com.addressBook.apps.model.Contact;

public class AddressBook {
	private List<Contact> contacts = new ArrayList<>();
	//Helps to add multiple person in the Address book App
	
	public void addContact(Contact c) {
		boolean exists = contacts.stream().anyMatch(contact	-> contact.getFirstName().equalsIgnoreCase(c.getFirstName())
				&& contact.getLastName().equalsIgnoreCase(c.getLastName()));
		
		if(exists) {
			System.out.println("Duplicate Contact! Person already exists.");
			return;
		}
		contacts.add(c);
		System.out.println("Contact added successfully");
	}
	
	public void displayContact() {
		for(Contact c: contacts) {
			System.out.println(c);
		}
	}
	public void update(String name, String s) {
		String arr[] = s.split(":");
		if(arr.length!=8) {
			throw new IllegalArgumentException("Invalid Input");
		}
		for(Contact c:contacts) {
			if(name.equalsIgnoreCase(c.getFirstName()+" "+c.getLastName())) {
				c.setFirstName(arr[0]);
				c.setLastName(arr[1]);
				c.setAddress(arr[2]);
				c.setCity(arr[3]);
				c.setState(arr[4]);
				c.setZip(Integer.parseInt(arr[5]));
				c.setPhoneNo(arr[6]);
				c.setEmail(arr[7]);
				return;
			}
		}
		System.out.println("User not found");		
	}
	
	public void deleteContact(String name) {
		for(Contact c: contacts) {
			if(name.equalsIgnoreCase(c.getFirstName()+" "+c.getLastName())) {
				System.out.println("Deleted contact: "+c.toString());
				contacts.remove(c);
				return;
			}
		}
		System.out.println("User not found");
	}
	
	public List<Contact> searchContactByCity(String city){
		List<Contact> ans = contacts.stream().filter(c->c.getCity().equalsIgnoreCase(city)).toList();
		return ans;
	}
	public List<Contact> searchContactByState(String state){
		return contacts.stream().filter(c->c.getState().equalsIgnoreCase(state)).toList();
	}
	public Map<String, List<Contact>> viewContactByCity(){
		return contacts.stream().collect(Collectors.groupingBy(c->c.getCity(), Collectors.toList()));
	}
	public Map<String, List<Contact>> viewContactByState(){
		return contacts.stream().collect(Collectors.groupingBy(c->c.getState(), Collectors.toList()));
	}
}