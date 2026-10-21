package day005;

public class MoveZeroes {

    // Move all zeroes to the end.

    public static void move0(int nums[]){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
            
        }
    }




    public static void main(String []args){

        int [] nums={0,1, 1, 0, 2, 0, 3};

        // output {1,1,2,3,0,0,0}

        move0(nums);

        // for(int i=0 ; i<n; i++){
        //     System.out.println(nums[i]);
        // }

        for(int x :nums){
            System.out.println(x);
        }
    }
}
