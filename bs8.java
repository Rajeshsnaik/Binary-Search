//12 Next Alphabetical Element
public class bs8 {
    public static void main(String[] args) {
        char arr[]={'a','f','g','p'};
        int n=arr.length;
        System.out.println("Next alphabet is :"+nextChar(arr,n,'a'));
    }
   static char nextChar(char arr[], int n, char key) {
	int start = 0, end = n - 1, mid;
	char res = '0';

	while (start <= end) {
		mid = start + (end - start) / 2;
		if (arr[mid] > key) {
			res = arr[mid];
			end = mid - 1;
		}
		else 
        {
			start = mid + 1;
		}
	}
	return res;
} 
}
