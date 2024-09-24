//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
          int large = arr[0];
        int secondLargest = -1;
        int n = arr.length;
        for(int i=1;i<=n-1;i++){
           
                if(large < arr[i]){
                    secondLargest = large;
                    large = arr[i];
                }else if (arr[i] > secondLargest &&arr[i]< large) {
                secondLargest = arr[i]; // Update second largest
            }
            }
          return secondLargest; 
        }
       
    
}