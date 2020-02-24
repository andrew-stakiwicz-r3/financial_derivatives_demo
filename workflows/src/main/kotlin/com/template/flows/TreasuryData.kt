package com.template.flows

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

object TreasuryData {
// This should look something like the below row prior to mapping
// 2019-12-04,1.59,1.54,1.55,1.56,1.56,1.58,1.58,1.6,1.71,1.77,2.08,2.22
// For right now we don't need the rest of the fixings so no "else"
// Only interested in today's values for now...
// SO grabbing the headers and the first row of numbers and mapping them.
// This should look something like the below row prior to mapping
// Date,1 MO,2 MO,3 MO,6 MO,1 YR,2 YR,3 YR,5 YR,7 YR,10 YR,20 YR,30 YR
// connection.setRequestProperty("api_key", "ri99y-s2sptF-jGycpRQ");
    @get:Throws(IOException::class)
    val treasuryInfo: MutableMap<String, String>?
        get() {
            val urlForGetRequest = URL("https://www.quandl.com/api/v3/datasets/USTREASURY/YIELD.csv?api_key=ri99y-s2sptF-jGycpRQ")
            var readLine = ""
            val connection = urlForGetRequest.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            // connection.setRequestProperty("api_key", "ri99y-s2sptF-jGycpRQ");
            val responseCode = connection.responseCode
            return if (responseCode == HttpURLConnection.HTTP_OK) {
                val `in` = BufferedReader(
                        InputStreamReader(connection.inputStream))
                var columnList: Array<String>? = null
                var valuesList: Array<String>? = null
                while (`in`.readLine().also { readLine = it } != null) {
                    if (columnList == null) { // Only interested in today's values for now...
                        // SO grabbing the headers and the first row of numbers and mapping them.
                        // This should look something like the below row prior to mapping
                        // Date,1 MO,2 MO,3 MO,6 MO,1 YR,2 YR,3 YR,5 YR,7 YR,10 YR,20 YR,30 YR
                        columnList = readLine!!.split(",".toRegex()).toTypedArray()
                    } else if (valuesList == null) { // This should look something like the below row prior to mapping
                        // 2019-12-04,1.59,1.54,1.55,1.56,1.56,1.58,1.58,1.6,1.71,1.77,2.08,2.22
                        valuesList = readLine!!.split(",".toRegex()).toTypedArray()
                    } // For right now we don't need the rest of the fixings so no "else"
                }
                `in`.close()
                val returnMap: MutableMap<String, String> = HashMap()
                for (i in columnList!!.indices) {
                    returnMap[columnList[i]] = valuesList!![i]
                }
                returnMap
            } else {
                println("Error pulling the treasury curve, HTTP Response code " + Integer.toString(responseCode))
                null
            }
        }

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("")
        var treasuryMap = treasuryInfo
        val fmt = "%10s%10s%10s\n"
        
        System.out.printf(fmt, "Date pulled: ", treasuryMap?.remove("Date") , "")
        System.out.printf("\n%10s%20s\n", "Tenors     ", "Values")
        for (tenor in treasuryMap!!.keys) {
            System.out.printf(fmt,
                    tenor, "   ",
                    treasuryMap[tenor])
        }
        println("")
    }
}