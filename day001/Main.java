public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 8, 5};

        int largeNum=arr[0];
        int smallNum=arr[0];

        int sum=0;

        int countEven=0;

        int countOdd=0;

        for (int num: arr){
            if(largeNum<num){
                largeNum=num;
            }

            if(smallNum>num){
                smallNum=num;
            }
            sum=sum+num;

            if(num%2==0){
                countEven++;

            }
            else{
                countOdd++;
            }

        }

        System.out.println (largeNum);
        System.out.println (smallNum);
        System.out.println (sum);
        System.out.println (countEven);
        System.out.println (countOdd);
        
    }
}
