package com.company.questionsaskedinstandardchartered.singleton.eg03;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class DateUtil implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;

    // 3. Declare a static member of same class type
    private static DateUtil instance;

    // 1. Private Constructor
    private DateUtil() {

    }

    // 2. Declare a static getInstance method
    // 3. synchronized block
    public static DateUtil getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DateUtil.class) {
                if (Objects.isNull(instance)) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    // 4. readResolve() invoked by ObjectInputStream can be marked as private or protected
    protected Object readResolve() {
        return instance;
    }

    // 5. Create a clone not supported exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
