import java.util.Scanner;

/**
 * Creamos una class llamada notas que contiene
 * funciones para ingresar notas, comprobarlas y calculas la media de ellas.
 * Con este código podemos comporbar si un alumn@ ha aprobado dicha evaluación o
 * la ha suspendido, de manera rapida y fiable.
 * 
 * @author Rocío Plaza García
 */
public class Nota {

    // declaramos la variables que nos hacen falta
    double uf01, uf02, uf03;
    double acu1, acu2, acu3, def;
    // utilizames ecaner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    /**
     * Este metodo sirve para ingresar 3 notas de unidades formativas diferentes y
     * posteriormnete en otro metodo comporbaremos si esas notas son validas o no.
     * 
     */
    public void ingresaNotas() {
        // cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        uf01 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        uf02 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        uf03 = entrada.nextDouble();

    }

    /**
     * Este metodo sirve para comprobar que hemos ingresado
     * todas las notas validas, es decir entre el 0 y el 10, si no es asi nos
     * saltara un mensaje de error en el que mostrara que la nota no es valida.
     */

    public void comprobacion() {

        if (uf01 > 10) {
            System.out.println(" La nota 1 esta mal introducida");

        } else {
            System.out.println(" La nota 1 es correcta");
        }

        if (uf02 > 10) {
            System.out.println(" La nota 2 esta mal introducida");

        } else {
            System.out.println(" La nota 2 es correcta");
        }

        if (uf03 > 10) {
            System.out.println(" La nota 3 esta mal introducida");

        }

        else {
            System.out.println(" La nota 3 es correcta");
        }
    }

    /**
     * Con este método conseguimos calcular la nota final a partir
     * de tres unidades formativas.
     * La nota final se calcula como la suma ponderada de las tres notas.
     */
    public void calculoNotas() {
        acu1 = uf01 * 0.35;
        acu2 = uf02 * 0.35;
        acu3 = uf03 * 0.30;

        def = acu1 + acu2 + acu3;

    }

    /**
     * Con este metodo conseguimos mostrar cada nota de cada unidad formativa.
     * 
     */

    public void mostrar() {
        // print ln lo que hace es que al terminar el print baja la linea
        System.out.println(" Notas introducidas son:");
        System.out.println(" nota1 = " + uf01);
        System.out.println(" nota2 = " + uf02);
        System.out.println(" nota3 = " + uf03);

        System.out.println(" Acumulado 1 = " + acu1);
        System.out.println(" Acumulado 2 = " + acu2);
        System.out.println(" Acumulado 3 = " + acu3);

        System.out.println(" Nota definitiva es = " + def);

    }

    /**
     * Con este metodo comprobamos si aprueba cada unidad,
     * la suspende o tiene un error en la nota.
     * 
     * @return Un String que indica el resultado de la evaluación: "Aprobada",
     *         "Suspendida" o "Error en las notas".
     */
    public String mensajeResultado() {
        if (def < 5 && def >= 0) {
            return "Suspendida";
        } else if (def >= 5 && def <= 10) {
            return "Aprobada";
        } else {
            return "Error en las notas";
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // creamos mecanimos para llamar a cualquier metodo fuero de la clase
        Nota fc = new Nota();

        fc.ingresaNotas();

        fc.comprobacion();

        fc.calculoNotas();

        fc.mostrar();

        fc.mensajeResultado();
    }

}
