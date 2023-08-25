//21 Search in Row wise And Column wise Sorted Array
public class bs15{
        public static void main(String[] args) {
            int[][] arr={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                    {32,33,39,50}};
            System.out.println(searchmatrix(arr, 30));
        }

        public static boolean searchmatrix(int[][] matrix,int t)
        {
                    int n = matrix.length;  //row length
                    int m = matrix[0].length; //column length
                    int i=0,j=m-1;
                    while(i>=0 && i<n && j>=0 && j<m)
                    {
                        // if(m[i][j]==t)
                        //     return j;
                        if(matrix[i][j]==t)
                            return true;
                        else if(matrix[i][j]>t)
                            j--;
                        else if(matrix[i][j]<t)
                            i++;
                    }
                    return false;
        }
}
//         public boolean searchMatrix(int[][] matrix, int target) {
        
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int total = m*n;
        
//             int left = 0;
//             int right = total-1;
        
//             while(left<=right)
//             {
//                 int mid = (left+right)/2;
                
//                 if(matrix[mid/m][mid%m]==target)
//                 {
//                     return true;
//                 }else if(matrix[mid/m][mid%m]>target)
//                 {
//                     right = mid-1;
//                 }else if(matrix[mid/m][mid%m]<target)
//                 {
//                     left = left+1;
//                 }
//             } 
        
//         return false;
//     }
// }