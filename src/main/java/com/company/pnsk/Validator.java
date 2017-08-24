package com.company.pnsk;

import org.apache.commons.lang.RandomStringUtils;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;

public class Validator {
    public String name;
    public String dataType;
    public String length;
    public String valueVALID;
    public String valueVALID_LOW_BOUND;
    public String valueVALID_UP_BOUND;
    public String valueINVALID_LOW_BOUND;
    public String valueINVALID_UP_BOUND;

    private static final String descriptorFileName = "src/main/java/com/company/testdata/datadescriptor.xlsx";
    private static final ArrayList<Validator> validatorArrayList = setValue();

    public static ArrayList<Validator> setValue(){
        ArrayList<Validator> validators;
        ExcelReader excelReader = new ExcelReader(new File(descriptorFileName));
        excelReader.get();
        validators = excelReader.getData();
        excelReader.close();
        for (Validator validator : validators) {
            switch (validator.dataType){
                case "String":
                    validateString(validator);
                    break;
                case "long":
                    validateLong(validator);
                    break;
                case "double":
                    validateDouble(validator);
                    break;

            }
        }
        return validators;
    }

    private static void validateDouble(Validator validator) {
    }

    private static void validateLong(Validator validator) {
        validator.valueVALID                    = String.valueOf(Long.MAX_VALUE/2);
        validator.valueVALID_LOW_BOUND          = String.valueOf(Long.MIN_VALUE);
        validator.valueVALID_UP_BOUND           = String.valueOf(Long.MAX_VALUE);
        BigInteger bigInteger                   = BigInteger.valueOf(Long.MIN_VALUE);
        bigInteger                              = bigInteger.add(BigInteger.valueOf(-1));
        validator.valueINVALID_LOW_BOUND        = bigInteger.toString();
        bigInteger                              = BigInteger.valueOf(Long.MAX_VALUE);
        bigInteger                              = bigInteger.add(BigInteger.valueOf(1));
        validator.valueINVALID_UP_BOUND         = bigInteger.toString();
    }

    private static void validateString(Validator validator) {
        if (!validator.length.equals("?")) {
            validator.valueVALID                = RandomStringUtils.randomAlphabetic(Integer.parseInt(validator.length) / 2);
            validator.valueVALID_LOW_BOUND      = "";
            validator.valueVALID_UP_BOUND       = RandomStringUtils.randomAlphabetic(Integer.parseInt(validator.length));
            validator.valueINVALID_LOW_BOUND    = null;
            validator.valueINVALID_UP_BOUND     = RandomStringUtils.randomAlphabetic(Integer.parseInt(validator.length) + 1);
        }
    }

    public static String getValue(String name, ValidCriteria validCriteria){

        return "";
    }
}
