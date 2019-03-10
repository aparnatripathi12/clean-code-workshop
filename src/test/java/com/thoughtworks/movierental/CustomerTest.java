package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
    private Customer customer;
    @Before
    public void setup(){
        customer = new Customer( "Dhrupad");
        customer.addRental(new Rental(new Movie("Godfather", Movie.REGULAR ),3));
        customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS ),2));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE ),4));
    }
    @Test
    public void shouldGenerateTextStatement(){
        Assert.assertEquals("Rental Record for Dhrupad\n" +
                "\tGodfather\t3.5\n" +
                "\tToy Story\t1.5\n" +
                "\tAvengers\t12.0\n" +
                "Amount owed is 17.0\n" +
                "You earned 4 frequent renter points",customer.statement());
    }
    @Test
    public void shouldGenerateHtmlStatement(){
        Assert.assertEquals("<h1>Rental Record for <b>Dhrupad</b></h1></br>" +
                "Godfather 3.5</br>" +
                "Toy Story 1.5</br>" +
                "Avengers 12.0</br>" +
                "Amount owed is <b>17.0</b></br>" +
                "You earned <b>4</b> frequent renter points",customer.htmlStatement());
    }
}