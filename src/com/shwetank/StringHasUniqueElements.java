package com.shwetank;

public class StringHasUniqueElements {

    public static void main(String[] args) {
        String value = "helo";
        int length = value.length();
        char[] valueArray = value.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < length; i++) {
            int num = valueArray[i]-'a';
            arr[num] = arr[num] + 1;
            if(arr[num] > 1){
                System.out.println("Not a unique string");
                return;
            }
        }
        System.out.println("All unique");
    }

}
