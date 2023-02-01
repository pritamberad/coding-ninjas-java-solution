
import java.io.*;
import java.util.Scanner;



public class Main {

    
    int power(int x, long y)
    {
        if( y == 0)
            return 1;
        if (y%2 == 0)
            return power(x, y/2)*power(x, y/2);
        return x*power(x, y/2)*power(x, y/2);
    }
 
    // Function to calculate number of digits
    int digit(int x)
    {
        int n = 0;
        while (x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }
	    boolean isArmstrong (int num)
    {
        int n = digit(num);
        int temp=num, sum=0;
        while (temp!=0)
        {
            int last = temp%10;
            sum = sum + power(last,n);
            temp = temp/10;
        }
        if (sum == num)
            return true;
        else
            return false;
    }
	    public static void main(String args[])     
    {
        Main ob = new Main();
        int n;
        
        Scanner in= new Scanner(System.in);
        n = in.nextInt();
        if ( ob.isArmstrong(n) ) 
            System.out.println("true");
        else
            System.out.println("false");
    }  
}
















next code 

public class solution {
      
    // function to compute pattern
    public static void innerPattern(int n)
    {   
        // Pattern Size
   
    }
  
    // function to Print pattern
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
  
    // Main Method
  public static void print(int n)
    {
             int size = 2 * n - 1; 
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back;
                                        j++) {
                    if (i == front || i == back ||
                         j == front || j == back)
                        a[i][j] = n;
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a, size);
    }
}








public class Solution
{
    public static int countStringsHelper(int m, int freqB, int freqC)
    {
        if (freqB > 1 || freqC > 2)
        {
            // Invalid string.
            return 0;
        }
        
        if (m == 0)
        {
            // Valid string generated.
            return 1;
        }
        
        if (freqB == 1 && freqC == 2)
        {
            // Only one string is possible i.e. string with all remaining characters as a.
            return 1;
        }

        // One by one choosing 'a', 'b' and 'c' as the next character.
        int counter = countStringsHelper(m - 1, freqB, freqC);
        counter = (counter % 1000000007 + countStringsHelper(m - 1, freqB + 1, freqC) % 1000000007) % 1000000007;
        counter = (counter % 1000000007 + countStringsHelper(m - 1, freqB, freqC + 1) % 1000000007) % 1000000007;

        return counter;
    }

    public static int countStrings(int n)
    {
        return countStringsHelper(n, 0, 0);
    }
}

second code

public class solution {

	public static int sum(int arr[])
	{
		int sum =0;
         if (arr.length==1)
		 return arr [0];
		  for (int i =0 ; i<arr.length; i++)
		  sum +=arr[i];
		 if (sum >=10);
		 return singlesum(sum);
	}
	public static int singlesum (int n){
		int s = 0;
		while (n>0)
		{
			int rem =n%10;
			s+=rem;
			n/=10;
		}
		if(s>=10)
			return singlesum(s);
		else
			return s;

	}

}