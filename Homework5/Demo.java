package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// Book1
		Book book1 = new Book("Don't make me think", "Steve Krung", 2000);
		book1.borrow();
		System.out.println(book1.toString());
		
		
		// Book2
		Book book2 = new Book("Pro Java Programming", "Terrill", 2005);
		book2.returnBack();
		System.out.println(book2.toString());
		
		
		// Book3
		Book book3 = new Book("Programming in Python 3", "Mark Summerfield",2005);
		book3.borrow();
		System.out.println(book3.toString());
		
		// Book4
		Book book4 = new Book("The Clean Coder", "Robert", 2011);
		book4.borrow();
		System.out.println(book4.toString());
		
		// Book5
		Book book5 = new Book("The Art of Agile Development", "James Shore", 2007);
		book5.returnBack();
		System.out.println(book5.toString());
		
		// Book6
		Book book6 = new Book("Head First Design Patterns", "Eric Freeman", 2004);
		book6.returnBack();
		System.out.println(book6.toString());
	
		
		// Book7
		Book book7 = new Book("The Linux Command Line", "Willian", 2009);
		book7.borrow();
		System.out.println(book7.toString());
		
		// 	Book8
		Book book8 = new Book("Code Complete", "Steve", 1993);
		book8.returnBack();
		System.out.println(book8.toString());
		
		// Book9
		Book book9 = new Book("Unit Test patterns", "Gerard Meszaros", 2003);
		book9.returnBack();
		System.out.println(book9.toString());
	
		// Book10
		Book book10 = new Book("The C++ Programming Language", "Bjarne Stroustup", 2013);
		book10.borrow();
		System.out.println(book10.toString());
		
		
		// format
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
	
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println(String.format("%30s %25s %15s %30s", "TITLE","AUTHER","YEAR","STATUS"));
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		for(Book Book: books) {
			System.out.format("%30s %25s %15s %30s", Book.getTitle() , Book.getAuther() , Book.getPublishYear() , Book.isBorrowed());
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}

}