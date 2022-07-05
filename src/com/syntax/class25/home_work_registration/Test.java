package com.syntax.class25.home_work_registration;

public class Test {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("yahoo.com");
        System.out.println("Email : "+registration.getEmail());
        registration.setUserName("syntax13");
        System.out.println("User name : "+registration.getUserName());
        registration.setPassword("batch13");
        System.out.println("Password : "+registration.getPassword());

    }
}
