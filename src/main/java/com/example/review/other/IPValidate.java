package com.example.review.other;

public class IPValidate {
    public boolean checkIP(String ip) {
        String[] arr = ip.split("\\.");
        if (arr.length != 4) {
            return false;
        }
        for (String s : arr) {
            int num = Integer.parseInt(s);
            if (num < 0 || num > 255) {
                return false;
            }
            if (s.charAt(0) == '0' && s.length() != 1) {
                return false;
            }
        }
        return true;
    }
}
