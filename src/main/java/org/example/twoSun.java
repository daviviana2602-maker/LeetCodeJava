package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class twoSun {


    public static  void main(String[] args){

        List<Integer> resultIndex = leetCodeOne();
        System.out.println(resultIndex);

    }


    private static List<Integer> leetCodeOne() {

        List<Integer> nums = List.of(11, 15, 3, 6);
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        List<Integer> resultIndex = new ArrayList<>();


        for (int number : nums) {


            for (int item: set){

                int numberSum = number + item;

                if (numberSum == target){
                    resultIndex.add(nums.indexOf(number));
                    resultIndex.add(nums.indexOf(item));
                    break;
                }

            }

            set.add(number);

        }

        return resultIndex;

    }

}