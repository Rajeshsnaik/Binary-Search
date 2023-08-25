// 7 Find an Element in a Rotated Sorted Array
public class bs4 {
    public static void main(String[] args) {
        int nums[]={3,4,5,1,2};
        int target=1;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int arrayStartIndex = findRotation(nums);
        int index1= binarySearch(nums, arrayStartIndex,nums.length-1,target);
        int index2 = binarySearch(nums, 0,arrayStartIndex-1,target);
        return index1==-1?index2:index1;
    }
    
    //used to find the smallest element(pivot) index
    public static int findRotation(int [] arr){
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
        return 0;
    }
    
    public static int binarySearch(int [] arr,int start , int end,int target){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>=target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
}

