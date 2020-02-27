/**
 * 
 */
package merge_two_sorted_lists;


/**
 * 
 * solution to the problem: https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 */
public class Solution {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;
        
        ListNode newHead = new ListNode(-1);   
        ListNode index = newHead;
        
        while(l1 != null || l2 != null){
            
            if(l1 == null){
            	index.next = new ListNode(l2.val);
            	l2 = l2.next;
                index = index.next;
            }
            else if(l2 == null){
            	index.next = new ListNode(l1.val);
            	l1 = l1.next;
            	index = index.next;
            }
            else if(l1.val==l2.val){
                index.next = new ListNode(l1.val);
                index.next.next = new ListNode(l2.val);

                l1 = l1.next;
                l2 = l2.next;
                index = index.next.next;
            }
            else if(l1.val<l2.val){
                index.next = new ListNode(l1.val);
                l1 = l1.next;
                index = index.next;
            }
            else if(l1.val>l2.val){
                index.next = new ListNode(l2.val);
                l2 = l2.next;
                index = index.next;
            } 
        }
        return newHead.next;
        
    }

}
