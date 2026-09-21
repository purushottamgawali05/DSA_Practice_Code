
import java.util.Scanner;

public class FriendPairing {

    public static int pairing(int friends) {

        if (friends == 1) {
            return 1;
        } else if (friends == 2) {
            return 2;
        }

        // int single = pairing(friends - 1);
        // int pair = pairing(friends - 2) * (friends - 1);
        // int totalWays = single + pair;
        return pairing(friends - 1) + (pairing(friends - 2) * (friends - 1));
    }

    public static void main(String[] friend) {
        Scanner frd = new Scanner(System.in);
        int friends = frd.nextInt();

        frd.close();

        System.out.println(pairing(friends));
    }
}
