//Number of Times a Sorted array is Rotated
public class bs3 {
    public static void main(String[] args) {
        int[] arr = {9,10,11,12,1,2,3,4};
        int ans = findPivot(arr); //pivot is to find the min element index in the array
        System.out.println(ans);
    }
        static int findPivot(int [] arr)
        {
            int N = arr.length;
            int start = 0,end = N-1;
            while(start<=end){
                int mid = start + (end - start)/2;
                int prev = (mid - 1 + N)%N;
                int next = (mid + 1)%N;
                if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                    return mid;
                else if(arr[mid]>=arr[0])
                    start = mid+1;
                else 
                    end = mid-1;
            }
        return -1;
    }
}
