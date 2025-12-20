package stringdsa;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(rd.remove("programming")); 
    }

    public String remove(String str) {

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (hs.add(ch)) {    
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
