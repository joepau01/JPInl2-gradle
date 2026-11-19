package se.yrgo.library.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() throws BookNotFoundException {
		assertSame(book1, bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException{
		assertSame(book1, bc.findBook("learning java"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertEquals(book1, bc.findBook("	Learning Java	"));
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() {
		assertThrows(BookNotFoundException.class, () -> bc.findBook("Java Test Book"));
	}

}
