import Biblioteca.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;

public class ClienteBiblioteca {
    public static void main(String args[]) {
        try {
            // Inicializar el ORB (Object Request Broker)
            ORB orb = ORB.init(args, null);

            // Obtener referencia al servicio de nombres
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Buscar la referencia del objeto (servidor) en el servicio de nombres
            String name = "GestionBiblioteca";
            GestionBiblioteca gestionBiblioteca = GestionBibliotecaHelper.narrow(ncRef.resolve_str(name));

            // Usar la interfaz para llamar a las operaciones del servidor
            // Ejemplo: Buscar un libro
            String tituloLibro = "El principito";
            String tituloLibro2 = "Cien años de soledad";
            String tituloLibro3 = "El amor en los tiempos del cólera";
            String tituloLibro4 = "Don Quijote de la Mancha";
            String tituloLibro5 = "El amor en los tiempos del cólera";
            String tituloLibro6 = "Rinconete y Cortadillo";
            String tituloLibro7 = "La Galatea";



            Libro libro = gestionBiblioteca.buscarLibro(tituloLibro);
            Libro libro2 = gestionBiblioteca.buscarLibro(tituloLibro2);
            Libro libro3 = gestionBiblioteca.buscarLibro(tituloLibro3);
            Libro libro4 = gestionBiblioteca.buscarLibro(tituloLibro4);
            Libro libro5 = gestionBiblioteca.buscarLibro(tituloLibro5);
            Libro libro6 = gestionBiblioteca.buscarLibro(tituloLibro6);
            Libro libro7 = gestionBiblioteca.buscarLibro(tituloLibro7);
            System.out.println("Libro encontrado: " + libro.titulo + ", " + libro.autor + ", ISBN: " + libro.ISBN + ", disponible: " + libro.estaDisponible+"editado por: "+libro.editorial+" año: "+libro.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro2.titulo + ", " + libro2.autor + ", ISBN: " + libro2.ISBN + ", disponible: " + libro2.estaDisponible+"editado por: "+libro2.editorial+" año: "+libro2.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro3.titulo + ", " + libro3.autor + ", ISBN: " + libro3.ISBN + ", disponible: " + libro3.estaDisponible+"editado por: "+libro3.editorial+" año: "+libro3.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro4.titulo + ", " + libro4.autor + ", ISBN: " + libro4.ISBN + ", disponible: " + libro4.estaDisponible+"editado por: "+libro4.editorial+" año: "+libro4.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro5.titulo + ", " + libro5.autor + ", ISBN: " + libro5.ISBN + ", disponible: " + libro5.estaDisponible+"editado por: "+libro5.editorial+" año: "+libro5.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro6.titulo + ", " + libro6.autor + ", ISBN: " + libro6.ISBN + ", disponible: " + libro6.estaDisponible+"editado por: "+libro6.editorial+" año: "+libro6.fechaPublicacion);
            System.out.println("Libro encontrado: " + libro7.titulo + ", " + libro7.autor + ", ISBN: " + libro7.ISBN + ", disponible: " + libro7.estaDisponible+"editado por: "+libro7.editorial+" año: "+libro7.fechaPublicacion);

            // Ejemplo: Prestar un libro
            boolean resultadoPrestamo = gestionBiblioteca.prestarLibro(libro.ISBN);
            if (resultadoPrestamo) {
                System.out.println("Libro prestado con éxito.");
            } else {
                System.out.println("El libro no está disponible para préstamo.");
            }
            boolean resultadoPrestamo2 = gestionBiblioteca.prestarLibro(libro2.ISBN);
            if (resultadoPrestamo2) {
                System.out.println("Libro prestado con éxito.");
            } else {
                System.out.println("El libro no está disponible para préstamo.");
            }

            //contar libros por autor
            String autor = "Miguel de Cervantes";

            int contador = gestionBiblioteca.contarLibrosPorAutor(autor);
            System.out.println("El autor "+autor+" tiene "+contador+" libros en la biblioteca");

            //contar libros por editorial
            String editorial = "Planeta";
            int contadorEditorial = gestionBiblioteca.contarLibrosPorEditorial(editorial);
            System.out.println("La editorial "+editorial+" tiene "+contadorEditorial+" libros en la biblioteca");

            //listar los libros disponibles
            gestionBiblioteca.listarLibrosDisponibles();

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}

