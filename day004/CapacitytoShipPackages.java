package day004;

public class CapacitytoShipPackages {
    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private static boolean canShip(int[] weights, int days, int capacity) {

        int usedDays = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {
                usedDays++;
                currentWeight = 0;
            }

            currentWeight += weight;

            if (usedDays > days) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

                int[] arr = {1,2,3,4,5,6,7,8,9,10};

                        System.out.println(shipWithinDays(arr,10));

                                // System.out.println(search(arr,10));
                                    }
    }
}
