package se.yrgo.library.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se.yrgo.library.utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

    //VG
    @Test
    public void testDueDate() {
        Customer customer1 = new Customer
                ("Mr", "Peter", "Pansar",
                        "Storavägen 20", "0731234567",
                        "pansarpete@gmail.com", 132, GenderType.MALE);
		Book book1 = new Book(12, "Java för idioter", "Benny Bredsladd",
				"1234567890123", "programming", 142);

		Loan loan1 = new Loan(123, customer1, book1);

		LocalDate returnDate = LocalDate.now().plusDays(14);

		assertEquals(returnDate, loan1.getDueDate());
    }
}