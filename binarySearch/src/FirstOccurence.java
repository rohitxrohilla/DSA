public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {4,6,10,10,18,20};
        int target = 10;
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int res = 0;

        while (start <= end) {
            int mid = (start+end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target==arr[mid]){
                 res = mid;
               end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        System.out.println(res);
    }
}
