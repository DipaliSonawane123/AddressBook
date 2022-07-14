/*
Refactor to add multiple
Address Book to the
System. Each Address Book
has a unique Name - Use Console to add new Address Book - Maintain Dictionary of Address Book Name to
 */
package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

    public static Scanner scannerObject = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("---------- Welcome To Address Book Program!! ----------");
            AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.operationDirectory();
            AddressBook addressBook =new AddressBook();
           addressBook.operation();



        }

    }















