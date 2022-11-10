import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
    Libro book = new Libro();

        // Creamos un nuevo libro
        Libro libro = new Libro();
        libro.setTitulo("El Quijote");
        libro.setIsbn(12345);
        libro.setAutor("Miguel de Cervantes");
        libro.setGenero("Novela");
        libro.setFechapublicacion(new Date());

        // Creamos un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellidos("Pérez");
        usuario.setDnis("12345678A");
        usuario.setTelefono(666555444);
        usuario.setDireccion("Calle Falsa 123");
        usuario.setPoblacion("Madrid");

        // Creamos un nuevo prestamo
        Prestamo prestamo = new Prestamo();
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);
        prestamo.setFechaprestamo(new Date(122, 10, 1));
        prestamo.setFechadevolucion(new Date(123, 0, 1));

        System.out.println(prestamo.toString());

    }
}