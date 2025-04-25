import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        try {
            System.out.println("Intentando cargar el archivo FXML...");
            trying();
            System.out.println("Archivo cargado con éxito");
        } catch (FXMLNotFoundException e) {
            System.out.println("¡Error capturado correctamente!: " + e.getMessage());
            System.out.println("Causa original: " + e.getCause().getMessage());

        }

    }

    public static void trying() throws FXMLNotFoundException {
        throw new FXMLNotFoundException("No se pudo encontrar o cargar el archivo FXML",
                new IOException("Simulación de error de archivo no encontrado"));
    }

}
