package linkedList;
import linkedList.LinkedList;

public class Reverse {

    public static void main(String[] args)
    {
        LinkedList ls = new LinkedList();
        ls.create(0);
        ls.create(1);
        ls.create(3);
        ls.create(4);
        ls.create(5);
        ls.print();
        Reverse rs = new Reverse();
        ls.head = rs.reverse(ls.head);
        ls.print();
    }
    public ListNode reverse(ListNode head){
        if(head==null)
        {
        System.out.println("null");
        }
        ListNode temp = head;
        ListNode prev = null;
        ListNode next = null;
        while(temp!=null)
        {
            next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;

    }


}