/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S.Rahman
 */
public class NumberFormatClassTest {

    public static void main(String[] args) {
        
        Locale[] locals = Locale.getAvailableLocales();
        for(Locale loc : locals){
//            if(loc.getLanguage().equals("nl"))
            System.out.println(loc);
            System.out.println(loc.getCountry());
        }
        
        System.out.println("\n\n\n");
        
        float f1 = 123.4567f;
        Locale locFR = new Locale("fr");

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);

        for (NumberFormat nf1 : nfa) {
            System.out.println(nf1.format(f1));
        }
        
        System.out.println("\n\n");
        
        float f2 = 456.78912f;

        NumberFormat nf2 = NumberFormat.getInstance(new Locale("nl", "NL"));
        System.out.print(nf2.getMaximumFractionDigits() + " ");
        System.out.print(nf2.format(f2) + " ");

        nf2.setMaximumFractionDigits(5);
        System.out.println(nf2.format(f2) + " ");
        try {
            System.out.println(nf2.parse("4567,8912"));
            nf2.setParseIntegerOnly(true);
            System.out.println(nf2.parse("4567,8912"));
        } catch (ParseException ex) {
            Logger.getLogger(NumberFormatClassTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
