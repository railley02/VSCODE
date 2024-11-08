
import java.util.Scanner;

public class Relational{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("ARE YOU READY TO PARTAKE IN AN ADVENTURE?");
        int choice;
        int choice1;
        
        System.out.println("Press  1 to start the adventure");
        System.out.println("Press  2 if you're not yet ready");
        System.out.print("ENTER YOUR CHOICE: ");
        choice = s.nextInt();

        if(choice == 1){
            System.out.println("You're walking towards the  forest, the trees are tall and the path is narrow");
            System.out.println("while you're taking a break, a bunch of bandits came into your way-");
            System.out.println("asking you 'to give your equipments and money");
           }else System.out.println("COME BACK WHEN YOU'RE READY");

           Scanner s2 = new Scanner(System.in);

           System.out.println("WHAT DO YOU DO?");
           System.out.println("1-FIGHT IT");
           System.out.println("2-GIVE IT");
           System.out.println("3-RUN!");
           System.out.print("ENTER YOUR CHOICE: ");

           choice1 = s2.nextInt();

           if(choice1>1){
            System.out.println("GAME OVER! YOU LOST ALL OF YOUR  EQUIPMENTS AND MONEY.");
            }else if(choice1==1){
                System.out.println("INITIATE ATTACK");
                System.out.print("choose from 1-10 on how  many times you want to attack: ");
                int attack = s2.nextInt();

                if(attack>0 && attack <=5){
                    System.out.println("OH NO!The damage is not enough. The bandits retaliated and you died. GAME OVER!");
                }else if(attack>5 && attack<=10){
                        System.out.println("YOU WON! YOU KILLED THE BANDITS.");
                    }
                    else System.out.println("INVALID INPUT.");

           }
        
    }
}

