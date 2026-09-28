package org.example;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class containsDuplicate {


    public static void main(String[] args){

        List<Integer> result = leetCodeTwo();
        System.out.println(result);
    }


    private static List<Integer> leetCodeTwo(){

        List<Integer> nums = List.of(1, 2, 3, 1);

        HashSet<Integer> set = new HashSet<>();

        List<Integer> result = new ArrayList<>();


        for(int num : nums) {

            if(set.contains(num)){
                result.add(num);
                break;
            }

            set.add(num);

        }

        return result;

    }

}