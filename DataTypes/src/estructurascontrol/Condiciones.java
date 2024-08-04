package estructurascontrol;

public class Condiciones {
    
    public static void main(String[] args) {
        
        // condiciones ejecutan 1 o 2 opciones en base a la resolucion de una condicion
        /* sintaxys estructura if
        * if (condicion) {      - condicion usa booleans
        *      codigo si la condicion es verdadera
        * } else {
        *      codigo si la condicion es falsa
        * }
        */

        // operador de comparacion - == solo funciona con tipos primitivos
        // operador de asignacion - =
        int num = 10;

        if (num == 10) {
            System.out.println("el numero si es 10");
        } else {
            System.out.println("el numero no es 10");
        }

        int num1 = 15;
        int num2 = 15;
        int num3 = 20;

        // operador mayor que - >
        // operador menor que - <
        // operador mayor o igual que - >=
        // operador menor o igual que - <=

        // comparacion con num1
        System.out.println("Comparaciones de num1:");
        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
        } else if (num1 <= num2){
            System.out.println("num1 es menor o igual que num2");
        } else if (num1 == num2) {
            System.out.println("num1 es igual a num2");
        } else {
            System.out.println("Ninguna condicion se cumple");
        }

        if (num1 > num3) {
            System.out.println("num1 es mayor que num3");
        } else {
            System.out.println("num1 es menor que num3");
        }

        /*
         * input num;
         * 
         * input fue 10
         * 
         * el numero 10 es par
         */

    }
}
