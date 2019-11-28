package com.company;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class NewClass {

    public static void EVEN () {


        List<Integer> EVENList = new ArrayList<Integer>();

        Random randomnumbers = new Random();

        for (int i = 0; i < 12; i++) {

            EVENList.add(randomnumbers.nextInt((20 - 0) + 1) + 0);
        }
        System.out.println( EVENList);
        for (int i = 0; i < EVENList.size(); i++) {

            if((i % 2) == 0) {
                EVENList.remove(EVENList.get(i));
            }
        }
        Collections.sort(EVENList);

        System.out.println(EVENList);
    }
    public static void _3multiple() {

        List<Integer> _3multipleList = new ArrayList<Integer>();
        Random randomnumbers = new Random();

        for (int i = 0; i < 12; i++) {
            _3multipleList.add(randomnumbers.nextInt((10 - 5) + 1) + 5);
        }
        System.out.println(_3multipleList);
        for (int i = 0; i < _3multipleList.size(); i++) {


             if((i % 3) == 0 && i >= 3) {


                _3multipleList.add(i+1, randomnumbers.nextInt((25 - 20) + 1) + 20);
            }
        }
        System.out.println(_3multipleList);
    }

}
