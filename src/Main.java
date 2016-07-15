import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner sc =new Scanner(System.in);

        int sueldos=0;
        int sueldosMasde1000=0;

        for(int i=1;i<10;i++){
            System.out.println("Introduce un sueldo");
            int sueldo = sc.nextInt();

            if (sueldo>1000)
                sueldosMasde1000++;
                sueldos+=sueldo;
        }
        System.out.println("la suma total de los sueldo es: " +sueldos);
        System.out.println("el numero de sueldos que superan los 1000: " +sueldosMasde1000);
    }
}
