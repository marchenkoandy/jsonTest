package com.company.pnsk;

import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.util.ArrayList;

public class ExcelReader extends WorkbookBase {

    public ExcelReader(File fileExcel) {
        super(fileExcel);
    }
    public ArrayList<Validator> getData(){
        ArrayList<Validator> validatorArrayList = new ArrayList<Validator>();
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 1 ; i < sheet.getLastRowNum()+1; i++){
                Validator validator = new Validator();
                validator.name          = getStringDataValue(sheet.getRow(i).getCell(1));
                validator.dataType      = getStringDataValue(sheet.getRow(i).getCell(2));
                validator.length        = getStringDataValue(sheet.getRow(i).getCell(3));
                validatorArrayList.add(validator);
            }
        return validatorArrayList;
    }
}
