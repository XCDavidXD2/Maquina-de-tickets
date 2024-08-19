import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("Elige el billete que deseas: ");
        System.out.println("1. T-usual");
        System.out.println("2. T-casual");
        System.out.println("3. T-joven");
        System.out.println("4. Billete sencillo");
        System.out.println("5. Salir");
        opcion = leer.nextInt();

        switch (opcion){
            case 1:
                Tusual();
                break;
            case 2:
                Tcasual();
                break;
            case 3:
                Tjoven();
                break;
            case 4:
                BilleteSencillo();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("No has puesto un numero valido, intentelo de nuevo...");
                Menu();
        }
    }
    public static void Tusual() {

        Scanner leer = new Scanner(System.in);

        double tusual = 21.35;
        double dineroIntroducido = 0;
        double dinero;
        double cantidadFaltante;
        double cambio;

        System.out.println("El precio del billete es: " + tusual + "€");

        while (dineroIntroducido < tusual) {
            System.out.println("Introduce dinero: ");
            dinero = leer.nextDouble();
            dineroIntroducido += dinero;

            if (dineroIntroducido < tusual) {
                cantidadFaltante = tusual - dineroIntroducido;
                System.out.println("Te faltan " + cantidadFaltante + "€ para completar la compra.");
            } else if (dineroIntroducido > tusual) {
                cambio = dineroIntroducido - tusual;
                System.out.println("Compra completada. Tu cambio es: " + cambio + "€");
            } else {
                System.out.println("Compra completada. No hay cambio.");
            }
        }
    }
    public static void Tcasual() {

        Scanner leer = new Scanner(System.in);

        double tcasual = 19.99;
        double dineroIntroducido = 0;
        double dinero;
        double cantidadFaltante;
        double cambio;

        System.out.println("El precio del billete es de " + tcasual + "€");

        while (dineroIntroducido < tcasual) {
            System.out.println("Introduce dinero: ");
            dinero = leer.nextDouble();
            dineroIntroducido += dinero;

            if (dineroIntroducido < tcasual) {
                cantidadFaltante = tcasual - dineroIntroducido;
                System.out.println("Te faltan " + cantidadFaltante + "€ para completar la compra.");
            } else if (dineroIntroducido > tcasual) {
                cambio = dineroIntroducido - tcasual;
                System.out.println("Compra completada. Tu cambio es: " + cambio + "€");
            } else {
                System.out.println("Compra completada. No hay cambio.");
            }
        }
    }
    public static void Tjoven() {

        Scanner leer = new Scanner(System.in);

        double tjoven = 39.99;
        double dineroIntroducido = 0;
        double dinero;
        double cantidadFaltante;
        double cambio;

        System.out.println("El precio del billete es de " + tjoven + "€");

        while (dineroIntroducido < tjoven) {
            System.out.println("Introduce dinero: ");
            dinero = leer.nextDouble();
            dineroIntroducido += dinero;

            if (dineroIntroducido < tjoven) {
                cantidadFaltante = tjoven - dineroIntroducido;
                System.out.println("Te faltan " + cantidadFaltante + "€ para completar la compra.");
            } else if (dineroIntroducido > tjoven) {
                cambio = dineroIntroducido - tjoven;
                System.out.println("Compra completada. Tu cambio es: " + cambio + "€");
            } else {
                System.out.println("Compra completada. No hay cambio.");
            }
        }
    }
    public static void BilleteSencillo() {

        Scanner leer = new Scanner(System.in);

        double billeteSencillo = 3.99;
        double dineroIntroducido = 0;
        double dinero;
        double cantidadFaltante;
        double cambio;

        System.out.println("El precio del billete es de " + billeteSencillo + "€");

        while (dineroIntroducido < billeteSencillo) {
            System.out.println("Introduce dinero: ");
            dinero = leer.nextDouble();
            dineroIntroducido += dinero;

            if (dineroIntroducido < billeteSencillo) {
                cantidadFaltante = billeteSencillo - dineroIntroducido;
                System.out.println("Te faltan " + cantidadFaltante + "€ para completar la compra.");
            } else if (dineroIntroducido > billeteSencillo) {
                cambio = dineroIntroducido - billeteSencillo;
                System.out.println("Compra completada. Tu cambio es: " + cambio + "€");
            } else {
                System.out.println("Compra completada. No hay cambio.");
            }
        }
    }
}