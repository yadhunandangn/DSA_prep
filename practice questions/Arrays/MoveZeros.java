
import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public List<Integer> move(int[] arr)
    {
        List<Integer> res = new ArrayList<>();
        for(int i : arr)
        {
            if (i!=0){
                res.add(i);
            }
        }
        int n = res.size();
        if(n!=arr.length){
            for(int i=n;i<arr.length;i++){
                res.add(0);
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        MoveZeros MZ= new MoveZeros();
        int[] arr= {0,7,9,9,0,5,0,3};
        List<Integer> res = MZ.move(arr);
        System.out.println(res);
    }
    
}
