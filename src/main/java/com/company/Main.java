package com.company;


import com.company.classestoparse.Odd;
import com.company.classestoparse.Odds;
import com.company.utilities.JsonConverter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String pathToTestData="src/main/java/com/company/testdata";
        String file = pathToTestData + "/Object.json";

        JsonConverter jsonConverter = new JsonConverter();
        String jsonFile = jsonConverter.getJsonFromFile(file);
        Odds object = new Odds();
        object = jsonConverter.getDeserializedClass(Odds.class,jsonFile);

        String file1 =pathToTestData + "/Array.json";
        JsonConverter jsonConverter1 = new JsonConverter();
        String jsonFile1 = jsonConverter.getJsonFromFile(file1);
        ArrayList<Odd> arrayOfObjects = new ArrayList<Odd>();

        arrayOfObjects.addAll(jsonConverter.getDeserializedListOfClass(Odd.class,jsonFile1));

    }

}
