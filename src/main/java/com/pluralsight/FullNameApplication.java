package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firsName  = myScanner.nextLine();

        System.out.println("Middle name:  ");
        String middleName = myScanner.nextLine();

        System.out.println("Last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine();

        System.out.println("Full name: " + firsName +" "+ middleName +"." + " " + lastName + "," + " " + suffix);


    }
}
