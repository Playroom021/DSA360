package day007 ;

import java.util.HashMap;

public class HashMapExe{

//     What is hashing?
//          Hashing is a technique that helps us store and 
//          find data efficiently using a hash-based data structure.


        // Useful methods:
            // put(key, value)     	    Insert or update a value
            // get(key)	                Retrieve a value
            // getOrDefault(key, 0)	    Return the default if the key is absent
            // containsKey(key)	        Check whether a key exists
            // remove(key)	            Remove an entry

    public static void main(String [] args){
        int [] arr ={ 10, 20, 10, 30, 20, 10};

        HashMap<Integer ,Integer> freq =new HashMap<>();

        for( int nums: arr){
            freq.put(nums, freq.getOrDefault(nums, 0) + 1);
        }
        System.out.println(freq);

    }
}
