class IsSorted{
    public boolean isSorted(int[] arr)
    {
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsSorted is= new IsSorted();
        int[] arr = {2,3,4,5,6,7};
        boolean res=is.isSorted(arr);
        System.out.println(res);
    }
}