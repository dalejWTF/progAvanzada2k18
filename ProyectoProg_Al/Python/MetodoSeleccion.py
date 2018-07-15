def selectionsort(lista):
    for i in range(0,len(lista)-1):
        min=i
        for j in range(i+1,len(lista)):
            if lista[min] > lista[j]:
                min=j
        aux=lista[min]
        lista[min]=lista[i]
        lista[i]=aux

def imprimeLista(lista,tam):
    for i in range(0,tam):
        print (lista[i], end= " ")
    print()
    
def leeLista():
    lista=[]
    cn=int(input("Cantidad de numeros a ingresar: "))

    for i in range(0,cn):
        lista.append(int(input("Ingrese numero %d: " %(i+1) )))
    return lista

A=leeLista()
selectionsort(A)
imprimeLista(A,len(A))
