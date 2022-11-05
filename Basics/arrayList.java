
/* 
 * As we all know array size is limited and it's a poor limitation..
 * We use arrayList to dynamically add elements to the datatype 
 */

import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<Integer>();

    nums.add(14);
    nums.add(143);
    nums.add(1423);
    nums.add(14543);
    nums.add(14234);

    System.out.println(nums.toString());
    System.out.println(nums.get(3));
    System.out.println(nums.val);
  }
}
