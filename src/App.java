import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner SC = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = SC.nextInt();
        if (edad > 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("usted aún no es mayor de edad");
        }
        SC.close();
    }
}
