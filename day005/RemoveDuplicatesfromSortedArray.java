package day005;

public class RemoveDuplicatesfromSortedArray {

    public static int DuplicateRemover(int [] nums){
        int org=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[org]){
                org++;
                nums[org]=nums[i];
            }

        }

        // System.out.println (org);
        return org +1;
    }

    public static void main(String []args){

        int [] nums={1, 1, 2, 2, 3, 3};
        int n= DuplicateRemover(nums);

        for(int i=0 ; i<n; i++){
            System.out.println(nums[i]);
        }

        // for(int x :nums){
        //     System.out.println(x);
        // }
    }

}
