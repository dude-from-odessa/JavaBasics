package com.syntax.class24;

public abstract class File {

    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */

    abstract void open();

    void edit() {
        System.out.println("Editing of file");
    }

    void close() {
        System.out.println("Closing of file");
    }

}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Java File opened with notepad++");
    }
}

class WordFile extends File {
    @Override
    void open() {
        System.out.println("Word File opened with Microsoft Word");
    }
}

class PdfFile extends File {
    @Override
    void open() {
        System.out.println("PDF file opened with Acrobat Reader");
    }
}

class Test {

    public static void main(String[] args) {

        File[] object = {new JavaFile(), new WordFile(), new PdfFile()};

        for(File test : object){
            test.open();
            test.edit();
            test.close();
        }

    }

}
