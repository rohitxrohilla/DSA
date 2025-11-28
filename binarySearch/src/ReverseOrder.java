public class ReverseOrder {
    public static void main(String[] args) {

        int[] arr = {20,17,15,14,13,12,10,9,8,4};
        int target = 17;
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(target==arr[mid]){
                System.out.println(mid);
                return;
            }
            else if(target>arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("not found");
    }

}
