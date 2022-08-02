
public class Subsequence {

	static int max; 
    static int lis1(int arr[], int n)
    {
        
        if (n == 1)
            return 1;
 
        int res, max1 = 1;
 
        for (int i = 1; i < n; i++) {
            res = lis1(arr, i);
            if (arr[i - 1] < arr[n - 1]
                && res + 1 > max1)
                max1 = res + 1;
        }
       
        if (max < max1)
            max = max1;

        return max1;
    }
 
   
    static int lis(int arr[], int n)
    {
       
        max = 1;
        lis1(arr, n);  
        return max;
    }
    
	public static void main(String args[]) {
		
			int arr[] = {13,1,3,4,8,19,17,8,0,20,14};
			int n = arr.length;
			System.out.println("Length of LIS: " + lis(arr, n));
	}

}
