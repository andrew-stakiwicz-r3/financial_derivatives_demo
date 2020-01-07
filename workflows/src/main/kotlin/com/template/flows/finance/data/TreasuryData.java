package com.template.flows.finance.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class TreasuryData{ 

    public static Map<String,String> getTreasuryInfo() throws IOException {
        URL urlForGetRequest = new URL("https://www.quandl.com/api/v3/datasets/USTREASURY/YIELD.csv?api_key=ri99y-s2sptF-jGycpRQ");
        String readLine = null;
        HttpURLConnection connection = (HttpURLConnection) urlForGetRequest.openConnection();
        connection.setRequestMethod("GET");
        // connection.setRequestProperty("api_key", "ri99y-s2sptF-jGycpRQ");
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String[] columnList = null;
            String[] valuesList = null;
            while ((readLine = in .readLine()) != null) {
                if (columnList == null)
                {
                    // Only interested in today's values for now...
                    // SO grabbing the headers and the first row of numbers and mapping them.
                    // This should look something like the below row prior to mapping
                    // Date,1 MO,2 MO,3 MO,6 MO,1 YR,2 YR,3 YR,5 YR,7 YR,10 YR,20 YR,30 YR
                    columnList = readLine.split(",");
                }
                else if (valuesList == null)
                {
                    // This should look something like the below row prior to mapping
                    // 2019-12-04,1.59,1.54,1.55,1.56,1.56,1.58,1.58,1.6,1.71,1.77,2.08,2.22
                    valuesList = readLine.split(",");
                } // For right now we don't need the rest of the fixings so no "else"

            } in .close();
            Map<String,String> returnMap = new HashMap<>();
            for (int i = 0; i < columnList.length; i++)
            {
                returnMap.put(columnList[i], valuesList[i]);
            }
            return returnMap;
        } 
        else {
            System.out.println("Error pulling the treasury curve, HTTP Response code " + Integer.toString(responseCode));
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("");
        Map<String, String> treasuryMap = getTreasuryInfo();  
        String fmt = "%10s%10s%10s\n";
        System.out.printf(fmt, "Date pulled: " , treasuryMap.remove("Date"), ""); 
        System.out.printf("\n%10s%20s\n", "Tenors     ", "Values");
        for (String tenor : treasuryMap.keySet()) {
                System.out.printf(fmt, 
                        tenor,"   ", 
                        treasuryMap.get(tenor)); 
        }
        System.out.println("");
    }
    


}