package recursion;

public class Fibbonacci{
    public static void main(String args[])
    {
        Fibbonacci fb = new Fibbonacci();
        int[] arr = fb.fibo(6);
        for(int x   : arr)
        {
            System.out.print(x+" ");
        }
        
    }
    public int[] fibo(int x)
    {
        int[] fib = new int[x];
       if (x>=1) fib[0] = 0;
        if (x>=2) fib[1] = 1;
        for(int i = 2 ;i<x;i++)
        {
            fib[i]=fib[i-1] + fib[i-2];
        }
        return fib;

    }
}