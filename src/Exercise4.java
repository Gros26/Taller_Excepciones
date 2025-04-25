import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        try {
            System.out.print("Ingresa un numero: ");
            number1 = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingresa otro numero: ");
            number2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Resultado: " + (number1/number2));
        }
        catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println("Se ha generado una excepcion de tipo ArithmeticException a causa de: "+ message);
        }
        catch (InputMismatchException e) {
            String message = e.getMessage();
            System.out.println("Se ha generado una excepcion de tipo InputMismatchException a causa de: "+ message);
        }
        finally {
            System.out.println("Operacion finalizada");
        }
    }
}
