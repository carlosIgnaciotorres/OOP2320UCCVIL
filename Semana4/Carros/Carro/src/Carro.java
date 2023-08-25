public class Carro{
    private String modelo;
    private String color;
    private float velocidadMaxima;
    private float velocidad;
    private float combustibleMaximo;
    private float combstible;
    private boolean estado = false;
    private float consumo;

    /**
     * Constructor de un nuevo carro
     * @param modelo cadena de carcteres
     * @param color el color debe ser dado en codigo RGB #XXXXXX
     * @param velocidadMaxima la velocidad debe ser mayor que 0 esta dada en km/h
     * @param velocidad es la velocidad al momento de crear el carro deberia ser 0 
     * @param combustibleMaximo es la capacidad del anque del carro en litros debe ser mayor 0
     * @param combstible es la cantidad actual de combustible en el carro deberia ser 0 
     * @param estado es true si el caro esta encendido y false si esta apagado
     * @param consumo es la relacion de km por litros que tiene el carro
     */
    public Carro(String modelo, String color, float velocidadMaxima, float velocidad, float combustibleMaximo, float combstible, boolean estado, float consumo){
        this.modelo =  modelo;
        this.color =  color;
        this.combustibleMaximo = combustibleMaximo;
        this.combstible =  combstible;
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
        this.combstible =  0;
        this.velocidadMaxima =  0;
        this.velocidad =  0;
        this.estado = false;
        this.consumo = 0;
    }



    
    /**
     * 
     * @param tiempo
     * @param velocidad
     * @return
     */
    public boolean viaje(float tiempo, float velocidad){

        return true;
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

    public float getCombustibleMaximo() {
        return combustibleMaximo;
    }

  
    public float getCombstible() {
        return combstible;
    }

    public void setCombstible(float combstible) {
        this.combstible = combstible;
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

    
}