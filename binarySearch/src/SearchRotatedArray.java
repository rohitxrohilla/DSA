public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        int n = arr.length;
        int target = 11;
        int start = 0;
        int end = n - 1;
        int pivot = 0;

        //find pivot

        while (start < end) {
            int mid = (start + end) / 2;
            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                pivot = mid;
                break;
            } else if (arr[mid] >= arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(pivot);

        //finding target

             if(target>arr[end]){
                 start=0;
                 end = pivot-1;
             }
             else{
                 start = pivot;
                 end = n-1;
             }

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }


    }
}
