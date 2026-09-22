public class minMaxElement {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 8, 5};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);

        System.out.println(max);
    }
}