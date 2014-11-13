package com.example.josh.testoffice365;

/**
 * Created by Josh on 11/11/2014.
 */

/**
 * this class holds the service constants to connect to Office 365 Outlook services
 * please note that the sample assume that all of this constants will work for all services, which
 * may not be the case
 *
 * fill in the values according to your subscription
 */
public class ServiceConstants {
    public static final String AUTHORITY_URL = "https://login.windows.net/common";
    public static final String RESOURCE_ID = "https://outlook.office365.com/";
    public static final String REDIRECT_URL = "https://localhost:8080";
    public static final String CLIENT_ID = "25a8d902-3f20-4eba-83b6-a8d450c20dd9";
    public static final String ENCRYPTION_KEY = "EncryptionKey";
    // it is generally the case for O365 services that the endpoint ID is the concatenation
    // RESOURCE_ID and the api version. Please check against your actual deployment
    public static final String ENDPOINT_ID = RESOURCE_ID + "api/v1.0";
}
