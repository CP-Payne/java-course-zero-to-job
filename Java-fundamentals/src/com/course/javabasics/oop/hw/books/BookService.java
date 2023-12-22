package com.course.javabasics.oop.hw.books;

public class BookService {

	public BookService() {
	}

	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		if (author == null || books == null) {
			return new Book[0];
		}

		Book[] filteredBooks = new Book[books.length];

		for (int b = 0; b < books.length; b++) {
			if (books[b].hasAuthor(author)) {
				filteredBooks[b] = books[b];
			}
		}

		filteredBooks = filterNulls(filteredBooks);

		return filteredBooks;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		if (publisher == null || books == null) {
			return new Book[0];
		}
		
		Book[] filteredBooks = new Book[books.length];
		
		if (publisher == null || books == null) {
			return new Book[0];
		}

		for (int b = 0; b < books.length; b++) {
			if (books[b].getPublisher().equals(publisher)) {
				filteredBooks[b] = books[b];
			}
		}

		filteredBooks = filterNulls(filteredBooks);

		return filteredBooks;
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		if (books == null) {
			return new Book[0];
		}
		
		Book[] filteredBooks = new Book[books.length];

		for (int b = 0; b < books.length; b++) {
			if (books[b].getPublishingYear() >= yearFromInclusively) {
				filteredBooks[b] = books[b];
			}
		}

		filteredBooks = filterNulls(filteredBooks);

		return filteredBooks;
	}

	private Book[] filterNulls(Book[] books) {

		int numOfBooks = 0;

		for (Book book : books) {
			if (book != null) {
				numOfBooks++;
			}
		}

		Book[] booksWithoutNulls = new Book[numOfBooks];
		int bookCounter = 0;

		for (Book book : books) {
			if (book != null) {
				booksWithoutNulls[bookCounter++] = book;
			}
		}

		return booksWithoutNulls;
	}

}
