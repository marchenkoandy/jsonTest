package com.company;


import com.company.classestoparse.Odd;
import com.company.classestoparse.Odds;
import com.company.csv.CSVhelper;
import com.company.csv.Family;
import com.company.pnsk.EldHardware;
import com.company.pnsk.ExcelReader;
import com.company.pnsk.Validator;
import com.company.utilities.JsonConverter;
import org.apache.commons.lang.RandomStringUtils;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        CSVhelper csVhelper = new CSVhelper("C:\\Users\\user\\IdeaProjects\\jsonTest\\src\\main\\java\\com\\company\\testdata\\test.csv");
        List<Family> families = csVhelper.read();
        System.out.println(families.get(1).getName());
        //        System.out.println(UUID.randomUUID());
//        System.out.println(RandomStringUtils.randomAlphabetic(5));
////        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
////        System.out.println(Double.MAX_VALUE);
////        Validator.setValue();
//        EldHardware eldHardware = new EldHardware();
//        System.out.println(new JsonConverter().getJsonFromClass(EldHardware.class,eldHardware));
////        String pathToTestData="src/main/java/com/company/testdata";
//        String file = pathToTestData + "/Object.json";
//
//        JsonConverter jsonConverter = new JsonConverter();
//        String jsonFile = jsonConverter.getJsonFromFile(file);
//        Odds object = new Odds();
//        object = jsonConverter.getDeserializedClass(Odds.class,jsonFile);
//
//        String file1 =pathToTestData + "/Array.json";
//        JsonConverter jsonConverter1 = new JsonConverter();
//        String jsonFile1 = jsonConverter.getJsonFromFile(file1);
//        ArrayList<Odd> arrayOfObjects = new ArrayList<Odd>();
//
//        arrayOfObjects.addAll(jsonConverter.getDeserializedListOfClass(Odd.class,jsonFile1));

    }

}
