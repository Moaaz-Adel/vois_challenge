package ui.helpers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Helpers {



    /**
     * Method to generate random number for a specific range set between min and max
    *  @param min -> the Minimum number can be generated
     * @param max -> the Maximum number can be generated
    */
    public int generateRandomNumber(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    /**
     * Method to generate random title from "Male" or "Female"
     * @return Each time this method being called will select a random title
     */

    public String randomTitleSelection() {
        List<String> givenList = Arrays.asList("male", "female");
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

}
