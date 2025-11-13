public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int n = arr.length;
        int start  = 0;
        int end = n-1;
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
        System.out.println("not found");
    }
}