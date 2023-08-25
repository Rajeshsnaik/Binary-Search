//9 Searching in a Nearly Sorted Array
public class bs5 {
    public static void main(String[] args) {
        int arr[]={5,10,30,20,40};
        System.out.println(searchInNearlySortedArray(arr,20));
    }

    public static int searchInNearlySortedArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid - 1 >= start && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid + 1 <= end && arr[mid + 1] == target) {
                return mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }
        return -1;
    }
}
