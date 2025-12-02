public class First1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int start = 0;
        int end = 1;
        int target = 1;
        int res = 0;
        while(target>arr[end])
         {
             start = end;
             end=end*2;
         }
         while(start<=end){
             int mid = (start+end)/2;
             if(target==arr[mid]){
                 res = mid;
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start = mid+1;
             }
             else{
                 end=mid-1;
             }
         }
        System.out.println(res);
    }
}
