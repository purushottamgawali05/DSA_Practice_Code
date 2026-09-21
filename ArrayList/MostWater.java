package ArrayList;

import java.util.ArrayList;

//Brute-Force Approach
/*
public class MostWater {
  
public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        
        int len = list.size();
        int maxWater = 0, water = 0;
        
        for (int line1 = 0; line1 < len - 1; line1++) {
          for (int line2 = line1 + 1; line2 < len; line2++) {
            
                int minHeight = Math.min(list.get(line1), list.get(line2));
                
                int width = line2 - line1;
                
                water = minHeight * width;
              }
              
              if (water > maxWater) {
                maxWater = water;
              }
            }
            
            System.out.println(maxWater);
          }
        }
 */
public class MostWater {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int len = list.size();

        int maxWater = 0, currWater = 0;

        int left = 0, right = len - 1;

        while (left < right) {

            int minHeight = Math.min(list.get(left), list.get(right));

            int width = right - left;

            currWater = minHeight * width;

            maxWater = Math.max(maxWater, currWater);

            if (list.get(left) < list.get(right)) {
                left++;
            } else if (list.get(left) >= list.get(right)) {
                right--;
            }
        }

        System.out.println(maxWater);
    }
}
