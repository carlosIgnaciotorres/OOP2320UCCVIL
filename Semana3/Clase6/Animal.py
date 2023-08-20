class Animal:
    nombre = ""
    raza = ""
    edad =  0
    altura = 0.0
    
    def __init__(self, nombre, raza, edad, altura):
        """Constructor de Animal

        Args:
            nombre (str): Nombre del animal
            raza (str): raza del animal
            edad (int): Edad del animal en meses
            altura (float): altura del animal en metros
        """
        self.nombre = nombre
        self.raza =  raza
        self.edad = edad
        self.altura = altura
        
        
    def  comer()->bool:
        return True;    
        
    def __str__(self) -> str:
        return f"Animal [nombre={self.nombre}, raza={self.raza}, edad={self.edad}, altura={self.altura}]"
    