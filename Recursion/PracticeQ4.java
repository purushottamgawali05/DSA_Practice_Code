
public class PracticeQ4 {

    public static int expand(String word, int idx, int end) {
        if (end == word.length()) {
            return 0;
        }
        int count = 0;
        if (word.charAt(idx) == word.charAt(end)) {
            count = 1;
        }
        return count + expand(word, idx, end + 1);
    }

    public static int countfunc(String word, int idx) {
        if (idx == word.length()) {
            return 0;
        }

        int count = expand(word, idx, idx);

        return count + countfunc(word, idx + 1);
    }

    public static void main(String Q4[]) {
        String word = "abcab";
        int idx = 0;
        // int end = 0;
        // int count = 0;
        System.out.println(countfunc(word, idx));
    }
}

// int count = 0;
// for (int i = 0; i < word.length(); i++) {
//     for (int j = i; j < word.length(); j++) {
//         if (word.charAt(i) == word.charAt(j)) {
//             count++;
//         }
//     }
// }
        // System.out.println(count);
