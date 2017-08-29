package com.company.csv;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVhelper {
    private String csvFile;
    public CSVhelper(String csvFile){
        this.csvFile = csvFile;
    }
    public List<Family> read(){
        CSVReader csvReader = null;
        List<Family> bean =null;
        try {
            bean = new CsvToBeanBuilder(new FileReader(csvFile)).withType(Family.class).withSeparator('\t').build().parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return bean;
    }
}
