package com.company.pnsk.apirelated;

public class DriverApiExceptionModel {
    private String errorLevel;                              // "Error level fatal , info etc"
    private String errorMessage;                            // "The error message that the application returns"
    private String errorCode;                               // "Error Code returned by the app."
    private Object cause;                                   // "Cause of the error if returned by the app"
}
