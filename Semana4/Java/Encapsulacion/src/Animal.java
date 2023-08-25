public class Animal {
    private String nombre;
    private String raza;
    private int edad;
    private float altura;

    /**
     * Metodo constructor
     * @param nombre de tipo string
     * @param raza de tipo string
     * @param edad de tipo int en meses
     * @param altura de tipo float en metros
     */
    public Animal(String nombre, String raza, int edad, float altura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
    }

    /**
     * Constructor vacio
     * formatea los atributos String a """" y numericos a 0
     */
    public Animal(){
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.altura = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public  String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza ){
        this.raza = raza;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + "]";
    }
}
