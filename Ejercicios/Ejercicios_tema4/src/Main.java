public class Main {
    public static void main(String[] args)
    {
        /*EJERCICIO 1*/
        System.out.println("Ejercicio 1");

        int numeroIf = -1;

        if (numeroIf == 0) {
            System.out.println("El número es 0");
        }
        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        }
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        }

        /*EJERCICIO 2*/
        System.out.println("Ejercicio 2");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /*EJERCICIO 3*/
        System.out.println("Ejercicio 3");

        do {
            System.out.println(numeroWhile);
                    numeroWhile++;
        } while (numeroWhile < 0);

        /*EJERCICIO 4*/
        System.out.println("Ejercicio 4");

        for (int numeroFor = 1; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /*EJERCICIO 5*/
        System.out.println("Ejercicio 5");

        var estacion = "invierno";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion");
                break;
        }
    }
}