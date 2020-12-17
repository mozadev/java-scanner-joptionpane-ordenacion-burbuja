package ordenarmetodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenarMetodoBurbuja {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);// para la entrada de dato
        int arreglo[], nelemnentos, aux;

        nelemnentos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));

        arreglo = new int[nelemnentos];//asignamos el numero de elemntos al arreglo

        for (int i = 0; i < nelemnentos; i++) {
            System.out.println((i + 1) + " digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        //metodo burbuja

        for (int i = 0; i < (nelemnentos - 1); i++) // numero de vueltas
        {
            for (int j = 0; j < (nelemnentos - 1); j++) { //orden los elem del arreg

                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }
            }
        }
        //mostrando el arreglo ordenado en forma creciente
        System.out.println("arreglo ordenado en forma creciente");
        for (int i = 0; i < nelemnentos; i++) {
            System.out.print(arreglo[i] + "-");

        }
        System.out.println("");

        System.out.println("arreglo ordenado en forma descendente");
        for (int i = nelemnentos - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + "-");

        }
        System.out.println("");

    }

}
