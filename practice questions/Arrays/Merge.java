import java.util.*;

public class Merge {
    public List<Integer> merge(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        int ar1 = 0, ar2 = 0;

        
        while (ar1 < arr1.length && ar2 < arr2.length) {
            if (arr1[ar1] == arr2[ar2]) {
                res.add(arr1[ar1]);
                ar1++;
                ar2++;
            } else if (arr1[ar1] < arr2[ar2]) {
                res.add(arr1[ar1]);
                ar1++;
            } else {
                res.add(arr2[ar2]);
                ar2++;
            }
        }

        while (ar1 < arr1.length) {
            res.add(arr1[ar1++]);
        }

        while (ar2 < arr2.length) {
            res.add(arr2[ar2++]);
        }

        return res;
    }

    public static void main(String[] args) {
        Merge mg = new Merge();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        List<Integer> res = mg.merge(arr1, arr2);
        System.out.println(res);
    }
}
