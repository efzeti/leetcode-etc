package org.example.implementations;

import org.example.implementations.FakeHashMap;

public class FakeHashMapMain {
    public static void main(String[] args) {

        FakeHashMap<String, Integer> fhm = new FakeHashMap<>();

        fhm.put("a", 1);
        fhm.put("b", 2);
        fhm.put("c", 3);
        fhm.put("d", 4);
        fhm.put("e", 5);
        fhm.put("f", 6);
        fhm.put("g", 7);
        fhm.put("h", 8);
        fhm.put("i", 9);
        fhm.put("j", 10);
        fhm.put("k", 11);
        fhm.put("l", 12);
        fhm.put("m", 13);
        fhm.put("n", 14);
        fhm.put("o", 15);
        fhm.put("p", 16);
        fhm.put("r", 17);
        fhm.put("s", 18);
        fhm.put("t", 19);
        fhm.put("u", 20);
        fhm.put("v", 21);
        fhm.put("w", 22);
        fhm.put("x", 23);
        fhm.put("y", 24);
        fhm.put("z", 25);

        System.out.println(fhm);

        fhm.remove("j");
        fhm.remove("o");
        fhm.remove("v");


        System.out.println(fhm);

        System.out.println(fhm.get("i"));
        System.out.println(fhm.get("n"));
        System.out.println(fhm.get("w"));
    }
}