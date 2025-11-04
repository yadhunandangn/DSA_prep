import java.util.Arrays;
class MaxElement{
    public int Max(int[] arr){
        int max=0;
        Arrays.sort(arr);

        return arr[arr.length-1];
    }
    public static void main(String[] args){
        MaxElement max=new MaxElement();
        int[] arr=  {1,79,63,99};
        int res = max.Max(arr);
        System.out.println(res);
    }
}