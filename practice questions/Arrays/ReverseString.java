class ReverseString{
    public int[] reverse(int[] arr)
    {
        int n = arr.length;
        int[] rev = new int[n];
        int start =0 , end=n-1;
        while(start < n){
            rev[start]=arr[end];
            start++;
            end--;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2 ,3 ,4 ,5 ,6};
        ReverseString rs = new ReverseString();
        int[] res = rs.reverse(arr);
        for ( int i : res){
            System.out.print(i+" ");
        }
    }
}