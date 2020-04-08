import java.util.Random;
import java.util.Scanner;

public class MergeSort 
{ 
   public void merge(int array[], int l, int m, int r) 
    { 
        // Find sizes of two subarray to be merged 
        int number1 = m - l + 1; 
        int number2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [number1]; 
        int R[] = new int [number2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<number1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<number2; ++j) 
            R[j] = array[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0; 
  
        // Initial index of merged subarray array 
        int k = l; 
        while (i < number1 && j < number2) 
        { 
            if (L[i] <= R[j]) 
            { 
                array[k] = L[i]; 
                i++; 
            } 
            else
            { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < number1) 
        { 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < number2) 
        { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
   //Sort
   public void Sort(int array[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            Sort(array, l, m); 
            Sort(array , m+1, r); 
  
            // Merge the sorted halves 
            merge(array, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
   public static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println();  
    } 
  
    // Driver method 
    public static void main(String args[])        
    { 
    	int response;
    	Random rand=new Random();
    	Scanner kb=new Scanner(System.in);
    	MergeSort ob = new MergeSort();
    	System.out.println("Size of Integers?");
    	response=kb.nextInt();
        int array[]= new int[response];  
        for( int i=0; i<array.length;i++)
        {
        	array[i]=rand.nextInt(10000)+1;
        }
             
        ob.Sort(array,0,array.length-1); 
        System.out.println("Merge Sorted Array: "); 
        ob.printArray(array); 
    } 
} 
