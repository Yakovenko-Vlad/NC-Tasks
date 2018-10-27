package com.vladislav.hobby;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        /*Hobby hobbyFlowers = new Hobby(new char[]{'f', 'l', 'o', 'w', 'e', 'r', 's'}, (byte) 3);
        Hobby hobbyCollectingStamps = new Hobby(new char[]{'s', 't', 'a', 'm', 'p', 's'}, (byte) 20,
                5000, true);
        Hobby hobbyProgramming = new Hobby(new char[]{'p', 'r', 'o', 'g', 'r', 'm', 'm', 'i', 'n', 'g'},
                (byte) 3, 15);*/

        /*Hobby hobby1 = new Football(new char[]{'f', 'o', 'o', 't', 'b', 'a', 'l', 'l'}, (byte) 5, 2);
        Hobby hobby2 = new Football(new char[]{'f', 'o', 'o', 't', 'b', 'a', 'l', 'l'}, (byte) 5, 555, true, 2);
        Hobby hobby3 = new Fishing(new char[]{'f', 'i', 's', 'h', 'i', 'n', 'g'}, (byte) 5, 10);
        Hobby hobby4 = new Fishing(new char[]{'f', 'i', 's', 'h', 'i', 'n', 'g'}, (byte) 5, 10, 34);
        Hobby[] hobbiesArray = {hobby1, hobby2, hobby3, hobby4};*/

        Hobby[] hobbiesArray = {
                new Football(new char[]{'f', 'o', 'o', 't', 'b', 'a', 'l', 'l'}, (byte) 5, 2),
                new Football(new char[]{'f', 'o', 'o', 't', 'b', 'a', 'l', 'l'}, (byte) 5, 555, true, 2),
                new Fishing(new char[]{'f', 'i', 's', 'h', 'i', 'n', 'g'}, (byte) 5, 10),
                new Fishing(new char[]{'f', 'i', 's', 'h', 'i', 'n', 'g'}, (byte) 5, 10, 34)
        };

        for (Hobby h : hobbiesArray) {
            System.out.println(h.tellAboutHobby());
        }
    }
}
