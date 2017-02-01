/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import static com.oracle.jrockit.jfr.ContentType.Percentage;
import java.util.ArrayList;

/**
 *
 * @author pequesillo
 */
public class Excepciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException();
        ClassCastException();
        IllegalArgumentException();
        IllegalStateException();
        NullPointerException(null);
        NumberFormatException("6");
        AssertionError();
        ExceptionInInitializerError();
        StackOverflowError();
        NoClassDefFoundError();
        Exception();
    }
    
    public static void ArrayIndexOutOfBoundsException(){
        try {
            String array[] = {""};
            array[1] = "hola";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            
        }
    }
    public static void ClassCastException(){
        try {
            
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
    public static void IllegalArgumentException(){
        try {
            
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    public static void IllegalStateException(){
        try {
            
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }
    public static void NullPointerException(String a){
        try {
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
    public static void NumberFormatException(String letra){
        try {
            int b = Integer.parseInt(letra);
            String letra2 = String.valueOf(b);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    public static void AssertionError(){
        try {
        } catch (AssertionError e) {
            System.out.println(e);
        }
    }
    public static void ExceptionInInitializerError(){
        try {
        } catch (ExceptionInInitializerError e) {
            System.out.println(e);
        }
    }
    public static void StackOverflowError(){
        try {
        } catch (StackOverflowError e) {
            System.out.println(e);
        }
    }
    public static void NoClassDefFoundError(){
        try {
            
        } catch (NoClassDefFoundError e) {
            System.out.println(e);
        }
    }
    public static void Exception(){
        try {
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
