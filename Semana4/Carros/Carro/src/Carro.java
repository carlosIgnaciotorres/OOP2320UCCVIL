public class Carro{
    private String modelo;
    private String color;
    private float velocidadMaxima;
    private float velocidad;
    private float combustibleMaximo;
    private float combustible;
    private boolean estado = false;
    private float consumo;

    /**
     * Constructor de un nuevo carro
     * @param modelo cadena de carcteres
     * @param color el color debe ser dado en codigo RGB #XXXXXX
     * @param velocidadMaxima la velocidad debe ser mayor que 0 esta dada en km/h
     * @param velocidad es la velocidad al momento de crear el carro deberia ser 0 
     * @param combustibleMaximo es la capacidad del anque del carro en litros debe ser mayor 0
     * @param combustible es la cantidad actual de combustible en el carro deberia ser 0 
     * @param estado es true si el caro esta encendido y false si esta apagado
     * @param consumo es la relacion de km por litros que tiene el carro
     */
    public Carro(String modelo, String color, float velocidadMaxima, float velocidad, float combustibleMaximo, float combustible, boolean estado, float consumo){
        this.modelo =  modelo;
        this.color =  color;
        this.combustibleMaximo = combustibleMaximo;
        this.combustible =  combustible;
        this.velocidadMaxima =  velocidadMaxima;
        this.velocidad =  velocidad;
        this.estado = estado;
        this.consumo = consumo;
    }

    /**
     * Constructor de un nuevo carro
     * los valores se inicializan:
     *      Las cadenas     ""
     *      Los numeros     0
     *      los booleanos   false 
     */
    public Carro(){
        this.modelo =  "";
        this.color =  "";
        this.combustibleMaximo = 0;
        this.combustible =  0;
        this.velocidadMaxima =  0;
        this.velocidad =  0;
        this.estado = false;
        this.consumo = 0;
    }

    /**
     * arrancar no activa el carro si esta pagado
     * @return verdadero si el carro se encendio, falso en caso contrario
     */
    public boolean arrancar(){
        boolean resultado = true;
        if (isEstado()){
            resultado =  false;
            System.out.println("El carro ya esta encendido, no se puede volver a encender");
        }else{
            if (getVelocidad()>0){
                resultado =  false;
                setVelocidad(0);
                System.out.println("La velocidad del carro no era 0 se ha puesto a 0 vuelva a intentar arrancarlo");
            }else{
                setEstado(resultado);
                System.out.println("Carro encendido");
            }
            
        }
        return resultado;
    }

    /**
     * parar: pasa el estado del carro a apagado y velocidad a cero
     * @return erdadero si el carro se apago, falso en caso contrario
     */
    public boolean parar(){
        boolean resultado = false;
        if (isEstado()){
            setEstado(false);
            setVelocidad(0);
            System.out.println("Carro apagado");
            resultado = true;
        }else{
            System.out.println("El carro ya esta apagado, no se puede volver a apagar");
            resultado = false;
        }
        return resultado;
    }


    /**
     * acelerar --> Cambia la velocidad
     * @param velocidad numero de tipo flotante
     * @return  true si la velocidad es mayor igual que cero y menor o igual a la máxima
     *          false en caso contrario 
     */
    public boolean acelerar(float velocidad) {
        boolean resultado = true;
        if (velocidad<=velocidadMaxima && velocidad>=0 ){
            this.velocidad = velocidad;
        }else{
            System.out.println("Se supera la velocidad máxima "+ velocidadMaxima +" o es negativa");
            //this.velocidad = velocidadMaxima;
            resultado = false;
        }
        return resultado;
    }

    /**
     * desacelerar ---> Cambia la velocidad
     * @param velocidad numero de tipo flotante
     * @return  true si la velocidad es mayor igual que cero y menor o igual a la máxima
     *          false en caso contrario 
     */
    public boolean desacelerar(float velocidad) {
        boolean resultado = true;
        if (velocidad<=velocidadMaxima && velocidad>=0 ){
            this.velocidad = velocidad;
        }else{
            System.out.println("Se supera la velocidad máxima "+ velocidadMaxima +" o es negativa");
            //this.velocidad = velocidadMaxima;
            resultado = false;
        }
        return resultado;
    }

    public boolean repostar(float combustible){
        boolean resultado = false;
        if (isEstado()== false){
            if (combustible <= (getCombustibleMaximo()-getCombustible())){
                setCombustible(combustible+getCombustible());
                System.out.println("Repostaje exitoso");
                resultado =  true;
            } else{
                System.out.println("Cantidad de combustible es superior a la permitida ");
            }
        } else{
            System.out.println("El carro debe esta apagado para repostar");
        }
        return resultado;
    }
    
    /**
     * 
     * @param tiempo
     * @param velocidad
     * @return
     */
    public boolean viaje(float tiempo, float velocidad){
        boolean resultado = false;
        float consumoViaje, distancia;
        if (isEstado()){
            distancia = tiempo * velocidad;
            consumoViaje = getConsumo()*distancia;
            if (consumoViaje<=getCombustible()){
                setVelocidad(velocidad);
                setCombustible(getCombustible()-consumoViaje);
                System.out.println("Vije realizado con exito");
                resultado = true;
            } else {
                System.out.println("el combustible actual no permite realizar el viaje");
            } 
        }else{
            System.out.println("El carro debe estar encendido");
        }
        return resultado;
    }

    /**
     * mostrarInformacion hace una impresion por pantalla de los datos del Carro
     * @return verdadero si imprime
     */
    public boolean mostrarInformacion(){
        boolean resultado = true;
        System.out.println(toString());
        return resultado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public float getVelocidad() {
        return velocidad;
    }
 
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    public float getCombustibleMaximo() {
        return combustibleMaximo;
    }

  
    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", color=" + color + ", velocidadMaxima=" + velocidadMaxima + ", velocidad="
                + velocidad + ", combustibleMaximo=" + combustibleMaximo + ", combustible=" + combustible + ", estado="
                + estado + ", consumo=" + consumo + "]";
    }

   

   


    
}