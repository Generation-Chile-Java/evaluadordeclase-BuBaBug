
import java.util.Arrays;
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner materia1 = new Scanner(System.in);
        Scanner materia2 = new Scanner(System.in);
        Scanner materia3 = new Scanner(System.in);

        System.out.println('\n');
        System.out.println("<< < Evaluador De Clases > >>");
        System.out.println('\n');

        System.out.println("Ingresa la nota de Biologia: ");
        Integer biologia = materia1.nextInt();
        materia1.nextLine();

        System.out.println("Ingresa la nota de Matematicas: ");
        Integer matematicas = materia2.nextInt();
        materia2.nextLine();

        System.out.println("Ingresa la nota de Etica: ");
        Integer etica = materia3.nextInt();
        materia3.nextLine();

        materia3.close();

        Integer nota = biologia + matematicas + etica;

        if (nota > 8 && nota <= 10) {
            System.out.println("Excelente");
        } else if (nota > 5 && nota <= 8) {
            System.out.println("Aceptable");
        } else if (nota > 3 && nota <= 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 0 && nota < 3) {
            System.out.println("No Aprobado");
        } else {
            System.out.println("Entrada no validad");
        }

        System.out.println(nota);
        
    }
}
