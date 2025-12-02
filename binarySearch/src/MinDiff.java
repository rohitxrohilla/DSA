public class MinDiff {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,9,10};
        int start = 0;
        int end = arr.length-1;
        int target = 12;
        int sub = 10;

        while(start<=end){
            int mid = (start+end)/2;

            if(target>arr[mid]){
                if(sub>(target-arr[mid])){
                    sub=target-arr[mid];
                }
                start=mid+1;
            }
            else if (target==arr[mid]){
                System.out.println("0");
            }
            else{
                if(sub>(arr[mid]-target)){
                    sub=arr[mid]-target;
                }
                end=mid-1;
            }
        }
        System.out.println(sub);


    }
}
