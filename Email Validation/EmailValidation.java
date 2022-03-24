package com.simplilearn.demo;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
 
        //list of emails in the system
        
        emailID.add("neil@gmail.com");
        emailID.add("virat@gmail.com");
        emailID.add("rohit@gmail.com");
        emailID.add("rishabh@gmail.com");
        emailID.add("jasprit@gmail.com");
        emailID.add("shreyas@gmail.com");
        emailID.add("hardik@gmail.com");
       
        //criteria for user inputted email
        
        String searchElement;
        System.out.print("E-mail: ");
        Scanner scanner = new Scanner(System.in);
        searchElement = scanner.nextLine();
        String regex = "^(.+)@(.+)$";
        
        //matching if user inputted email matches with email present in the system 
        
        Matcher matcher = Pattern.compile(regex).matcher(searchElement);
        
        if (matcher.matches() && emailID.stream().anyMatch(mail -> mail.equals(searchElement))) {
            System.out.println("Congratulations " + searchElement + " is present");
        } 
        else {
            System.out.println("Sorry " + searchElement + " is not present");
        }
           
     }

  }