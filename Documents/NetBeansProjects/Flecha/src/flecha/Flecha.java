package flecha;

public class Flecha {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      int num = 4;
        do {
            int filas = (num * 2) - 1;
            int columnas = num * 2;
            int posNumero = num - 1;
            for (int j = 0; j < filas; j++) {

                for (int i = 0; i < columnas; i++) {

                    if ( i < num) {

                        if (j < posNumero && i >= (posNumero - j)) {
                            System.out.println("*");
                        } else if (j == posNumero) {
                            System.out.print("*");
                        } else if (j > posNumero && i >= (j - posNumero)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }while (num > 2);
    
    }
}
