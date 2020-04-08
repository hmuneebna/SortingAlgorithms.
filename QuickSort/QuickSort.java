import java.util.Random;
import java.util.Scanner;

public class QuickSort 
{ 
    //Places the pivot position to the correct position in the array 
  public  int swap(int array[], int low, int high) 
    { 
        int pivot = array[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
           
            if (array[j] <= pivot) 
            { 
                i++; 
  
                // swap 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
  
        // swap array
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
  
        return i+1; 
    } 
  
  
   
     // array is  Array to be sorted, 
     // low is Starting index, 
     // high is Ending index */
   public void sort(int array[], int low, int high) 
    { 
        if (low < high) 
        { 
            
            int S = swap(array, low, high); 
  
            
            sort(array, low, S-1); 
            sort(array, S+1, high); 
        } 
    } 
  
    //prints
    static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
  
    //Driver
    public static void main(String args[]) 
    { 
    	int response;
    	Scanner kb=new Scanner(System.in);
    	Random rand=new Random();
    	System.out.println("Size of Integers?"); 
    	response=kb.nextInt();
    	
        QuickSort ob = new QuickSort(); 
        int array[]= new int[response];
        int n =array.length;
        for( int i=0; i<array.length;i++)
        {
        	array[i]=rand.nextInt(10000)+1;
        }
             
        ob.sort(array,0,n-1); 
        System.out.println("Quick Sorted Array: "); 
        ob.printArray(array); 
    	
    	
        
    } 
} 