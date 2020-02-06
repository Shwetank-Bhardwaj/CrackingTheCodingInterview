package com.shwetank;

public class ReplaceSpaceWithGivenString {
    public static void main(String[] args) {
        String s = "mr john smith    ";
        int trueLength = 13;
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < trueLength; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        int index = trueLength + count * 2;
        if(trueLength < c.length) {
            c[trueLength] = '\0';
        }
        for (int i = trueLength - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                c[index - 1] = '0';
                c[index - 2] = '2';
                c[index - 3] = '%';
                index = index - 3;
            } else {
                c[index - 1] = c[i];
                index--;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}
