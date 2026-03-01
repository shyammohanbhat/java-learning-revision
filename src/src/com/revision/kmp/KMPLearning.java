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

    public static int[] buildLPS(String s){
        int len = 0;
        int n = s.length();
        int[] lps = new int[n];
        for(int i=1; i<n; i++){
            while(len>0 && s.charAt(i) != s.charAt(len)){
                len = lps[len-1];
            }
            if(s.charAt(i) == s.charAt(len)){
                len++;
            }
            lps[i] = len;
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
