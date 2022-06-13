package com.company.programs.wateringplants;

import lombok.extern.slf4j.Slf4j;

/**
 * https://leetcode.com/problems/watering-plants/
 * You want to water n plants in your garden with a watering can. The plants are arranged in a row and are labeled from 0 to n - 1 from left to right where the ith plant is located at x = i. There is a river at x = -1 that you can refill your watering can at.
 * <p>
 * Each plant needs a specific amount of water. You will water the plants in the following way:
 * <p>
 * Water the plants in order from left to right.
 * After watering the current plant, if you do not have enough water to completely water the next plant, return to the river to fully refill the watering can.
 * You cannot refill the watering can early.
 * You are initially at the river (i.e., x = -1). It takes one step to move one unit on the x-axis.
 * <p>
 * Given a 0-indexed integer array plants of n integers, where plants[i] is the amount of water the ith plant needs, and an integer capacity representing the watering can capacity, return the number of steps needed to water all the plants.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: plants = [2,2,3,3], capacity = 5
 * Output: 14
 * Explanation: Start at the river with a full watering can:
 * - Walk to plant 0 (1 step) and water it. Watering can has 3 units of water.
 * - Walk to plant 1 (1 step) and water it. Watering can has 1 unit of water.
 * - Since you cannot completely water plant 2, walk back to the river to refill (2 steps).
 * - Walk to plant 2 (3 steps) and water it. Watering can has 2 units of water.
 * - Since you cannot completely water plant 3, walk back to the river to refill (3 steps).
 * - Walk to plant 3 (4 steps) and water it.
 * Steps needed = 1 + 1 + 2 + 3 + 3 + 4 = 14.
 * Example 2:
 * <p>
 * Input: plants = [1,1,1,4,2,3], capacity = 4
 * Output: 30
 * Explanation: Start at the river with a full watering can:
 * - Water plants 0, 1, and 2 (3 steps). Return to river (3 steps).
 * - Water plant 3 (4 steps). Return to river (4 steps).
 * - Water plant 4 (5 steps). Return to river (5 steps).
 * - Water plant 5 (6 steps).
 * Steps needed = 3 + 3 + 4 + 4 + 5 + 5 + 6 = 30.
 * Example 3:
 * <p>
 * Input: plants = [7,7,7,7,7,7,7], capacity = 8
 * Output: 49
 * Explanation: You have to refill before watering each plant.
 * Steps needed = 1 + 1 + 2 + 2 + 3 + 3 + 4 + 4 + 5 + 5 + 6 + 6 + 7 = 49.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == plants.length
 * 1 <= n <= 1000
 * 1 <= plants[i] <= 106
 * max(plants[i]) <= capacity <= 109
 */
@Slf4j
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        log.info("{}", solution.wateringPlants(new int[]{2, 2, 3, 3}, 5)); // 14
        log.info("{}", solution.wateringPlants(new int[]{1, 1, 1, 4, 2, 3}, 5)); // 30
        log.info("{}", solution.wateringPlants(new int[]{7, 7, 7, 7, 7, 7, 7}, 8)); // 49

        log.info("{}", solution.testWateringPlants(new int[]{2, 2, 3, 3}, 5)); // 14
        log.info("{}", solution.testWateringPlants(new int[]{1, 1, 1, 4, 2, 3}, 5)); // 30
        log.info("{}", solution.testWateringPlants(new int[]{7, 7, 7, 7, 7, 7, 7}, 8)); // 49
    }

    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int cap = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (capacity >= plants[i]) {
                steps++;
                capacity -= plants[i];
            } else {
                capacity = cap;
                steps += 2 * i + 1;
                capacity -= plants[i];
            }
        }
        return steps;
    }

    public int testWateringPlants(int[] plants, int capacity) {
        int steps = 0;
        for (int i = 0; i < plants.length; i++) {
            if (capacity < plants[i]) {
                steps += 2 * i + 1;
            } else {
                steps++;
            }
            capacity -= plants[i];
        }

        return steps;
    }

}
