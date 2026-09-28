
class Solution {
    public boolean isPalindrome(ListNode head) {
        int []a=new int[100000];
        int i=0;
        while(head!=null){
            a[i++]=head.val;
            head=head.next;
        }
        for(int j=0;j<i/2;j++){
            if(a[j]!=a[i-j-1])
            return false;
        }
        return true;
    }
}