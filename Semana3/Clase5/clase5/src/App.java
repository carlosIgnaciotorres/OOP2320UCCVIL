import mamiferos.Mascota;
import mamiferos.Michines;
import mamiferos.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal("Firulay","canino",4,0.8f);
        System.out.println(animal1.toString());
        
        animal1.cambiarEdad(5);
        System.out.println("La edad en meses es "+ animal1.obtenerEdad()*12);
        System.out.println(animal1.toString());

        Mascota lucas = new Mascota("Lucas", "Criollo", 6, 29.8f, "Juan Perez");
        System.out.println(lucas);

        lucas.cambiarEdad(3);
        System.out.println(lucas);

        Michines garfield = new Michines("Garfield", "Naranja", "Angora", 6, 28f, "Carlota");
        System.out.println(garfield);
        garfield.nombre="Felix";
    }
}
