import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of water avaible (ml) : ");
        int water = sc.nextInt();
        System.out.println("Enter amount of milk avaible (ml) : ");
        int milk = sc.nextInt();
        System.out.println("Enter amount of coffee beans avaible (g) : ");
        int cbeans = sc.nextInt();
        System.out.println("How many cup do you want? (cup) : ");
        int user = sc.nextInt();
        int W = (water/200);
        int M = (milk/50);
        int CB = (cbeans/15);
        int canmake=0;
        while(W>0 && M>0 && CB>0){
            W -=1;
            M -=1;
            CB-=1;
            canmake+=1;
        }
        if(canmake-user==0 ){
            System.out.println("Yes, I can make that amount of coffee");
        }   
        else if(canmake-user>0){
            System.out.println("Yes, I can make that amount of coffee (and even " +(canmake-user)+ " more than that)");
        }   
        else if(canmake-user<0){
            System.out.println("No, I can make only " +(canmake)+ " cups of coffee");
        }
    }
}