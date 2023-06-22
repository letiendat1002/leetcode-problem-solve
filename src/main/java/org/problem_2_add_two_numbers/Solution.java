package org.problem_2_add_two_numbers;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var result = new ListNode();
        var currentR = result;
        var tenth = 0;
        while (l1 != null || l2 != null) {
            var temp = 0;
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }

            temp += tenth;

            if (temp >= 10) {
                currentR.val = temp % 10;
                tenth = temp / 10;
            } else {
                currentR.val = temp;
                tenth = 0;
            }
            if (l1 != null || l2 != null) {
                currentR.next = new ListNode();
                currentR = currentR.next;
            } else {
                if (tenth != 0) {
                    currentR.next = new ListNode(tenth);
                }
            }
        }
        return result;
    }
}

