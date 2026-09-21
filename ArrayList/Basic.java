package ArrayList;

import java.util.ArrayList;

public class Basic {

    public static void main(String basic[]) {

        //ArrayList Single
        ArrayList<Integer> list = new ArrayList<>();

        //Multi-ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        System.out.println(list);
        System.out.println(mainList);
        //methods
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); //1 2 3 4 5 
        System.out.println(list.get(3)); //4
        list.remove(4);
        System.out.println(list); //1 2 3 4
        list.add(0, 10);
        System.out.println(list); //10 1 2 3 4
        list.set(2, 12);
        System.out.println(list); //10 1 12 3 4
        System.out.println(list.contains(4)); //true

        for (int idx = 0; idx <= 5; idx++) {
            ArrayList<Integer> currList = new ArrayList<>();
            for (int num = 0; num <= 5; num++) {
                currList.add(num);
            }
            mainList.add(currList);
        }

        System.out.println(mainList);
        System.out.println(mainList.get(1));

        //size of ArrayList
        System.out.println(mainList.size()); //6

    }
}
