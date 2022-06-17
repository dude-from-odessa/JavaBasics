package com.syntax.class18;

public class TaskOutsideClass {

    public static void main(String[] args) {

        //    TaskConstructor objectPrivate = new TaskConstructor(90, 66, 120);
        //   'TaskConstructor(int, int, int)' has private access in 'com.syntax.class18.TaskConstructor'

              TaskConstructor objectPublic = new TaskConstructor("Ingress", "Game");

              TaskConstructor objectDefault = new TaskConstructor("Portal");

              TaskConstructor objectProtected = new TaskConstructor("Resonator", 6);

    }
}
