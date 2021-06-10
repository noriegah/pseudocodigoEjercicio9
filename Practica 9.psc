Algoritmo t1_t2
	sumat1=0
	contadort1=0
	sumat2=0
	contadort2=0
	t1=1
	Mientras t1<>0 Hacer
		Escribir "Ingrese T1"
		Leer t1
		Escribir "Ingrese T2"
		Leer t2
		Si t1>=5 y t1<=15 Entonces
			sumat1=sumat1+t1
			contadort1=contadort1+1
		FinSi
		Si t2>=5 y t2<=15 Entonces
			sumat2=sumat2+t2
			contadort2=contadort2+1
		FinSi
	FinMientras
	promt1=sumat1/contadort1
	promt2=sumat2/contadort2
	Escribir "El promedio de T1 comprendido entre 5 y 15 grados es de: " promt1
	Escribir "El promedio de T2 comprendido entre 5 y 15 grados es de: " promt2
	
FinAlgoritmo
