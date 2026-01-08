package backtracking;
class Permutations{
    public static void main(String[] args)
    {
        Permutations pm = new Permutations();
        String str = "ABC";
        pm.find(str.toCharArray(),0);
    }

    public void find(char[] str,int index)
    {
        if(index==str.length-1)
        {
            System.out.println(new String(str));
            return;
        }
        for(int i=index;i<str.length;i++)
        {
            swap(str,index,i);
            find(str,index+1);
            swap(str,i,index);
        }
    }
    public void swap(char[] str,int i,int j)
    {
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}