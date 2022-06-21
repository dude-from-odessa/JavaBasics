package com.syntax.class20;

public class UserClass {

    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */

    String name;
    long mobile;

    UserClass(String name, long mobile) {

        this.name = name;
        this.mobile = mobile;

    }
}

class UserInfo extends UserClass {

    String address;

    UserInfo(String name, long mobile, String address) {
        super(name, mobile);
        this.address = address;
    }

    void userDetails() {
        System.out.println(name + " " + mobile + " " + address);
    }
}

class TaskTester {

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("Gennadiy", 380934030809L, "Odessa / Ukraine");

        userInfo.userDetails();

    }
}









