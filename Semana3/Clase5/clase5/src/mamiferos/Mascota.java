package mamiferos;

public class Mascota extends Perro {
    public String dueno;

    public Mascota(String nombre, String raza, int edad, float altura, String dueno) {
        super(nombre, raza, edad, altura);
        this.dueno = dueno;
    }
    
    public void cambiarEdad(int edad){
        this.edad= edad;
    }
}
