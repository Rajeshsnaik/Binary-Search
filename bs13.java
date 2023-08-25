//18 Find maximum element in Bitonic Array
public class bs13 {
    public static void main(String[] args) {
        int arr[]={5,10,20,30,3,2,1};
        int index=findPeakElementIn(arr, 0, arr.length-1);
        System.out.println(arr[index]);
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
}
