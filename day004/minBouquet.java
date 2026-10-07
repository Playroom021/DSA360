package day004;

// leetCode 1482

public class minBouquet {
	public static int minDays(int[] bloomDay, int m, int k) {

		if (bloomDay.length < (m*k)) {
			return -1;
		}

		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		for (int Day : bloomDay) {
			high = Math.max(high, Day);
		}

		for (int day : bloomDay) {
			low = Math.min(low, day);
			high = Math.max(high, day);
		}

		int answer = -1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (canMake(bloomDay, m, k, mid)) {
				answer = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return answer;
	}

	public static Boolean canMake(int[] bloomDay, int m,int k, int day ) {

		int flower=0;
		int bouquet=0;

		for(int bloom:bloomDay) {
			if(bloom<=day) {
				flower++;

				if(flower==k) {
					bouquet++;
					flower=0;
				}
			}
			else {
				flower=0;
			}
		}

		return bouquet >=m;

	}

        public static void main(String[] args) {

                int[] arr = {2,4,6,8,10,12};
                int m=3;
                int k=2;

                System.out.println(minDays(arr,m,k));

                // System.out.println(search(arr,10));
        }

}

