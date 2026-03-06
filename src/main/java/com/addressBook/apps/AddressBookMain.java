package com.addressBook.apps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.addressBook.apps.model.Contact;

public class AddressBookMain {
	//Helps to add Multiple persons in the address Book app
    private static List<Contact> contacts = new ArrayList<>();
    
    //Add Contact
    public static void add(String s) {
    	String[] arr = s.split(":");
    	if(arr.length!=8) {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    	contacts.add(new Contact(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]), arr[6], arr[7]));
    }
    
    //Update Contact
    public static void update(String name ,String s){
    	String arr[] = s.split(":");
    	if(arr.length != 8) {
    		throw new IllegalArgumentException("Invalid Input");
    	}
    	for(Contact c : contacts) {
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
    
    //Delete Contact
    public static void delete(String name) {
    	for(Contact c: contacts) {
    		if(name.equalsIgnoreCase(c.getFirstName()+" "+c.getLastName())) {
    			System.out.println("Deleted contact : "+c.toString());
    			contacts.remove(c);
    			return;
    		}
    	}
    	System.out.println("User Not Found");
    }
    
    //Main
    public static void main(String[] args ) throws IOException{
    	add("lucky:pal:berkhera:bhopal:MP:12345:83056144536:pallucky936@gmail.com");
    	add("Himesh:kurmi:baisa:sagar:MP:462022:89564122121:himeshkurmi@gmail.com");
    	add("nageshwar:patel:maiyar:katni:MP:11111:7845129654:nageshwar@gmail.com");
    	for(Contact c : contacts) {
    		System.out.println(c.toString());
    	}
    	
    	update("himesh kurmi","Himesh:kurmi:Anand Nager:Bhopal:MP:462022:89564122121:himeshkurmi@gmail.com ");
    	System.out.println("\n");
    	for(Contact c: contacts) {
    		System.out.println(c);
    	}
    	
    	System.out.println("\n");
    	delete("nageshwar patel");
    	System.out.println("\n");
    	for(Contact c: contacts) {
    		System.out.println(c);
    	}
    	
	}
}