package com.company.javaeight.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortOnDecreasingOrderOfFrequency {
    public static void main(String[] args) {

        SortOnDecreasingOrderOfFrequency obj = new SortOnDecreasingOrderOfFrequency();
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 1, 4, 1};

        // Map<Integer, Long> frequencyMap = obj.getFrequencyMap(arr);
        // System.out.println(frequencyMap);

        List<Integer> numsInDecreasingOrderOfFrequency = obj.getListInDecreasingOrderOfFrequency(arr);
        System.out.println(numsInDecreasingOrderOfFrequency);
    }

//    public Map<Integer, Long> getFrequencyMap(int[] arr) {
//        Map<Integer, Long> frequencyMap = Arrays.stream(arr).boxed()
//                .collect(Collectors.groupingBy(Function.identity(),
//                        Collectors.counting()));
//        frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//
//        return frequencyMap;
//    }

    public List<Integer> getListInDecreasingOrderOfFrequency(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.collectingAndThen(Collectors.toList(), l -> {
                                    Collections.reverse(l);
                                    return l;
                                }
                        )
                );
    }

}
