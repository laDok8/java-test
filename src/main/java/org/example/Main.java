package org.example;
//import groovy.util.logging.Log4j;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        File dir = null;
        int random = (int) (Math.random() * 2);
        //if(random == 0) {
        //    dir = new File("test");
        //}
        createDir(dir);
        System.out.printf("random = %d", random);
    }


    public static void createDir(File dir) {
        if (dir != null || !dir.exists()) // BAD
        //if (dir != null && !dir.exists()) // GOOD
            dir.mkdir();
    }
}
