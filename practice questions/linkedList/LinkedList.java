package linkedList;

public class LinkedList {

public ListNode head;

public static void main(String[] args)
{
    LinkedList ls = new LinkedList();
    ls.create(1);
    ls.create(2);
    ls.create(5);
    ls.print();
}

public void create (int data)
{
    if(head==null)
    {
        head=new ListNode(data);
        head.next=null;
        return;
    }
    ListNode temp = head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=new ListNode(data);
}
void print()
{
    if(head==null)
    {
        System.out.println("null");
        return;
    }
    ListNode temp = head;
    while(temp!=null)
    {
        System.out.print(temp.data +"->");
        temp=temp.next;
    }
    System.out.println("null");
}

}   

class ListNode{
     int data;
     ListNode next;
    ListNode(int data){
        this.data=data;
        this.next = null;
    }
}
