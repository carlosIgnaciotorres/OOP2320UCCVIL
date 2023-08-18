public class App {
    public static void main(String[] args) throws Exception {
        Perro Firulays = new Perro();
        Perro lucas = new Perro("Lucas","Doberman",6, 0.8F,'M');
        Perro laika =  new Perro("Laika",2,0.24F,'H');
        laika.ladrar();
        laika.cambiarEstado();
        lucas.cambiarEstado();
        System.out.println(Firulays.toString());
        System.out.println(lucas.toString());
        System.out.println(laika.toString());
        Firulays.nombre = "Firulay";
        System.out.println(Firulays.estadoPerro());
        Firulays.cambiarEstado();
        System.out.println(Firulays.toString());
    }
}
