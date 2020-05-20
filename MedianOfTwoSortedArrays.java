import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	     BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
	     int T = Integer.parseInt(ob.readLine());
	     while(T-- > 0){
	         String str[] = ob.readLine().trim().split("\\s+");
	         int N = Integer.parseInt(str[0]);
	         int arr[] = new int[N];
	         int M = Integer.parseInt(str[1]);
	         int brr[] = new int[M];
	         String[] arrElements = ob.readLine().trim().split("\\s+");
	         String[] brrElements = ob.readLine().trim().split("\\s+");
	         for(int i = 0; i < N; i++){
	             arr[i] = Integer.parseInt(arrElements[i]);
	         }
	         for(int i = 0; i < M; i++){
	             brr[i] = Integer.parseInt(brrElements[i]);
	         }
	         System.out.println(new check().compute(arr, brr));
	     }
	 }
}

class check{
    public static int compute(int arr[], int brr[]){
        int arry[] = new int[arr.length+brr.length];
        int i = 0, j = 0, k = 0;
        
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                arry[k++] = arr[i++];
            }
            else{
                arry[k++] = brr[j++];
            }
        }
        while(i < arr.length){
            arry[k++] = arr[i++];
        }
        while(j < brr.length){
            arry[k++] = brr[j++];
        }
        if((arr.length+brr.length)%2 == 0){
            return (arry[arry.length/2] + arry[arry.length/2-1])/2;
        }
        return arry[arry.length/2];
    }
}
