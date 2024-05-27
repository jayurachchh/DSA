import java.util.*;
public class Pascal 
{

	    public static int fact(int i) {
        int result = 1;
        for (int n = 1; n <= i; n++) {
            result *= n;
        }
        return result;
    }
       
    // Formula: n! / (r! * (n - r)!)
    public static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

/*	public static long nCr(int n, int r) 
	{
	long res = 1;
	// calculating nCr:
		for (int i = 0; i < r; i++) 
		{
			res = res * (n - i);
			res = res / (i + 1);
		}
		return res;
	}*/
	public static int pascalTriangle(int r, int c)  
	{
		int element = (int) nCr(r - 1, c - 1);
		return element;
	}
	public static void main(String[] args) 
	{
		int r = 2; // row number
		int c = 4; // col number
		int element = pascalTriangle(r, c);
		System.out.println("The element at position (r,c) is: " + element);
	}
}



/*public class Pascal {

    // Method factorial
    public static int fact(int i) {
        int result = 1;
        for (int n = 1; n <= i; n++) {
            result *= n;
        }
        return result;
    }

    // Formula: row! / (col! * (row - col)!)
    public static int pascalTriangle(int col, int row) {
        return fact(row) / (fact(col) * fact(row - col));
    }


    public static void main(String[] args) {
        System.out.println(pascalTriangle(2,4));
    }
}*/