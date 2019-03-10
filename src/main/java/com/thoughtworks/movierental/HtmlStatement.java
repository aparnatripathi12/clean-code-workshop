package com.thoughtworks.movierental;

class HtmlStatement {
  public String display(String name , Rentals rentals) {
    String result = "<h1>Rental Record for <b>" + name + "</b></h1></br>";
    for (Rental each : rentals) {
      //show figures for this rental
      result +=  each.getMovie().getTitle() + " "+
              String.valueOf(each.amount()) + "</br>";

    }

    //add footer lines result
    result += "Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b></br>";
    result += "You earned <b>" + String.valueOf(rentals.totalFrequentRentalPoints())
            + "</b> frequent renter points";
    return result;
  }
}
