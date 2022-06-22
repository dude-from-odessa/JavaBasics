package com.syntax.class21;

public class Task1 {

/*
Write program: userClass  that has a constructor that
initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable
and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */
}

    class UserClass {

        String name;
        String mobileNumber;

        public UserClass(String name, String mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;
        }
    }
    class UserInfo extends UserClass {
        String userAddress;
        /*
        here is no default constructor available in 'com.syntax.class21.Task1.UserClass
        we need matching constructor !
         */
        UserInfo(String name, String mobileNumber,String userAddress){
            // we should to have variables at least one, even we can have empty and match it
            // to match but at least one we can add more.
            // java is creating by default constructor without parameters if parent class will have it
            // we will not have errors.
        //  this.userAddress=userAddress; we can't write any line before the super()line
            super(name, mobileNumber);
            this.userAddress=userAddress;
        }
        void printInfo(){
            System.out.println("Name "+name+" Mobile Number "+mobileNumber+" User address "+userAddress);
        }
    }

