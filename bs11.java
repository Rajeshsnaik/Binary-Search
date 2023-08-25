//15 Minimum Difference Element in a Sorted Array
public class bs11 {
    public static void main(String[] args) 
	{
		int [] arr = {1,3,8,10,15};
		int key = 12;
		System.out.println(search(arr, key));
	}
	public static int search(int[] arr,int key)
	{
		int start= 0;
		int end= arr.length-1;
		
		while(start<=end) 
		{
			int mid = start +(end-start)/2;
			if(arr[mid]==key)
			{
				return arr[mid];	//if key is present in array
			}
			else if(arr[mid]>key)
			{
				end = mid-1;
			}
			else 
			{
				start = mid+1;	
			}
		}
		int s=start;
		int e=end;

		//now finds the differnce
		int value1 = arr[s]-key;
		int value2 = arr[e]-key;
		int c1= Math.abs(value1);
		int c2= Math.abs(value2);
		 if(c1<c2)
		 {
			return arr[start];
		 }
		 else
		 {
			return arr[end];
		 }

	}
}
