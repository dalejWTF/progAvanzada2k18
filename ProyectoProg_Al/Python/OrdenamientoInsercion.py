def insercionDirecta(lista):
    for i in range(1,len(lista)):
        v=lista[i]
        j=i-1
        while j >= 0 and lista[j] > v:
            lista[j+1] = lista[j]
            j=j-1
        lista[j+1]=v

def imprimeLista(lista):
    for i in range(0,len(lista)):
        print (lista[i], end=" ")
    print()

def leeLista():
    lista=[]
    cn=int(input("Cantidad de numeros a ingresar: "))

    for i in range(0,cn):
        lista.append(int(input("Ingrese numero %d : " % (i+1))))
    return lista

A=leeLista()
insercionDirecta(A)
imprimeLista(A)
