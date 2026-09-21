
public class Tiling {

    public static int TileProb(int n) {

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        //vertical ways
        int vertical = TileProb(n-1);

        //horizontal
        int horizontal = TileProb(n-2);

        //totalWays
        int totalWays = vertical + horizontal;

        return totalWays;
    }

    public static void main(String Tile[]) {
        // int n = 5;
        // System.out.println(TileProb(n));
    
}
    }

