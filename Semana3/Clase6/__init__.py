from Animal import Animal
from Perro import Perro

lucas= Animal("Lucas", "Perro",7,0.9)
print(lucas)


firulay =  Perro("Firulay", "Criiollo", 4, 0.76)
print(firulay)
firulay.__edad__= 7
print(firulay.__edad__)