package com.revision.kmp;

import java.util.Arrays;

public class KMPLearning {

    public static void main() {
        String text = "aabaaabaaaabaa";
        String pattern = "aaab";
        int[] lps = buildLPS(pattern);

        System.out.println(Arrays.toString(pattern.toCharArray()));
        System.out.println(Arrays.toString(lps));

        int pos = kmpSearch(text, pattern, lps);
        System.out.println(pos);

    }

    /*
        while (i < m) {
            if (match) {
                expand
            } else {
                fallback using lps[length - 1]
                if(length ==0 ) lps[i] = 0;
            }
        }
     */

    public static int[] buildLPS(String s){
        int m = s.length();
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        while(i<m){
            if(s.charAt(i) == s.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            } else {
                if(length > 0){
                    length = lps[length-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static int kmpSearch(String text, String pattern, int[] lps){
        int i = 0;
        int j = 0;
        int m = text.length();
        int n = pattern.length();

        while(i < m){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j == n) {
                    return i-j;
                }
            } else {
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }
}
