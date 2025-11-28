public class NearlySorted {
    public static void main(String[] args) {
        int[] arr = {20,10,30,40,50,70,60};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int target = 10;

        while(start<=end){
            int mid = (start+end)/2;

            if(target==arr[mid]){
                System.out.println(mid);
                return;
            }
            else if(target==arr[mid+1] && mid+1<=end){
                System.out.println(mid+1);
                return;
            }
            else if(target==arr[mid-1] && mid-1>=start){
                System.out.println(mid-1);
                return;
            }
            else if(target<arr[mid]){
                end=mid-2;
            }
            else{
                start=mid+2;
            }
        }
        System.out.println("qwertyuiop");
    }
}
