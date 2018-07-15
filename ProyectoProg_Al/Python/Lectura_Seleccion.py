from datetime import datetime
instanteInicial = datetime.now()
# al final de la partida


def selectionsort(lista):
    for i in range(0,len(lista)-1):
        min=i
        for j in range(i+1,len(lista)):
            if lista[min] > lista[j]:
                min=j
        aux=lista[min]
        lista[min]=lista[i]
        lista[i]=aux

lista=[]


archivo = open("1000000.txt","r")
		
for linea in archivo.readlines():
    b=linea
    lista.append(int(b))


archivo.close() 
selectionsort(lista)

instanteFinal = datetime.now()
tiempo = instanteFinal - instanteInicial # Devuelve un objeto timedelta

for x in range(len(lista)):
	print(lista[x], end=" ")
	pass

print("\n")
print("Tamaño del archivo: ",len(lista))
print("Tiempo de ejecución: ",tiempo,"seconds")
