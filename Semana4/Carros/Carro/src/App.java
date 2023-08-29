public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola!!!");
        Carro cadilac = new Carro("Hyundai","#ffffff" , 120, 80, 500, 100, false, 50);
        cadilac.mostrarInformacion();
        cadilac.arrancar();
        cadilac.mostrarInformacion();
        cadilac.arrancar();
        cadilac.acelerar(100);
        cadilac.parar();
        cadilac.repostar(250);
        cadilac.arrancar();
        cadilac.viaje(1, 2);
        cadilac.mostrarInformacion();

    }
}
