
package javaapplication17;


public class JavaApplication17 {

    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int f=0,c=0;    
        System.out.println("Imprimir un cuadrado con ciclo while");
        while(f < filas){
            c=0;
            while(c < columnas){
                System.out.print("* ");
                c++; 
            }
            f++;
            System.out.println("");
        }
    
        f = 0;
        c = 0;
        
        System.out.println("=======================");
        System.out.println("Imprimir ciclo con Do - While");
        do{
            c = 0;
            do{
                System.out.print("* ");
                c++;
            }while( c < columnas );
            f++;
            System.out.println("");
        }while( f < filas );
    } // Fin del main    
 } // Fin de la clase
 


