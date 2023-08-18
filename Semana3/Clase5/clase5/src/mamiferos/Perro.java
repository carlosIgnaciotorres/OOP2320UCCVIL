package mamiferos;

public class Perro {
    public String nombre;
    public String raza;
    int edad;
    public float altura;

    /**
     * constructor de perro
     * @param nombre ---> String
     * @param raza   ---> String
     * @param edad   ---> int en años
     * @param altura ---> float en centimetros
     */
    public Perro(String nombre, String raza, int edad, float altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
    }

    
    /**
     * Constructor vacio de perro
     */
    public Perro() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.altura = 0;
    }


    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + "]";
    }



    

    
}
