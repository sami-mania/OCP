/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter08.selftest;

/**
 *
 * @author SAMI
 */
public class Question7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(8);
        System.out.print(sb.length() + " " + sb);
        sb.insert(0,"abcdef");
        sb.append("789");
        System.out.println(sb.length() + " " + sb);
    }
}
