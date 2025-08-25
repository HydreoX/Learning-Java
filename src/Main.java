import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynumber = (int) (Math.random()*100);
        int number = 0;
        do {
            System.out.println("Guess the number");
            number = sc.nextInt();
            if (number == mynumber) {
                System.out.println("WOOOOHOOOOO...........Correct Number");
                break;
            }
            else if (number > mynumber) {
                System.out.println("Crapp.......Incorrect Number");

            }

            else{
                System.out.println("Your number is too small");

                }

        }while(number>=0);
            System.out.println("The correct NUMBER was");
            System.out.println(mynumber);


    }
}