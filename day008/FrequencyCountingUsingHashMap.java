package day008;

import java.util.HashMap;

public class FrequencyCountingUsingHashMap {

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,2,1,4,3,2,2,1};

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+ 1);
            // map.getOrDefault(num, 0) + 1 count the occurrence of number 

        }

        System.out.println (map);

    }

}