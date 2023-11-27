import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode finalList=new ListNode(0);
        ListNode currentList=finalList;

        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                currentList.next=list2;
                list2=list2.next;
            }else {
                currentList.next=list1;
                list1 = list1.next;
            }
            currentList=currentList.next;

        }
        currentList.next = list1 == null ? list2 : list1;
        return finalList.next;
    }

//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode prehead = new ListNode(0);
//        ListNode cur = prehead;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//
//        cur.next = l1 == null ? l2 : l1;
//        return prehead.next;
//    }

    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(4);
        ListNode L3 = new ListNode(6);
        L1.next=L2;
        L2.next=L3;

        ListNode L4 = new ListNode(2);
        ListNode L5 = new ListNode(3);
        ListNode L6 = new ListNode(5);

        L4.next=L5;
        L5.next=L6;
        ListNode mergedList = mergeTwoLists(L1,L4);
        while(mergedList!=null){
            System.out.println("merged list: " + mergedList.val);
            mergedList=mergedList.next;
        }

    }
}
