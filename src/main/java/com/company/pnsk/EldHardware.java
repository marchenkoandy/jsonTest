package com.company.pnsk;


import java.math.BigInteger;

public class EldHardware implements BaseEld{
    private String hardwareId;                      // "This is an internal id for the hardware"
    private BigInteger driverId = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.valueOf(2000));                          // "Driver id"
    private String diagnosticEventIndicator;        // "the diagnostic event indicator"
    private String mobileMacAddress;                // "the mobile MAC address"
    private String authenticationValue;             // "the authentication value"
    private String eldIdentifier;                   // "ELD identifier"
    private String eldProvider;                     // "ELD provider"
    private String eldRegistrationId;               // "ELD registration id"
    private String malfunctionIndicatorStatus;      // "the malfunction indication id"
    private String eventSequenceId;                 // "the event sequence id"
    private long createdDateTime;                   // "DateTime of the creation"
    private long updatedDateTime;                   // "DateTime of the modification"

//    public EldHardware(ValidCriteria validCriteria){
//        switch (validCriteria){
//            case VALID:
//                break;
//            case VALID_UP_BOUND:
//                break;
//            case VALID_LOW_BOUND:
//                break;
//            case INVALID_UP_BOUND:
//                break;
//            case INVALID_LOW_BOUND:
//                break;
//        }
//    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public BigInteger getDriverId() {
        return driverId;
    }

    public void setDriverId(BigInteger driverId) {
        this.driverId = driverId;
    }

    public String getDiagnosticEventIndicator() {
        return diagnosticEventIndicator;
    }

    public void setDiagnosticEventIndicator(String diagnosticEventIndicator) {
        this.diagnosticEventIndicator = diagnosticEventIndicator;
    }

    public String getMobileMacAddress() {
        return mobileMacAddress;
    }

    public void setMobileMacAddress(String mobileMacAddress) {
        this.mobileMacAddress = mobileMacAddress;
    }

    public String getAuthenticationValue() {
        return authenticationValue;
    }

    public void setAuthenticationValue(String authenticationValue) {
        this.authenticationValue = authenticationValue;
    }

    public String getEldIdentifier() {
        return eldIdentifier;
    }

    public void setEldIdentifier(String eldIdentifier) {
        this.eldIdentifier = eldIdentifier;
    }

    public String getEldProvider() {
        return eldProvider;
    }

    public void setEldProvider(String eldProvider) {
        this.eldProvider = eldProvider;
    }

    public String getEldRegistrationId() {
        return eldRegistrationId;
    }

    public void setEldRegistrationId(String eldRegistrationId) {
        this.eldRegistrationId = eldRegistrationId;
    }

    public String getMalfunctionIndicatorStatus() {
        return malfunctionIndicatorStatus;
    }

    public void setMalfunctionIndicatorStatus(String malfunctionIndicatorStatus) {
        this.malfunctionIndicatorStatus = malfunctionIndicatorStatus;
    }

    public String getEventSequenceId() {
        return eventSequenceId;
    }

    public void setEventSequenceId(String eventSequenceId) {
        this.eventSequenceId = eventSequenceId;
    }

    public long getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(long createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public long getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(int updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }


}
