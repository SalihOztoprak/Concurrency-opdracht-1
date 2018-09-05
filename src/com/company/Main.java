package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private long timeTaken = 0;

    public static void main(String[] args) {
        new Main().run();

    }

    public void run() {
        ArrayList<Integer> randomList;
        randomList = generateNumbers(25000);
        randomList = selectionSort(randomList);

        System.out.println(randomList);
        System.out.println("Size of list is: " + randomList.size());

        System.out.println("Time taken in ms: " + timeTaken);
    }


    private ArrayList<Integer> generateNumbers(int amount) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < amount; i++) {
            int randomNumber = rand.nextInt(Integer.MAX_VALUE);
            numberList.add(randomNumber);
        }

        return numberList;
    }


    public ArrayList<Integer> selectionSort(ArrayList<Integer> list) {
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {

            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        return list;
    }
}
