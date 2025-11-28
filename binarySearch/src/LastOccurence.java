public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 10, 10, 10, 10};
        int target = 10;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int res = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                res = mid;
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(res);
    }
    }

