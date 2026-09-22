public class linearSearch {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 8, 5};

        int target = 8;

        int index;

        boolean found = false;

        for(int num : arr) {

            if(num == target) {
                found = true;
                index= num ;

                break;
            }
        }

        System.out.println(index);
        System.out.println(found);

        
    }
}
