// 6 count of occurance of given number
public class bs2{
    public static void main(String[] args) {
        int[] nums={1,3,6,7,7,7,8,9};
        int target=7;
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        //System.out.println(result[1]);
        
        System.out.println(result[1]-result[0]+1); 
    }

    //first occurance
    private static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;  //res
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    //last occurance
    private static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}