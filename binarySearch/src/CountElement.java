public class CountElement {
    public static void main(String[] args) {
        int[] arr = {2,10,10,10,10,18,20};
        int target = 2;
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int res1 = -1;
        int res2 = -1;

        //first occurence

        while (start <= end) {
            int mid = (start+end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target==arr[mid]){
                res1 = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        //last occurrence

        start = 0;
        end = n-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                res2 = mid;
                start = mid+1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        int count = (res2-res1)+1;
        System.out.println(count);

    }


    }

