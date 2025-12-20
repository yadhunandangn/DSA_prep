package stringdsa;

public class LongestPrefix {

    public static void main(String[] args) {
        LongestPrefix lp = new LongestPrefix();
        String[] str = {"yadhu", "yadh", "yad"};
        System.out.println(lp.prefix(str)); // Output: yad
    }

    public String prefix(String[] str) {

        String first = str[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
