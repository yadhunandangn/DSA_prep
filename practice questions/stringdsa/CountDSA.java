package stringdsa;

public class CountDSA {
    public int count(String str){
        int count=0;
        char[] ch= str.toLowerCase().toCharArray();
        for(char c : ch){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str =  "aIOgYugVEdk";
        CountDSA cdsa = new CountDSA();
        int count = cdsa.count(str);
        System.out.println(count);
    }
}
