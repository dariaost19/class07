package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner scan =new Scanner(System.in);

        int number=15; // could be any number , in this case it s a winning number.
        while (condition){
            System.out.println("Please enter a Number between 10 to 20");
            int  userInput=scan.nextInt();
            if(userInput>number){
                System.out.println("You entered number is greater");
            }else if(userInput<number){
                System.out.println("You  entered a smaller number");

            }else {
                System.out.println("You won !!");
                condition=false;
            }
        }
    }
}
