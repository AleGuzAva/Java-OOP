// HW4 Q3: Execution Time
// Alejandro Guzman Avalos
// Professor Jahani COP 3330 Section 22
// February 15th, 2022

// Packages
package alejandro_hw_4;

// Main Function
public class ExecutionTime {
    public static void main(String[] args){
    
    // Initialize array and random key
    double array[] = new double[100000];
    double key = Math.random() * 100;
    
    // Inputs random numbers for array
    for(int i=0; i<array.length; i++){
        array[i] = Math.random() * 100;
    }
        
    System.out.printf("The execution time for Linear Search is: "
            + "%.2f\n", linSearch(array, key));
    System.out.printf("The execution time for Binary Search is: "
            + "%.2f\n", binSearch(array, key));    
    
    }
    public static double linSearch(double[] array, double key){
        // Obtain Execution Time
        long startTime = System.currentTimeMillis();
        
        // Method for finding key in the list
        for(int i=0; i<array.length; i++){
            if(key == array[i])
                continue;
            continue;
        }
       
        // Obtain Execution Time
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
    
        return executionTime;
    }
    public static double binSearch(double[] array, double key){
        // Obtain Execution Time
        long startTime = System.currentTimeMillis();
        
        // Binary Search to find key in list
        int low = 0;
        int high = array.length -1;
        
        while(high >= low){
            int mid = (low+high) / 2;
            if(key < array[mid])
                high = mid - 1;
            else if(key == array[mid])
                continue;
            else
                low = mid + 1;
        }
        
        // Obtain Execution Time
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
    
        return executionTime;
    }    
}
