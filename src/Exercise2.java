public class Exercise2 {
    public static void main(String[] args) {
        try{
            Exercise1.main(args);
        }
        catch(ArithmeticException e) {
            String message = e.getMessage();
            System.out.println("Se ha generado una excepcion de tipo ArithmeticException a causa de: "+ message);
        }

    }
}
