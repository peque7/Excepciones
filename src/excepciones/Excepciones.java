/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

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
        NullPointerException();
        NumberFormatException();
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
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println(aioobe);
            
        }
    }
    public static void ClassCastException(){
        try {
            
        } catch (ClassCastException cce) {
            
        }
    }
    public static void IllegalArgumentException(){
        try {
            
        } catch (IllegalArgumentException iae) {
            
        }
    }
    public static void IllegalStateException(){
        try {
            
        } catch (IllegalStateException ise) {
            
        }
    }
    public static void NullPointerException(){
        try {
            
        } catch (NullPointerException npe) {
            
        }
    }
    public static void NumberFormatException(){
        try {
        } catch (NumberFormatException nfe) {
        }
    }
    public static void AssertionError(){
        try {
        } catch (AssertionError ae) {
        }
    }
    public static void ExceptionInInitializerError(){
        try {
        } catch (ExceptionInInitializerError eie) {
        }
    }
    public static void StackOverflowError(){
        try {
        } catch (StackOverflowError soe) {
        }
    }
    public static void NoClassDefFoundError(){
        try {
        } catch (NoClassDefFoundError ncdfe) {
        }
    }
    public static void Exception(){
        try {
        } catch (Exception e) {
        }
    }
    
}
