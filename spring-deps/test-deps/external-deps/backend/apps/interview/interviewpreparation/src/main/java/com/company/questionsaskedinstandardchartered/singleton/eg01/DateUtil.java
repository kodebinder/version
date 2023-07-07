package com.company.questionsaskedinstandardchartered.singleton.eg01;

import java.util.Objects;

public class DateUtil {

    // 3. Declare a static member of same class type
    private static DateUtil instance;

    // 1. Private Constructor
    private DateUtil() {

    }

    // 2. Declare a static getInstance method
    public static DateUtil getInstance() {
        if (Objects.isNull(instance)) {
            instance = new DateUtil();
        }
        return instance;
    }
}
