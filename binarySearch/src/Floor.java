public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,19};
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int target = 5;
        int res = 0;


        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]<target){
                res=mid;
                start=mid+1;
            }
            else if(target==arr[mid]){
                System.out.println(mid);
                return;
            }
            else {

                end=mid-1;
            }
        }
        System.out.println(res);
    }
}
