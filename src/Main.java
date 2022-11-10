import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creamos un nuevo genero
        Genero genero = new Genero();
        genero.setNombre("Novela");
        genero.setDescripcion("Narración en prosa, generalmente extensa.");

        // Creamos un nuevo autor
        Autor autor = new Autor();
        autor.setNombre("Miguel");
        autor.setApellidos("De cervantes Saavedra");
        autor.setLocalidad("Madrid");
        autor.setFechanacimiento(new Date());

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
        System.out.println(prestamo.getFechaprestamo());

        System.out.println(prestamo.toString());

    }
}