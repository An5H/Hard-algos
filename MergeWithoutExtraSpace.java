//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int arr1[] = new int[n];
		    int arr2[] = new int[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    new MergeSort().merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class MergeSort
{
    public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i : arr1){
            arr.add(i);
        }
        for(int i : arr2){
            arr.add(i);
        }
        Collections.sort(arr);
        for(int i = 0; i < n; i++){
            arr1[i] = arr.get(i);
        }
        for(int i = 0; i < m; i++){
            arr2[i] = arr.get(n+i);
        }
    }
}
