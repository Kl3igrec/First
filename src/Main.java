import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your numbers: \n");
        // nextInt() reads the next integer from the keyboard
        int sum=0;
        int counter=0;
        int number = reader.nextInt();
        //Enter -1 to stop
        while(number!=-1){
            sum+=number;
            counter++;
            number=reader.nextInt();
        }
        System.out.println(sum/counter);


        // println() prints the following line to the output screen
        //System.out.println("You entered: " + number);
    }
}