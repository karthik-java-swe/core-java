package org.learjava.a2z.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class PiggyBank {
    public static void main(String[] args) {
        List<String> currencyList = new ArrayList<>();
        currencyList.add("Rupee");
        currencyList.add("Dollar");
        currencyList.add("Pound");
        currencyList.add("Euro");
        System.out.println("currencyList :: "+currencyList);

        Set<String> currencySet = new HashSet<>();
        currencySet.add("Rupee");
        currencySet.add("Dollar");
        currencySet.add("Pound");
        currencySet.add("Euro");
        System.out.println("currencySet :: "+currencySet);

        Queue<String> currencyQueue = new PriorityQueue<>();
        currencyQueue.add("Rupee");
        currencyQueue.add("Dollar");
        currencyQueue.add("Pound");
        currencyQueue.add("Euro");
        System.out.println("currencyQueue :: "+currencyQueue);
    }
}