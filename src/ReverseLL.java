public class ReverseLL {
    public static ListNode reverseList(ListNode head) {
        ListNode currentNode=head;
        ListNode previousNode=null;
        while(currentNode!=null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode=nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(2);
        ListNode L3 = new ListNode(3);
        ListNode L4 = new ListNode(4);
        ListNode L5 = new ListNode(5);
        L1.next=L2;
        L2.next=L3;
        L3.next=L4;
        L4.next=L5;

        ListNode reversedList = reverseList(L1);
        while(reversedList!=null){
            System.out.println("reversedList : " + reversedList.val);
            reversedList=reversedList.next;
        }

    }
}
