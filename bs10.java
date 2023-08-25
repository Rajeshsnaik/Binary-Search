//14 Index of First 1 in a Binary Sorted Infinite Array
public class bs10 {
        public static void main(String[] args) {
	    int arr[] = {1,1,1,1,6,6,6,6,7,8,9,9,9,10};
	    int key = 6;
        System.out.println(fun(arr,key,0,1));
        }

        public static int fun(int arry[],int key,int start,int end) 
        {
        
        while(arry[end] < key)
            {
                start = end;
                end = end * 2;
            }
            int result=-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arry[mid] == key) {
                result = mid;
                end = mid - 1;
            } else if (arry[mid] > key ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
