import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 
Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {

    public static void main(String args[]){
        AddTwoNumbers obj = new AddTwoNumbers();

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        System.out.println("Result -> " + obj.addTwoNumbers(l1, l2));
    }

    public List addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        
        System.out.println("List L1 -> " + l1);
        System.out.println("List L2 -> " + l2);

        List<Integer> result = new ArrayList<>();

        if(!l1.isEmpty() && !l2.isEmpty()){

            int carry = 0;
            Iterator<Integer> lis1 = l1.iterator();
            Iterator<Integer> lis2 = l2.iterator();
            while (lis1.hasNext() || lis2.hasNext()) {
                
                int x = (lis1 != null && lis1.hasNext()) ? lis1.next() : 0;
                int y = (lis2 != null && lis2.hasNext()) ? lis2.next() : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                int nextCarry = sum % 10;
                //System.out.println("Sum -> " + sum);
                //System.out.println("Carry -> " + carry);
                //System.out.println("nextCarry -> " + nextCarry);
                if(carry > 0){
                    result.add(nextCarry);
                }else{
                    result.add(sum);
                }
            }
            if(carry > 0){
                result.add(carry);
            }
            
        }
        return result;
    }  
    
}