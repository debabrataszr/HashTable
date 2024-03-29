package com.bridgelabz.hashtable;

public class MyHashMapTest {
    public static void main(String[] args) {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting " +
                "themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        System.out.println();
        for (String word : words) {
            int frequency = myLinkedHashMap.get(word);
            System.out.println("Frequency of " + word + " : " + frequency);
        }
        System.out.println();
        System.out.println("Avoidable removed successfully ");
        myLinkedHashMap.remove("avoidable");
    }
}