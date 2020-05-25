import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int a[], int n) {
        boolean flag = true;
        for(int i: a){
            if(i > 0){
                flag = false;
            }
        }
        if(flag){
            Arrays.sort(a);
            return a[n-1];
        }
        int maxKadane = kadane(a);
        int maxSum = 0;
        for(int i = 0; i < n; i++){
            maxSum += a[i];
            a[i] = -a[i];
        }
        maxSum += kadane(a);
        return (maxSum > maxKadane) ? maxSum: maxKadane;
        //return Integer.max(kadane(a,n), reverseKadane(a,n));
    }
    static int kadane(int arr[]){
        int curMax = 0, maxSoFar = Integer.MIN_VALUE;
        for(int i: arr){
            curMax = Math.max(i, curMax+i);
            maxSoFar = Math.max(maxSoFar, curMax);
        }
        return maxSoFar;
    }
}

