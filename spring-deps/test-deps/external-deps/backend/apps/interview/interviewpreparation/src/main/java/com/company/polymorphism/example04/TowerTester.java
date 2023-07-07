package com.company.polymorphism.example04;

interface Tower {
    boolean isTooHigh(int h, int l);
}

public class TowerTester {
    public static void main(String[] args) {
        //   check((h, l) -> h.append(l).isEmpty(), 5);
    }

    private static void check(Tower tower, int h) {
        if (tower.isTooHigh(h, 100)) {
            System.out.println("yes, too high");
        } else {
            System.out.println("No");
        }
    }

}