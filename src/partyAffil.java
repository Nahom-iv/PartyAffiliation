import java.util.Scanner;
public class partyAffil  {
    public static void main(String[] args)  {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter party affilation: Democrat, Republican, Independent");
        char party = myObj.nextLine().charAt(0);
        if (party == 'd' ) {
            System.out.println("You get an Democratic Donkey");
        }
       else if (party == 'r' ) {
            System.out.println("You get an republican Elephant");
        }
       else if (party == 'i' ) {
            System.out.println("You get an Independent Person");
        }
         else {
                System.out.println("You get an other person");
            }
    }
}