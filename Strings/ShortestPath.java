import java.util.Scanner;

public class ShortestPath {

    public static float  Path(String Destination){

        int x = 0, y = 0; 
        int len = Destination.length();

        for(int i = 0; i < len; i++){
            char ch = Destination.charAt(i);

            // if(ch == 'N'){ y++; }
            // else if(ch == 'S'){ y--; }
            // else if(ch == 'W'){ x--; }
            // else{ x++; }

            switch(ch){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;            
            }

        }
        return (float)Math.sqrt((x*x) + (y*y));
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String Destination = sc.next();

        System.out.println(Path(Destination));
    }
}
