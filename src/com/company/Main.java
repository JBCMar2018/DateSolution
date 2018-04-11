package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        String theDate="";
        LocalDate returnDate = null;
        DateTimeFormatter shortDateForamat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Enter your date (MM/dd/yyyy)");
        theDate = sc.nextLine();
        returnDate = LocalDate.parse(theDate,shortDateForamat);
        System.out.println("You entered "+returnDate);
        System.out.println("The day of the week: "+returnDate.getDayOfWeek().toString());
        System.out.println("The month of the year for this date is:"+returnDate.getMonth());
        String futurepast = returnDate.isAfter(LocalDate.now())?"future":"past";

/*
The ternary operator follows this format
        if(returnDate.isAfter(LocalDate.now()))
            futurepast = "future";
        else
            futurepast = "past";
*/

        System.out.println("This is a "+(returnDate.isAfter(LocalDate.now())?"future":"past")+" date");
        

    }
}
