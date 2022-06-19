package com.syntax.class19;

public class Teacher {

    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
Test all 4 classes
     */

    String schoolName = "School 72";
    boolean teacherLicence = true;

    void teaching() {
        System.out.println("Teacher is teaching students");
    }
    void walk() {
        System.out.println("Teacher is walking");
    }
    void stand() {
        System.out.println("Teacher is standing");
    }

}

class MathTeacher extends Teacher {
    String name = "Sara";
    char gender = 'F';
    String knowledge = "Math";

    public void teachingMath() {
        System.out.println("Teacher is teaching mathematics");
    }

    public void printInfo() {
        System.out.println("Teacher "+name+" of "+knowledge+" is "+gender+" gender.");
    }
}

class ChemistryTeacher extends Teacher {
    String name = "Bob";
    char gender = 'M';

    String knowledge = "Chemistry";

    public void teachingChemistry() {
        System.out.println("Teacher is teaching chemistry");
    }
    public void printInfo() {
        System.out.println("Teacher "+name+" of "+knowledge+" is "+gender+" gender.");
    }
}

class PianoTeacher extends Teacher {
    String name = "Rob";
    char gender = 'F';
    String knowledge = "Piano";

    public void teachingPiano() {
        System.out.println("Teacher is teaching piano");
    }
    public void printInfo() {
        System.out.println("Teacher "+name+" of "+knowledge+" is "+gender+" gender.");
    }
}

class TestTeacher {

    public static void main(String[] args) {

        MathTeacher teacherMath = new MathTeacher();
        teacherMath.walk();
        teacherMath.stand();
        teacherMath.teaching();
        teacherMath.printInfo();
        teacherMath.teachingMath();

        System.out.println("------------------------------------------");

        ChemistryTeacher teacherChem = new ChemistryTeacher();
        teacherChem.walk();
        teacherChem.stand();
        teacherChem.teaching();
        teacherChem.printInfo();
        teacherChem.teachingChemistry();

        System.out.println("------------------------------------------");

        PianoTeacher teacherPiano = new PianoTeacher();
        teacherPiano.walk();
        teacherPiano.stand();
        teacherPiano.teaching();
        teacherPiano.printInfo();
        teacherPiano.teachingPiano();
    }
}