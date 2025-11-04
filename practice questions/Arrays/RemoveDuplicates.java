import java.util.*;
public class RemoveDuplicates {
    public List<Integer> remove(int[] arr)
    {
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }

        }
        return result;
        
    }
    public static void main(String[] args) {
        RemoveDuplicates RD = new RemoveDuplicates();
        int[] arr = {1,2,3,3,4,5,6,7,8,9,9,9};
        List<Integer> res = RD.remove(arr);
        System.out.print(res+" ");
        
    }
}
