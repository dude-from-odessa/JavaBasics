package com.syntax.class18;

public class TaskConstructor {

    // Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class:
    // 1 - inside same class;
    // 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    private int i;
    private int x;
    private int y;
    private int level;
    private String name;
    private String type;
    private String address;
    private String resonator;

    private TaskConstructor(int i, int x, int y) {
        this.i = i;
        this.x = x;
        this.y = y;
        System.out.println("It is private position : " + "X = " + i + "; Y = " + x + "; Z = " + y + ";");
    }

    public TaskConstructor(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("It is public name : " + name + "; type : " + type);
    }

    TaskConstructor(String address) {
        this.address = address;
        StringBuilder reversed = new StringBuilder(address);
        System.out.println("It is default reversed address : " + (reversed.reverse().toString()));
    }

    protected TaskConstructor(String resonator, int level) {

        this.resonator = resonator;
        this.level = level;
        System.out.println("It is protected usage use of : " + resonator + ", with level " + level);

    }

    public static void main(String[] args) {

        TaskConstructor objectPrivate = new TaskConstructor(90, 66, 120);

        TaskConstructor objectPublic = new TaskConstructor("Ingress", "Game");

        TaskConstructor objectDefault = new TaskConstructor("Portal");

        TaskConstructor objectProtected = new TaskConstructor("Resonator", 6);

    }
}
