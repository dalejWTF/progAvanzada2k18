from datetime import datetime
instanteInicial = datetime.now()
# al final de la partida

def insercionDirecta(lista):
    for i in range(1,len(lista)):
        v=lista[i]
        j=i-1
        while j >= 0 and lista[j] > v:
            lista[j+1] = lista[j]
            j=j-1
        lista[j+1]=v

lista=[]


archivo = open("1000000.txt","r")
		
for linea in archivo.readlines():
    b=linea
    lista.append(int(b))


archivo.close() 
insercionDirecta(lista)

instanteFinal = datetime.now()
tiempo = instanteFinal - instanteInicial # Devuelve un objeto timedelta

for x in range(len(lista)):
	print(lista[x], end=" ")
	pass

print("\n")
print("Tamaño del archivo: ",len(lista))
print("Tiempo de ejecución: ",tiempo,"seconds")
