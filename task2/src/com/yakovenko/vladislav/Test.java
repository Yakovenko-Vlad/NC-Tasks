package com.yakovenko.vladislav;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class.getName());
    public static void main(String[] args) {
        PropertyConfigurator.configure("resources/log4j.properties");

        Hobby hobbyFlowers = new Hobby(new char[]{'f', 'l', 'o', 'w', 'e', 'r', 's'}, (byte) 3);
        Hobby hobbyCollectingStamps = new Hobby(new char[]{'s', 't', 'a', 'm', 'p', 's'}, (byte) 20,
                5000, true);
        Hobby hobbyProgramming = new Hobby(new char[]{'p', 'r', 'o', 'g', 'r', 'm', 'm', 'i', 'n', 'g'},
                (byte) 3, 15);

        Hobby hobbyWork = new Hobby();
        hobbyWork.setName(new char[]{'w', 'o', 'r', 'k'});
        /*hobbyWork.setName(new char[]{});
        if(hobbyWork.getName().length == 0)
            logger.warn("Hobby name is not set");*/

        hobbyWork.setHappyWithYourHobby(false);
        hobbyWork.setYears((byte) 1);
        hobbyWork.setMonths((short) 5);
        hobbyWork.setDays(-10);
        hobbyWork.setHours(3);
        hobbyWork.setCreatedThings(1);

        if (hobbyWork.getCreatedThings() < 0 || hobbyWork.getDays() < 0 ||
            hobbyWork.getHours() < 0 || hobbyWork.getYears() < 0 || hobbyWork.getMonths() < 0)
            logger.error("Entered data is not valid");



        System.out.println();
        System.out.println(hobbyFlowers.toString());
        System.out.println(hobbyCollectingStamps.toString());
        System.out.println(hobbyProgramming.toString());
        System.out.println(hobbyWork.toString());


        logger.info("Created hobby: " + hobbyFlowers.toString());
        logger.info("Created hobby: " + hobbyCollectingStamps.toString());
        logger.info("Created hobby: " + hobbyProgramming.toString());
        logger.info("Created hobby: " + hobbyWork.toString());

        Hobby testNullPointer = new Hobby();
        try {
            testNullPointer.toString();
        } catch (Exception e) {
            logger.error("Empty name array -> null.length", e);
        }

    }
}
