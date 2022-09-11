package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishes = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        while (!dishes.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                dishes.add(dishes.poll());
            }
            result.add(dishes.poll());
        }
        return result;
    }
}
