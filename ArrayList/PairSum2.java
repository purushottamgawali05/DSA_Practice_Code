
import java.util.ArrayList;

public class PairSum2 {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        int left = 0, right = 0;

        int len = list.size();

        for (int idx = 0; idx < len - 1; idx++) {
            if (list.get(idx) > list.get(idx + 1)) {
                right = idx;
                left = idx + 1;
                break;
            }
        }

        while (left != right) {
            int sum = list.get(right) + list.get(left);

            if (sum == target) {
                System.out.println(true);
                return;
            }

            if (sum < target) {
                left = (left + 1) % len;
            } else {
                right = (len + right - 1) % len;
            }

            // if (left == len) {
            //     left = 0;
            // } else if (right == -1) {
            //     right = len - 1;
            // }
        }

        System.out.println(false);
    }
}
