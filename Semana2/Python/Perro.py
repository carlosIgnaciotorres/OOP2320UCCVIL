class Perro:
    nombre = ""
    raza = ""
    edad = 0
    altura = 0.0
    sexo = ''
    dormir = False
    
    def __init__(self, nombre, raza, edad, altura, sexo):
        self.nombre = nombre
        self.raza = raza
        self.edad = edad
        self.altura =  altura
        self.sexo = sexo
        
    def __str__(self) -> str:
        return f"Perro [nombre=,{self.nombre} raza={self.raza} , edad={self.edad} , altura={self.altura}, sexo={self.sexo} , dormir={self.dormir} ]"
    
Firulay = Perro("Firulay",'Pastor Callejero', 4, 0.85,'M')
Firulay.edad = "Cinco"
print(Firulay)