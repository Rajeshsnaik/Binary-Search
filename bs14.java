//find the element on bitonic array
public class bs14 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,10,9,8,7,6};
        int key=2;
        int index=findPeakElementIn(arr, 0, arr.length-1); //index of max element
        //System.out.println(index);
        int index1=increasing(arr, key,0,index-1);
        int index2=decreasing(arr, key,index,arr.length-1);
        if(index1 == -1)
            System.out.println(index2);
        else
            System.out.println(index1);

    }
    public static int findPeakElementIn(int[] array, int start, int end) {
        int result = -1;
        int n=end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = ((mid - 1) + n) % n;
            int next = (mid + 1) % n;
            if (array[mid] > array[prev]
                    && array[mid] > array[next]) {
                result = mid;
            }
            if (array[mid] > array[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static int increasing(int[] array,int key,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid]==key)
            {
                return mid;
            }
            if (array[mid]<key ) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int decreasing(int[] array,int key,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid]==key)
            {
                return mid;
            }
            if (array[mid]>key ) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
