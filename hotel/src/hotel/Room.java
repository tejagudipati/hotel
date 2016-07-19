package hotel;

import java.lang.reflect.Array;

public class Room {
	private String name;
	private double price;
	int quantity;
	boolean availability;
	
Array[][] room=new Array[5][5];

public Room(String name, double price, int quantity, boolean availability) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.availability = availability;
	
}

public void display(){
	System.out.println("Hotel Name: "+name);
	System.out.println("Hotel price: "+1000);
	
	
	
}

	


	
}

