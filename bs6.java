// 10 flooring of element-left element of key
public class bs6
{
	public static void main(String[] args) {
	  int arr[] = {6,7,8,9,10};
	  int key = 8 ;
	  int f=floor(arr,key);
 	  System.out.println("flooring is : "+f);
	}
	
	public static int floor(int[] arr,int key) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int max=0;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
                return arr[mid];  //return value instead of index

            if(arr[mid]>key)
            {
                end=mid-1;
            }
            if(arr[mid]<key) {
                start=mid+1;
                max=arr[mid];
            }
        }
        return max;
    }
}