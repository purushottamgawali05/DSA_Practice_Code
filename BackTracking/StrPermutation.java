
public class StrPermutation {

    public static void findPermutation(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int idx = 0; idx < str.length(); idx++) {
            char curr = str.charAt(idx);
            String nStr = str.substring(0, idx) + str.substring(idx + 1);
            findPermutation(nStr, result + curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
