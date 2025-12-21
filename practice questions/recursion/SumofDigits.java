package recursion;

public class SumofDigits {
    public static void main(String[] args) {
        SumofDigits sd = new SumofDigits();
        System.out.println(sd.sum(564));
    }
    public int sum(int x) {
    if (x == 0)
        return 0;
    return (x % 10) + sum(x / 10);
}

    
}
 