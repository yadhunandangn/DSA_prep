import java.util.*;
public class LeftRotate {
    public List<Integer> Rotate(int[] arr , int iter)
    {
        List<Integer> res = new ArrayList<>();
        for(int i=iter;i<arr.length;i++)
        {
            res.add(arr[i]);
        }
        for(int i=0;i<iter;i++){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        LeftRotate LR = new LeftRotate();
        int[] arr={1,2,3,4,5,6};
        List<Integer> res = LR.Rotate(arr, 3);
        
            System.out.print(res);
        
    }
    
}
