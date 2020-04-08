import java.util.Random;
import java.util.Scanner;

// Java program for implementation of Insertion Sort 
class InsertionSort { 
    
  public void sort(int array[]) 
    { 
        int number = array.length; 
        for (int i = 1; i < number; ++i) { 
            int check = array[i]; 
            int j = i - 1; 
  
            while (j >= 0 && array[j] > check) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = check; 
        } 
    } 
  
    
    static void printArray(int array[]) 
    { 
        int number = array.length; 
        for (int i = 0; i < number; ++i) 
            System.out.print(array[i] + " "); 
  
        System.out.println(); 
    } 
    
    public static void main(String args[])
    {
    	int response;
    	Random rand=new Random();
    	Scanner kb=new Scanner(System.in);

        InsertionSort ob = new InsertionSort(); 
        System.out.println("Size of Integers?");
        response=kb.nextInt();
        int array[]= new int[response];
        for( int i=0; i<array.length;i++)
        {
        	array[i]=rand.nextInt(10000)+1;
        }
             
        ob.sort(array); 
        System.out.println("Insertion Sorted Array: "); 
        ob.printArray(array); 
    }
    
   
} 