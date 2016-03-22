/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author S.Rahman
 */
public class DateFormatUsingLocaleTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2016, 2, 21);

        Date d = c.getTime();

        Locale locIT = new Locale("it", "IT");      //Italy
        Locale locPT = new Locale("pt");            //portugal
        Locale locBR = new Locale("pt", "BR");      //Brazil
        Locale locIN = new Locale("hi", "IN");      //India
        Locale locJA = new Locale("ja");            //japan
        Locale locDK = new Locale("da", "DK");      //Denmark

        System.out.println("default: " + locBR.getCountry());
        System.out.println("loc: " + locBR.getDisplayCountry(locBR));

        System.out.println("default: " + locDK.getDisplayLanguage());
        System.out.println("loc: " + locDK.getDisplayLanguage(locDK));

        System.out.println("D > I: " + locDK.getDisplayLanguage(locIT));
        System.out.println("\n\n");

        DateFormat dfUS = DateFormat.getDateInstance();
        System.out.println("US      " + dfUS.format(d));

        DateFormat dfUSFULL = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US Full     " + dfUSFULL.format(d));

        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("Italy       " + dfIT.format(d));

        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("Portugal       " + dfPT.format(d));

        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("Brazil       " + dfBR.format(d));

        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("India       " + dfIN.format(d));

        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        System.out.println("Japan       " + dfJA.format(d));

    }
}
