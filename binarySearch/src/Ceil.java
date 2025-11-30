public class Ceil {
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
                start=mid+1;
            }
            else if(arr[mid]>target){
                res=mid;
                end=mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(res);
    }
}
