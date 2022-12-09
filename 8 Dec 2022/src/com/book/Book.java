package com.book;

public class Book {
	
	String bookID,title,category,author;
	float price;
	
	
	public Book(String bookID,String title,String category,String author,float price){
		
		switch (category) {
		case "Science": 
			this.category = "Science";
			break;
		case "Fiction":
			this.category ="Fiction";
			break;
		case "Technology":
			this.category = "Technology";
			break;
		case "Other":
			this.category = "Other";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + category);
		}
		
		//Price cannot be negative
		if(price > 0 ) {
			this.price = price;
		}else {
			this.price = 0;
			System.out.println("Your Book Price is Invalid");
		}
		
		//BookID must be start with B and length will be 4
		if(bookID.startsWith("B")) {
			if(bookID.length() >= 4) {
				this.bookID = bookID;
			}else {
				throw new IllegalArgumentException("Unexpected value in BookId ");
			}
			
		}else {
			throw new IllegalArgumentException("Unexpected value in BookId ");
		}
		
		
	}
}
