package Guesser;
import java.util.*;

class Guesser{
    int guessNum;

    int GuessingNum(){
        System.out.println("guesser ! kindly guess the Number");
        Scanner sc=new Scanner(System.in);
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Player{
    int guessNum;

    int GuessingNum()//method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player, Kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class umpire{
    int numberfromGuesser;
    int numberfromPlayer1;
    int numberfromPlayer2;
    int numberfromPlayer3;

    void collectnumfromGuesser(){
        Guesser g=new Guesser();
        numberfromGuesser=g.GuessingNum();
    }

    void collectNumfromPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numberfromPlayer1=p1.GuessingNum();
        numberfromPlayer2=p2.GuessingNum();
        numberfromPlayer3=p3.GuessingNum();
    }

    void compare()
    {
        if(numberfromGuesser == numberfromPlayer1)
        {
            if(numberfromGuesser==numberfromPlayer2 && numberfromGuesser==numberfromPlayer3){
                System.out.println("All HAVE WON THE MATCH");
            }
            else if(numberfromGuesser==numberfromPlayer2){
                System.out.println("Player 1 & Player 2 has won the match");
            }
            else if(numberfromGuesser==numberfromPlayer3){
                System.out.println("Player 1 & Player 3 has won the match");
            }
            else{
            System.out.println("Player 1 won the match");
            }
        }
        else if(numberfromGuesser == numberfromPlayer2)
        {
            if(numberfromGuesser==numberfromPlayer3)
            {
            System.out.println("Player 2 & 3 has won the match");
            }
            else{
                System.out.println("Player 2 has won the match");
            }
        }
        else if(numberfromGuesser==numberfromPlayer3)
        {
            System.out.println("Player 3 Won the match");
        }
        else
        {
            System.out.println("You lost the game");
        }
    }

}

public class Launch1 {
    public static void main(String[] args) {
        System.out.println("Game Started");

        umpire u=new umpire();
        u.collectnumfromGuesser();
        u.collectNumfromPlayers();
        u.compare();
    }
}
