import java.util.*;
class Meargesort 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[100];
    int n;

    System.out.println("Enter the number of element");
        n=sc.nextInt();   

        System.out.println("Enter the element");
        if(n<=100)
        {
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
        }
        else 
        {
          System.out.println("array index out of bound and value should be less than 100"); 
        }

        for(int i=0;i<n;i++)
        {
          System.out.println("Element is "+arr[i]);
        }

    
  } 
}
