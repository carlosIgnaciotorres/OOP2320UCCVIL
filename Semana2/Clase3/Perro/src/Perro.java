class Perro {
    public String nombre;
    public String raza;
    public int edad;
    public float altura;
    public char sexo;// 'M'->Macho, 'H'->Hembra, 'I'->Indeterminado
    public boolean dormir = false;

    // constructor//
    public Perro(String nombre, String raza, int edad, float altura, char sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Perro(String nombre, int edad, float altura, char sexo) {
        this.nombre = nombre;
        this.raza = "Criollo";
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Perro() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.sexo = 'I';
        this.altura = 0;
    }

    public void ladrar() {
        System.out.println("Guauuu Guauu");
    }

    public boolean estadoPerro() {
        return this.dormir;
    }

    public void cambiarEstado() {
        if (this.dormir) {
            this.dormir = false;
        } else {
            this.dormir = true;
        }
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", altura=" + altura + ", sexo=" + sexo
                + ", dormir=" + dormir + "]";
    }

}