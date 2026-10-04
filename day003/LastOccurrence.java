package day003;

public class LastOccurrence {
    static int lastOccurrence(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        int ans=-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==target){

                ans=mid;
                low=mid+1;

            }

            else if(target<arr[mid]){

                high=mid-1;

            }

            else{

                low=mid+1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

                int[] arr = {2,4,6,8,8,10,12};

            System.out.println(lastOccurrence(arr,8));
        }
}
