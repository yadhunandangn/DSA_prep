package backtracking;
import java.util.*;

public class AllSubsets {

    public static void main(String args[]) {
        AllSubsets subset = new AllSubsets();
        int[] arr = {1, 2};
        System.out.println(subset.find(arr));
    }

    public List<List<Integer>> find(int[] arr) {
        List<List<Integer>> subarrays = new ArrayList<>();
        backtrack(arr, 0, new ArrayList<>(), subarrays);
        return subarrays;
    }

    private void backtrack(int[] arr, int index,
                           ArrayList<Integer> current,
                           List<List<Integer>> subarray) {

                            
        subarray.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);         
            backtrack(arr, i + 1, current, subarray); 
            
            current.remove(current.size() - 1); 
        }

        
    }
}
