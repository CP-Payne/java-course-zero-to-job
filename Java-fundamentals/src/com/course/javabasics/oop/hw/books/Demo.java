package com.course.javabasics.oop.hw.books;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		

		
		
		Book[] books = new Book[] {
				new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

				new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

				new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),


				new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };
		

		// FILTERING BY AUTHOR
//		Author author1 = new Author(1, "Jon", "Johnson");
//		Author author2 = new Author(2, "William", "Wilson");	
//		Book[] filteredBooksByAuthor = bookService.filterBooksByAuthor(author2, books);
//		
//		for (Book book: filteredBooksByAuthor) {
//			System.out.println(book);
//		}
		
		
		// FILTERING BY PUBLISHER

//		Publisher publisher = new Publisher(2, "Publisher_2");
//		
//		Book[] filteredBooksByPublisher = bookService.filterBooksByPublisher(publisher, books);
//		
//		for (Book book: filteredBooksByPublisher) {
//			System.out.println(book);
//		}
		
		
		// FILTERING BY PUBLISHING YEAR

//		int year = 1992;
//		
//		Book[] filteredBooksAfterSpecificYear = bookService.filterBooksAfterSpecifiedYear(year, books);
//		
//		for (Book book: filteredBooksAfterSpecificYear) {
//			System.out.println(book);
//		}	
		
		System.out.println(Arrays.toString(
				bookService.filterBooksByAuthor(new Author(1, "Jon", "Johnson"), books)));
		
//		System.out.println(Arrays.toString(
//				bookService.filterBooksByAuthor(null, books)));
		
		System.out.println(Arrays.toString(
				bookService.filterBooksByPublisher(new Publisher(3, "Publisher_3"), books)));
		
		System.out.println(Arrays.toString(
				bookService.filterBooksAfterSpecifiedYear(1992, books)));


	}

}
