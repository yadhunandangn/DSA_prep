class SecondLargest{
    public int secondlargest (int[] arr){
    int max=Integer.MIN_VALUE;
    int sec=Integer.MIN_VALUE;
    for (int i : arr)
    {
        if(i>max)
        {
            sec=max;
            max=i;
        }
        else if(i>sec && i != max)
        {
            sec=i;
        }
    }
    return sec;
    }

    public static void main(String[] args) {
        SecondLargest sec= new SecondLargest();
        int[] arr = {101,76,89,88,99,95,100};
        int res = sec.secondlargest(arr);
        System.out.println(res);
    }

}