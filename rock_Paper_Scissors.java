
package com.company;
import java.util.Scanner;
public class rock_Paper_Scissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock , paper , scissor !");
        while (true) {
            System.out.println("Your move ");
            final String myMove = sc.nextLine();
            if (myMove.equals("quit")) {
                System.out.println("Do you really wants to quit the game ?");
                break;
            }
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors"))
                System.out.println("Inavalid choice ");
            else {
                int rand = (int) (Math.random() * 3);
                String opponentsMove = "";
                if (rand == 0){
                    opponentsMove = "rock";}
                else if (rand == 1) {
                    opponentsMove = "scissors";
                } else {
                    opponentsMove = "paper";

                }
                System.out.println("opponent move = " + opponentsMove);
                if (myMove.equals(opponentsMove)){
                    System.out.println("It is a tie !!");}
                else if (myMove.equals("rock") &&(opponentsMove.equals("scissors")) || myMove.equals("paper")
                        &&(opponentsMove.equals("rock"))||myMove.equals("scissors") &&(opponentsMove.equals("paper")))
                {System.out.println("congrats !! You won !! ");}
                else {
                    System.out.println( "You lost !! ");
                }





            }

        }


    }
}