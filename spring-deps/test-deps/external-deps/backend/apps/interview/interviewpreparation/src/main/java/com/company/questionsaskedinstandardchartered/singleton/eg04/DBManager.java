package com.company.questionsaskedinstandardchartered.singleton.eg04;

import lombok.Getter;

@Getter
public enum DBManager {
    INSTANCE("DBManager");

    private final String name;

    private DBManager(final String name) {
        this.name = name;
    }
}
