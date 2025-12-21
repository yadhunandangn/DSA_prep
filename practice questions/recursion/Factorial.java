package recursion;

public class Factorial {
    public static void main(String args[])
    {
        Factorial ft = new Factorial();
        System.out.println(ft.fact(5));
    }
    public int fact(int x)
    {
        if( x==0 || x==1)
        {
            return 1;
        }
        return x*fact(x-1);
        
    }
}
