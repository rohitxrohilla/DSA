public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int start=0;
        int end=1;
        int target = 2;

        if(target>arr[end]){
            start=end;
            end=end*2;
        }
        else{
            while(start<=end){
                int mid = (start+end)/2;

                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target==arr[mid]){
                    System.out.println(mid);
                    return;
                }
                else{
                    end=mid-1;
                }
            }
        }
    }
}
