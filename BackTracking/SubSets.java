/*
public class SubSets {
  public static void findSubSets(String str, String result, int idx) {
    if (str.length() == idx) {
      if (result.length() == 0) {
        System.out.println("null");
      } else { 
        System.out.println(result);
    }
    return;
        }
        findSubSets(str, result + str.charAt(idx), idx + 1);
        findSubSets(str, result, idx + 1);
      }
      public static void main(String args[]) {
        String str = "abc";
        findSubSets(str, "", 0);
      }
    }
 */

//================================================================================================
public class SubSets {
    public static void findSubSets(String str, StringBuilder sb, int idx) {
        if (str.length() == idx) {
            if (sb.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(sb);
            }
            return;
        }
        sb.append(str.charAt(idx));
        findSubSets(str, sb, idx + 1);

        sb.deleteCharAt(sb.length() - 1);
        findSubSets(str, sb, idx + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();
        findSubSets(str, sb, 0);
    }
}
