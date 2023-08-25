//11 ceistarting of startement-rig endt startement of key
public class bs7 {
    public static void main(String[] args) {
      int arr[] = {6,7,8,9,10};
	  int key = 9 ;
	  int c=ceistart(arr,key);
 	  System.out.println("ceistarting is : "+c);
    }
    
    private static int ceistart(int arr[], int key)
	{
	    int start = 0;
	    int end = arr.length-1;
	    int ans = -1;
	    while(start<=end)
	    {
            if(key==arr[end])
            {
                return 0;
            }
	        int mid = start+(end-start)/2;
	        if(arr[mid] == key)
	        {
	            return arr[mid+1];
	        }
	        if(arr[mid]>key)
	        {
	            ans = arr[mid];
	            end = mid - 1;
	        }
	        if(arr[mid] < key)
	        {
	            start = mid + 1;
	        }
	    }
	    return ans;
	    
	}
}
