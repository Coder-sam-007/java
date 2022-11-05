
/* 
 * As we all know array size is limited and it's a poor limitation..
 * We use arrayList to dynamically add elements to the datatype 
 */

import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
  public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<Integer>();

    nums.add(14);
    nums.add(143);
    nums.add(1423);
    nums.add(14543);
    nums.add(14234);

    System.out.println("array: " + nums.toString());

    // checking size
    System.out.println("array Size: " + nums.size());

    /*
     * Removing Elements:
     * by index --> .remove(index);
     * by value --> .remove(Integer.valueOf(VALUE))
     * by clear method --> .clear()
     * => it removes all the elments from the array.
     */

    nums.remove(1);
    nums.remove(Integer.valueOf(14543));

    System.out.println("array after removal: " + nums.toString());
    System.out.println("value at index 2 is: " + nums.get(2));

    // Updating via set method:
    nums.set(2, 1007);
    System.out.println("array after updation: " + nums.toString());

    nums.clear();
    System.out.println("After clearing: " + nums.toString());

    /* SORTING */

    ArrayList<Integer> myArr = new ArrayList<Integer>();

    myArr.add(89);
    myArr.add(108);
    myArr.add(69);
    myArr.add(890);
    myArr.add(189);
    myArr.add(809);

    System.out.println("myArr: " + myArr.toString());

    myArr.sort(Comparator.naturalOrder());
    System.out.println("myArr after sorting: " + myArr.toString());

    myArr.sort(Comparator.reverseOrder());
    System.out.println("myArr: after reverse sorting: " + myArr.toString());

    /* Checking */
    System.out.println("Does myArr contains 69: " + myArr.contains(Integer.valueOf(108)));

    System.out.println("is myArr empty: " + myArr.isEmpty());

  }
}
