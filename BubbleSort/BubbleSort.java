import java.util.Random; 
import java.util.Scanner;

public class BubbleSort{
	
 public void bubbleSort(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    }  
  
    /* Prints the array */
    public void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    
    public static void main(String args[]) 
    { 	
    	int response;
    	Random rand=new Random();
    	Scanner kb=new Scanner(System.in);
        BubbleSort ob = new BubbleSort(); 
        System.out.println("Size of Integers?");
    	response=kb.nextInt();
        
        int array[]= new int[response];
        for( int i=0; i<array.length;i++) 
        {
        	array[i]=rand.nextInt(10000)+1; 
        }
        
        ob.bubbleSort(array); 
        System.out.println("Bubble Sorted Array: "); 
        ob.printArray(array); 
    } 
    
   
    
} 
