package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
       // String[] words = stringWithoutPeriod.split(" ");

        if (!sentence.isEmpty()) {
            String stringWithoutPeriod = sentence.substring(0, sentence.length() - 1);
            String[] words = stringWithoutPeriod.split(" ");
            for (int i = 0; i < words.length; i++) {
                int occurrence = 0;
                for (int y = 0; y < words.length; y++) {
                    if (words[i].equalsIgnoreCase(words[y])) {
                        occurrence++;
                    }
                }
                map.put(words[i].toLowerCase(), occurrence);
            }
        }

        return map;
    }
}
