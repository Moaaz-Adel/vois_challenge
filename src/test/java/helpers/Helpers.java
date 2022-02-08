package helpers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Helpers {

    public int generateRandomNumber(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public String randomTitleSelection() {
        List<String> givenList = Arrays.asList("male", "female");
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

}
