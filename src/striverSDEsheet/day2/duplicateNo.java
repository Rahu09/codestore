package striverSDEsheet.day2;

public class duplicateNo {
    public static void main(String[] args) {
        int[] nums= {2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDuplicate_index_sort(nums));

    }

    static public int findDuplicate_index_sort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; ) {
            int n = nums[i];
            if (n == i + 1) {
                i++;
            } else if (n == nums[n - 1]) {
                return n;
            } else {
                nums[i] = nums[n - 1];
                nums[n - 1] = n;
            }
        }
        return 0;
    }

    // Visited
    public static int findDuplicate_mark(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }
    public int findDuplicate_fastSlow(int[] nums) {
        int slow = 0;
        int fast = 0;
        //important to apply do-while. As slow and fast are same in first transval.
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

/*

Index Sort
If the array is sorted, the value of each array element is its index value index + 1, then we can do this:

If nums[i] == i + 1, it means that the order has been sorted, then skip, i++;
If nums[i] == nums[nums[i] - 1], it means that there is already a value at the correct index, then this value is a duplicated element;
If none of the above is satisfied, exchange the values of nums[i] and nums[nums[i] - 1].
With extra O(logn) space, with modifying the input.

    // Index Sort
    // n+ 1 numbers in n.
    public static int findDuplicate_index_sort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; ) {
            int n = nums[i];
            if (n == i + 1) {
                i++;
            } else if (n == nums[n - 1]) {
                return n;
            } else {
                nums[i] = nums[n - 1];
                nums[n - 1] = n;
            }
        }

        return 0;
    }
Analysis
Time Complexity: O(n)
Space Complexity: O(1)
-----------------------------------------------------------------------

Marking visited value within the array
Since all values of the array are between [1..n] and the array size is n+1，while scanning the array from left to right, we set the nums[n] to its negative value.

With extra O(1) space, with modifying the input.

    // Visited
    public static int findDuplicate_mark(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }

        return len;
    }
Analysis
Time Complexity: O(n)
Space Complexity: O(1)

---------------------------------------------------------------------------------

Fast Slow Pointers
This problem is as same as 142. Linked List Cycle II, you can refer to this solution for the explanation of the slow fast pointer approach to solve this problem.

The key is to understand how to treat the input array as a linked list.

Take the array [1,3,4,2] as an example, the index of this array is [0, 1, 2, 3], we can map the index to the nums[n].

0->1
1->3
2->4
3->2
Start from 0， use value nums[n] as a new index, and so on, until the index exceeds the bounds. This produces a sequence similar to a linked list.

0->1->3->2->4->null
If there are a repeated numbers in the array, take the array [1,3,4,2,2] as an example,

0->1
1->3
2->4
3->2
4->2
Similarly, a linked list is like that:

0->1->3->2->4->2->4->2->…
Here 2->4 is a cycle, then this linked list can be abstracted as the following figure:

Link List

With extra O(1) space, without modifying the input.

    public int findDuplicate_fastSlow(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
Analysis
Time Complexity: O(n)
Space Complexity: O(1)

 */
