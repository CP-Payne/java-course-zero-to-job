package com.course.javabasics.oop.hw.books;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private Author[] authors;
	private Publisher publisher;
	private int publishingYear;
	private int amountOfPages;
	private BigDecimal price;
	private CoverType coverType;

	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType coverType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}
	
	public Author[] getAuthors() {
		return authors;
	}	
	

	public int getPublishingYear() {
		return publishingYear;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(amountOfPages, coverType, id, name, price,
				publisher, publishingYear);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages
				&& Arrays.equals(authors, other.authors) && coverType == other.coverType
				&& id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price)
				&& Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors="
				+ Arrays.toString(authors) + ", publisher=" + publisher
				+ ", publishingYear=" + publishingYear + ", amountOfPages="
				+ amountOfPages + ", price=" + price + ", coverType=" + coverType + "]";
	}

	public boolean hasAuthor(Author author) {
		boolean authorFound = false;

		for (Author a : this.authors) {
			if (a.equals(author)) {
				authorFound = true;
				break;
			}
		}

		return authorFound;
	}

}
