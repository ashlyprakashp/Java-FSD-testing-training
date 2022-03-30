package day18;

/* 1.	Self learn Merge sort algorithm and Implement it. */

public class MergSort  
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    {                          // Find sizes of two subarrays to be merged 
    	int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int[n1];  /* Create temp arrays */
        int R[] = new int[n2]; 

        for (int i = 0; i < n1; ++i)  /*Copy data to temp arrays*/ 
        	L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
        
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
        // Initial index of merged subarray array 
        int k = l;
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        }
        while (i < n1) {   // Copy remaining elements of L[] if any
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) {    /* Copy remaining elements of R[] if any */
        	arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    // Main function that sorts arr[l..r] using 
    // merge() 
    public void sort(int arr[], int l, int r) 
    { 
        if (l < r) { 
            int m =l+ (r-l)/2; 
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
            merge(arr, l, m, r); 
        } 
    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) { 
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
        System.out.println("Given Array"); 
        printArray(arr); 
        MergSort ob = new MergSort(); 
        ob.sort(arr, 0, arr.length - 1); 
        System.out.println("\nSorted array"); 
        printArray(arr); 

    } 
} 