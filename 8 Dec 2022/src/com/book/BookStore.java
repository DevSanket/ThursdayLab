package com.book;

import java.util.ArrayList;

public class BookStore  {
	

//	Book allBooks[];
	private ArrayList<Book> allBooks = new ArrayList<Book>();
	
//	public BookStore(Book book){
//		allBooks.add(book);
//	}
	
	//add Book
	public void AddBook(Book book) {
		allBooks.add(book);
	}
	
	//search By title
	public void SearchByTitle(String title) {
		for(Book b: allBooks) {
			if(b.title == title) {
				System.out.println("We found Result - ");
				System.out.println("Book title is "+b.title);
				System.out.println("Book Author is "+b.author);
				System.out.println("Book ID is "+b.bookID);
				System.out.println("Book Category is "+b.category);
				System.out.println("Book Price is "+b.price);
				return;
			}
		}
		System.out.println("We Didn't get the result");
	}
	
	//search By author
	public void SearchByAuthor(String author) {
		for(Book b:allBooks) {
			if(b.author == author) {
				System.out.println("We Found the Result - ");
				System.out.println("Book title is "+b.title);
				System.out.println("Book Author is "+b.author);
				System.out.println("Book ID is "+b.bookID);
				System.out.println("Book Category is "+b.category);
				System.out.println("Book Price is "+b.price);
				return;
			}
		}
		System.out.println("We Didn't get the result");
	}
	
	//display all
	public void AllBooksData() {
		if(allBooks.size() < 1) {
			System.out.println("No Book in Book Store");
//			return;
		}else {
			for(Book b:allBooks) {
					System.out.println("Book title is "+b.title);
					System.out.println("Book Author is "+b.author);
					System.out.println("Book ID is "+b.bookID);
					System.out.println("Book Category is "+b.category);
					System.out.println("Book Price is "+b.price);
				
				
			}
		}
		
		
	}

}
