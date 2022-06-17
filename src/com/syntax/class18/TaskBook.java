package com.syntax.class18;

public class TaskBook {

    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    private String name;
    private String department;
    private String format;
    private String author;
    private String language;
    private int printLength;
    private double weight;
    private double height;
    private double width;
    private double depth;

    public TaskBook(String name, String department, String format, String author, String language) {

        this.name = name;
        this.department = department;
        this.format = format;
        this.author = author;
        this.language = language;
    }

    public TaskBook(int printLength, double weight, double height, double width, double depth) {

        this.printLength = printLength;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void printInfo() {

        System.out.println("Book name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Book format : " + format);
        System.out.println("Author : " + author);
        System.out.println("Language : " + language);
    }

    public void printTech() {

        System.out.println("Book print length : " + printLength + " pages");
        System.out.println("Weight : " + weight + " ounces");
        System.out.println("Book size : " + height + " x " + width + " x " + depth + " inches");
    }

    public static void main(String[] args) {

        TaskBook bookId1 = new TaskBook("1984", "Dystopian Fiction", "Paperback", "George Orwell", "English");
        TaskBook bookId1Tech = new TaskBook(282, 9.1, 8, 0.71, 5);
        bookId1.printInfo();
        bookId1Tech.printTech();
        System.out.println("-------------------------------------------------------------------");
        TaskBook bookId2 = new TaskBook("A Time to Love and a Time to Die: A Novel", "Military Historical Fiction", "Paperback", "Erich Maria Remarque", "English");
        TaskBook bookId2Tech = new TaskBook(432, 13.6, 8.24, 0.93, 0.93);
        bookId2.printInfo();
        bookId2Tech.printTech();
    }
}
