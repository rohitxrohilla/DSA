public class NextAlphabet {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','h'};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int target = 'b';
        char res = '#';

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]>target){
                res= arr[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(res);
        }
    }

