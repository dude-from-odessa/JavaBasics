package com.syntax.class22.home_work;

public class Main {

    public static void main(String[] args) {

        Degree student1 = new Degree();
        Bachelors student2 = new Bachelors();
        Masters student3 = new Masters();
        student1.getPrerequisite();
        student2.getPrerequisite();
        student3.getPrerequisite();
        System.out.println("--------------------------");
        CreditCard card1 = new CreditCard();
        Visa card2 = new Visa();
        AX card3 = new AX();
        System.out.println(card1.interest(1000));
        System.out.println(card2.interest(1000));
        System.out.println(card3.interest(1000));

    }
}
