package Question_7;
import java.util.Scanner;

public class SortArray {

	static String search(int arr[], int n, int x)
    {
        
        if (arr[n - 1] == x)
            return "Found";
  
        int backup = arr[n - 1];
        arr[n - 1] = x;
  
        for (int i = 0;; i++) {
            
            if (arr[i] == x) {
                arr[n - 1] = backup;
                
                if (i < n - 1)
                    return "Found";
                
                return "Not Found";
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 };
        int n = arr.length;
        System.out.println("Ënter the number to be searched");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        
        System.out.println(search(arr, n, x));
    }
}
