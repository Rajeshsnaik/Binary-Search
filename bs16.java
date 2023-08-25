//Allocate Minimum Number Of Pages
//vvvvvvvvvvvvvvvvvvvvv imp. 

import java.util.Arrays;
class bs16 {

    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(minimiseNoOfPages(arr,2));
    }
    public static int minimiseNoOfPages(int[] arr,int noOfStudent){
        int start= Arrays.stream(arr).max().getAsInt(); //max element in an array
        int end= Arrays.stream(arr).sum(); //sum of array
        int noOfBooks=arr.length;
        int result = -1;

        if(noOfStudent>noOfBooks){
            return -1;
        }else{
            while(start<=end){

                int mid=start+(end-start)/2;

                if(isValid(arr,mid,noOfStudent)){
                    result=mid;
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            return result;
        }
    }
    static boolean isValid(int arr[],int maxNoOfPages,int noOfStudent){

        int student=1;
        int sumOfPagesPerStudent=0;
        int noOfBooks=arr.length;

        for (int i=0;i<noOfBooks;i++){

            sumOfPagesPerStudent=sumOfPagesPerStudent+arr[i];

            if(sumOfPagesPerStudent>maxNoOfPages){
                student++;
                sumOfPagesPerStudent=arr[i];
            }

            if (student>noOfStudent){
                return false;
            }
        }
        return true;
    }
}

