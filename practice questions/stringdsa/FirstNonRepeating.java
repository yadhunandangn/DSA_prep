package stringdsa;
import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        FirstNonRepeating FNR = new FirstNonRepeating();
        String str = "adhunandan";
        System.out.println(FNR.find(str));
    }

    public char find(String str)
    {
        HashMap<Character,Integer> kv = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            kv.put(ch, kv.getOrDefault(ch, 0)+1);
            
        }
        for(char ch : str.toCharArray())
        {
            if(kv.get(ch)==1)
            {
                return ch;
            }
        }
        return '\0';
    }
    
}
