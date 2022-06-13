package com.company.programs.encodeanddecodetinyurl;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */
public class Solution {

    private static Map<String, String> map = new LinkedHashMap<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        String originalLongUrl = "https://www.google.com/";
        String encodedShortUrl = solution.encode(originalLongUrl);
        System.out.println(originalLongUrl);
        System.out.println(encodedShortUrl);
        String decodedLongUrl = solution.decode(encodedShortUrl);
        System.out.println(decodedLongUrl);
    }

    private String encode(String longUrl) {
        String hashKey = String.valueOf(longUrl.hashCode());
        map.put(hashKey, longUrl);
        return hashKey;
    }

    private String decode(String shortUrl) {
        if (map.containsKey(shortUrl)) {
            return map.get(shortUrl);
        } else {
            return "Not Found";
        }
    }
}
