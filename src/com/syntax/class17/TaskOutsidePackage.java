package com.syntax.class17;

import com.syntax.class18.TaskConstructor;

public class TaskOutsidePackage {


    public static void main(String[] args) {

//     'TaskConstructor(int, int, int)' has private access in 'com.syntax.class18.TaskConstructor
//      TaskConstructor objectPrivate = new TaskConstructor(90, 66, 120);

        TaskConstructor objectPublic = new TaskConstructor("Ingress", "Game");

//     'TaskConstructor(java.lang.String)' is not public in 'com.syntax.class18.TaskConstructor'. Cannot be accessed from outside package
//      TaskConstructor objectDefault = new TaskConstructor("Portal");

//      java: TaskConstructor(java.lang.String,int) has protected access in com.syntax.class18.TaskConstructor
//      TaskConstructor objectProtected = new TaskConstructor("Resonator", 6);
    }

}
