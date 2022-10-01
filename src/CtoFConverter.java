import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        String trash;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        if(in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();
            fahrenheit = (celsius*1.8) + 32;
            System.out.printf("The temperature in fahrenheit is %.2f%n", fahrenheit);

        }else{
            trash = in.nextLine();
            System.out.println("Invalid temperature entered: "+trash);
        }


    }
}