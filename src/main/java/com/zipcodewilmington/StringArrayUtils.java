package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    } //done

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    } //done

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) { return array[array.length-1]; } // done

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) { return array[array.length-2];} //done

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String i : array) {
            if (value.equals(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] rev = new String[array.length];
        int endpoint = array.length -1;
        for (int i = 0; i < array.length; i++) {
            rev[i] = "";
            rev[i] = array[endpoint];
            endpoint--;
        }
        return rev;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if(Arrays.equals(array, reverse(array))) {
            return true;
        }
            return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String phrase = Arrays.toString(array).toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0 ; i < alpha.length(); i++) {
            if (!phrase.contains(String.valueOf(alpha.charAt(i)))) {
                return false;
            }
        }
        return true;
/*
        String[] array = {"Five quacking", "zephyrs", "jolt my", "wax bed"};
        String phrase = Arrays.toString(array);
        String test = phrase.replace("[", "");
        String test2 = test.replace("]", "");
        String test3 = test2.replace(",", "");
        String test4 = test3.toLowerCase();
        String test5 = test4.replace(" ", "");
        System.out.println(test5);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder savedAlpha = new StringBuilder();
        boolean isIt = true;
        for (int i = 0; i <= test5.length() - 1; i++) { //cycles through phrase
            //System.out.print(test3.charAt(i));
            for (int j = 0; j <= alpha.length() - 1; j++) { //cycles through alphabet
                //System.out.print(alpha.charAt(j));
                if (test3.charAt(i) == alpha.charAt(j)) {
                    //System.out.println("Hello"); // matches!
                    if(savedAlpha.toString().contains(String.valueOf(test3.charAt(i)))) {
                        break;
                    } else {
                        savedAlpha.append(alpha.charAt(j)); }}}}
        System.out.println("StringBuilder: savedAlpha: " + savedAlpha);
        //System.out.println("Is pangramic: " +(savedAlpha.toString() == alpha)); //compare value
        System.out.println("Is pangramic: " +(savedAlpha.length() == alpha.length())); //compare length
 */
    }

    public boolean searchAlpha(String phrase) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0 ; i < phrase.length()-1 ; i++) {
            for (int j = 0 ; i < 26 ; j++) {
                if (alphabet[j] != phrase.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count =0;
        for (String i : array) {
            if(i == value) {
                count ++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] array2 = new String[array.length-1];
        int hold = 0;
        int j = 0;
        for (String i : array) {
            if(i != valueToRemove) {
                array2[hold] = array[j];
                hold++;
            }
            j++;
        }
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] array2 = new String[array.length];
        int count = 0;
        for (int i=0 ; i <= array.length-1 ; i++) {
            if (array[i] != array[i+1]) {
                array2[count] = array[i];
                count++;
            }
        }
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] array2 = new String[array.length];
        int count = 0;
        for (int i=0 ; i <= array.length-1 ; i++) {
            if (array[i] == array[i+1]) {
                array2[count] = array[i]; //add value type string to new
                count++;                   //remove element old
            }
        }
        return null;
    }

}
