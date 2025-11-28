public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {15,18,2,5,6,8,11,12};
        int largest = arr[0];
        int n = arr.length;

        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = (start+end)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;


            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next]){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<=arr[end]){
                end = mid;
            }

            else{
                start = mid+1;
            }

        }
        System.out.println("jj");


    }
}
