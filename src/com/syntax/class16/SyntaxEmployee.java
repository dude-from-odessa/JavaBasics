package com.syntax.class16;

public class SyntaxEmployee {

    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the object
     */

    int empID;
    double salary;
    static String ceo = "Sumair";

    void info() {
        System.out.println("Employer with ID - "+empID+" has salary - "+salary+" and his CEO is "+ceo);
    }

    public static void main(String[] args) {

        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID=123;
        employee1.salary=120000;
        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID=124;
        employee2.salary=125000;
        employee1.info();
        employee2.info();

    }

}
