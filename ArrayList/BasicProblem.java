package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicProblem {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        //print in reverse order
        for (int idx = list.size() - 1; idx >= 0; idx--) {
            System.out.print(list.get(idx) + " ");
        }
        System.out.println();

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

        //swap two numbers
        System.out.println(" Before swapping: " + list);
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);

        System.out.println(" after swapping: " + list);

        // sorting by in-built method -> ascending order
        Collections.sort(list);
        System.out.println(list);

        // sorting by in-built method -> descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
