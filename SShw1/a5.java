import java.util.Scanner;

public class a5 {

    public a5(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Guess a number between 1 and 100");
        int guess=5;
        int rand = (int) Math.floor(Math.random()*(100-2)+1);
        while(guess>0){
            int input = sc.nextInt();  // Read user input
            System.out.println("You guessed the number: " + input);  // Confirm user input
            if(input>100||input<1){
                System.out.println("Not within range, try again.");
                System.out.println("Number of guesses remaining: " + guess);
            }
            else if(input <= rand+10 && input >= rand-10){
                System.out.println("Correct!");
                guess=0;
                break;
            }
            else{
                System.out.println("Incorrect.");
                guess--;
                if(guess<=0){
                    System.out.println("Sorry, no more guesses remaining.");
                }
                else{
                    System.out.println("Number of guesses remaining: " + guess);
                }
            }
        }
        System.out.println("The number: " + rand);
        sc.close();
    }
}
