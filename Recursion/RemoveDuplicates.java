
// public class RemoveDuplicates {
//     public static void RemDupfunc(String str, int idx, StringBuilder NewStr, boolean map[]) {
//         //base case
//         if (idx == str.length()) {
//             System.out.println(NewStr);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if (map[currchar - 'a'] == true) {
//             //duplicate
//             RemDupfunc(str, idx + 1, NewStr, map);
//         } else {
//             //unique
//             map[currchar - 'a'] = true;
//             RemDupfunc(str, idx + 1, NewStr.append(currchar), map);
//         }
//     }
//     public static void main(String Remove[]) {
//         String str = "appnnacollege";
//         boolean map[] = new boolean[26];
//         RemDupfunc(str, 0, new StringBuilder(""), map);
//     }
// }
public class RemoveDuplicates {

    public static void Duplicates(String str, StringBuilder Newstr, boolean track[], int idx) {
        
        str = str.toLowerCase();
        
        //base case
        if (idx == str.length()) {
            System.out.println(Newstr);
            return;
        }

        char currchar = str.charAt(idx);

        //task == kaAm
        if (track[currchar - 'a'] == true) {    
            //if present
            Duplicates(str, Newstr, track, idx + 1);
        }else{
            //make the idx value as true
            track[currchar - 'a'] = true;
            Duplicates(str, Newstr.append(currchar), track, idx + 1);
        }
    }

    public static void main(String[] Duplicate) {

        String str = "Puurushhuootttamm";
        StringBuilder Newstr = new StringBuilder("");
        boolean track[] = new boolean[26];
        int idx = 0;

        Duplicates(str, Newstr, track, idx);
    }
}
