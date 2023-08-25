//13 Find position of an target in an Infinite Sorted Array
public class bs9 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int res = findPos(arr, 9);
        System.out.println(res);
    }

    public static int findPos(int a[], int target) {
        int start = 0;
        int end = 1;
        while (target > a[end]) {
            start = end;
            end = end * 2;
        }
        return binarySearch(a, start, end, target);
    }

    public static int binarySearch(int a[], int start, int end, int target) {
        int n = a.length;
        start = 0;
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else if (target < a[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

}
