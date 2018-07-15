from datetime import datetime
instanteInicial = datetime.now()
# al final de la partida

def ordenamientoPorAgrupacion(unaLista):
    if len(unaLista)>1:
        mitad = len(unaLista)//2
        mitadIzquierda = unaLista[:mitad]
        mitadDerecha = unaLista[mitad:]

        ordenamientoPorAgrupacion(mitadIzquierda)
        ordenamientoPorAgrupacion(mitadDerecha)

        i=0
        j=0
        k=0
        while i < len(mitadIzquierda) and j < len(mitadDerecha):
            if mitadIzquierda[i] < mitadDerecha[j]:
                unaLista[k]=mitadIzquierda[i]
                i=i+1
            else:
                unaLista[k]=mitadDerecha[j]
                j=j+1
            k=k+1

        while i < len(mitadIzquierda):
            unaLista[k]=mitadIzquierda[i]
            i=i+1
            k=k+1

        while j < len(mitadDerecha):
            unaLista[k]=mitadDerecha[j]
            j=j+1
            k=k+1  

lista=[]


archivo = open("2000000.txt","r")
		
for linea in archivo.readlines():
    b=linea
    lista.append(int(b))


archivo.close() 
ordenamientoPorAgrupacion(lista)

instanteFinal = datetime.now()
tiempo = instanteFinal - instanteInicial # Devuelve un objeto timedelta

for x in range(len(lista)):
	print(lista[x], end=" ")
	pass

print("\n")
print("Tamaño del archivo: ",len(lista))
print("Tiempo de ejecución: ",tiempo,"seconds")
