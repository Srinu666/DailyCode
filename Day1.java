


// input = [0,0,2,3,5,0,1,4,9,8,6]
// output = [2,3,5,1,4,9,8,6,0,0,0]

import java.util.*;
class Test {
    public static void main(String args[]){
        
        int arr[]={0,2,0,3,4,5,9,0,2,0};
        int left=0;

        for(int right=0;right<arr.length;right++){
            if (arr[right]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        
        
    }
}