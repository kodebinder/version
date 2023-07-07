package com.company;

public class PrintAllCombinationsOfString {
    public static void main(String[] args) {

        String str = "java";
        int length = str.length();
        boolean[] used = new boolean[length];
        StringBuilder out = new StringBuilder();
        getCombinations(str, length, used, out, 0);
    }

    public static void getCombinations(String str, int length, boolean[] used, StringBuilder out, int pos) {
        if (pos == length) {
            System.out.println(out.toString());
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) continue;
            out.append(str.charAt(i));
            used[i] = true;
            getCombinations(str, length, used, out, pos + 1);
            used[i] = false;
            out.setLength(out.length() - 1);
        }
    }
}
