import random
lista=[]
c=0
archivo= open("numerosRandom.txt","r+")
for x in range(0,25):
	a= random.randint(1,101)
	archivo.write(str(a)+"\n")
	pass

for linea in archivo.readlines():
	x= linea
	lista.append(int(x))
	print(lista[c],end=" ")
	c=c+1
	pass
archivo.close()
print()