package com.company.pnsk.apirelated;

import com.company.pnsk.BaseEld;
import java.util.ArrayList;

public class DriverApiResponse {
    private String responseName;                        // "Type Of Response"
    private boolean success;                            // "Success of Failure"
    private ArrayList<BaseEld> data;                    // "Request Specific Response"
    private DriverApiExceptionModel errorData;          //
    private Page page;                                  //
}
