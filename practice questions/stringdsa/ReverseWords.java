package stringdsa;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords rev=new ReverseWords();
        String str = "My Name Is Yadhunandan gn";
        System.out.println(rev.reverse(str));
        
    }
    public String reverse(String str){
        String[] st = str.split(" ");
        int start=0;
        int end=st.length-1;
        while(start<end){
            String temp = st[start];
            st[start]=st[end];
            st[end]=temp;
            start++;
            end--;
        }
        return String.join(" ", st);
    }
}
