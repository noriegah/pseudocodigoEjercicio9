import java.util.*;

public class Practica9 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    double sumat1=0;
    double sumat2=0;
    int contadort1=0;
    int contadort2=0;
    double t1=1,t2;
    while(t1!=0){
        System.out.println("Ingrese T1");
        t1=scanner.nextDouble();
        System.out.println("Ingrese T2");
        t2=scanner.nextDouble();
        if (t1>=5 & t1<=15){
            sumat1+=t1;
            contadort1+=1;
        }
        if (t2>=5 & t2<=15){
            sumat2+=t2;
            contadort2+=1;
        }
    }
    double promt1=sumat1/contadort1;
    double promt2=sumat2/contadort2;
    System.out.println("El promedio de T1 comprendido entre 5 y 15 grados es de "+promt1);
    System.out.println("El promedio de T2 comprendido entre 5 y 15 grados es de "+promt2);
}
}