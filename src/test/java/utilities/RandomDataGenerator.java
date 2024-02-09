package utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {


    public static String randomString()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public static String randomNumber()
    {
        String generatedString=RandomStringUtils.randomNumeric(10);
        return generatedString;
    }

    public static String randomAlphaNumeric()
    {
        String str=RandomStringUtils.randomAlphabetic(3);
        String num=RandomStringUtils.randomNumeric(3);

        return (str+"@"+num);
    }
}
