public class Palindrome{
    public boolean isPal(String str)
    {
        char[] ch = str.toCharArray();
        int start=0;
        int end=ch.length-1;
        for (int i=0;i<ch.length;i++){
            if(ch[start++]==ch[end--]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        boolean res = pl.isPal("malayalaya");
        System.out.print(res);
    }
}