package se.yrgo.library.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book b1 = new Book
				(3, "Big Java", "Incontinentia Buttocks", "", "", 130);
		Book b4 = new Book
				(3, "Big Java", "Incontinentia Buttocks", "", "", 130);

		assertEquals(b1, b4);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book b1 = new Book
				(3, "Big Java", "Incontinentia Buttocks", "", "", 130);
		Book b4 = new Book
				(2, "Big Java", "Incontinentia Buttocks", "", "", 130);

		assertNotEquals(b1, b4);
	}

}
