//17 Peak Element

public class bs12 {
    public static void main(String[] args) {
        int arr[]={100,15,20};
        System.out.println(findPeakElementIn(arr, 0, arr.length-1));
    }
    public static int findPeakElementIn(int[] array, int start, int end) {
        int n=end;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int prev = ((mid - 1) + n) % n;
            int next = (mid + 1) % n;
            if (array[mid] > array[prev] && array[mid] > array[next]) {
                result = mid;
            }
            if (array[mid] >= array[mid - 1] && end<=mid+1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
