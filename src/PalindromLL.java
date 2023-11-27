public class PalindromLL {
    public static boolean isPalindrome(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = head;
        ListNode startSecond;
        ListNode newList=previousNode;
        //newList=previousNode;
        if(currentNode.next==null){
            return true;                //for 1 element in list
        }
        while (true) {
            currentNode = currentNode.next.next;
            if (currentNode == null) {  //for even list
                startSecond = previousNode.next;
                previousNode.next = null;
                break;
            }
            if (currentNode.next == null) { //for odd list
                startSecond = previousNode.next.next;
                previousNode.next = null;//loosing midddle element
                break;
            }
            previousNode = previousNode.next;
        }

        //reverse startSecond list
        ListNode currPointer = startSecond;
        ListNode reversedList = null;
        while (currPointer != null) {
            ListNode nextNode = currPointer.next;
            currPointer.next = reversedList;
            reversedList = currPointer;
            currPointer = nextNode;
        }

        //remove first element 0
//        ListNode tempList=null;
//        while(newList!=null){
//            tempList = newList.next;
//            newList.next=null;
//            break;
//        }
        //now compare reversedList(reversed list of startSecond) and newList list
        while (newList != null && reversedList != null) {
            if (newList.val != reversedList.val) {
                return false; // If data in nodes is not equal, the lists are not equal
            }
            newList = newList.next;
            reversedList = reversedList.next;
        }

        // If one of the pointers is not null while the other is, the lists are not equal
        return newList == null && reversedList == null;
    }


    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        ListNode L2 = new ListNode(2);
        ListNode L3 = new ListNode(3);
        ListNode L4 = new ListNode(2);
        ListNode L5 = new ListNode(1);
        L1.next=L2;
        L2.next=L3;
        L3.next=L4;
        L4.next=L5;

        boolean isPalindrome = isPalindrome(L1);
            System.out.println("isPalindrome : " + isPalindrome);

    }
}
