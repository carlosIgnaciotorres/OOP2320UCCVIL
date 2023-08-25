package mamiferos;

public class Michines extends Gato{
    public String dueno;

    public Michines(String nombre, String color, String raza, int edad, float altura, String dueno) {
        super(nombre, color, raza, edad, altura);
        this.dueno = dueno;
    }

    
}
