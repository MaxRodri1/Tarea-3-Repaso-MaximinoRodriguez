/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3.repaso.maximinorodriguez;

import java.util.Scanner;

/**
 *
 * @author maxas
 */
public class Tarea3RepasoMaximinoRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("1-Veamos si podemos formar la palabra");
        System.out.println("2-Números primero");
        System.out.println("3-Ordenar alfabéticamente");
        System.out.println("4-Codificar cadenas");
        System.out.println("5-Jugando con arreglos");
        System.out.println("6-Salir del programa");
        System.out.println("");
        System.out.println("Que opcion desea elegir: ");

        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("");
                System.out.println("Veamos si podemos formar la palabra");
                System.out.println("");

                System.out.println("Ingrese la cadena 1: ");
                entrada.nextLine();
                String cadena1 = entrada.nextLine();

                System.out.print("Ingrese la cadena 2: ");

                String cadena2 = entrada.nextLine();

                String ResultadoFinal = PalabraFormada(cadena1, cadena2);
                System.out.println(ResultadoFinal);

                break;

            case 2:

                System.out.println("");
                System.out.println("Numeros primero");
                System.out.println("");

                System.out.println("Ingrese una cadena de numeros y letras");
                String cadenaNum = entrada.next();

                NumerosPrimero(cadenaNum);

                break;

            case 3:
                System.out.println("");
                System.out.println("Ordenar alfabeticamente");
                System.out.println("");

                System.out.println("Ingrese una cadena: ");
                entrada.nextLine();
                String CadenaAlfabetica = entrada.nextLine();
                CadenaAlfabetica = CadenaAlfabetica.toLowerCase();

                OrdenarAlfabeticamente(CadenaAlfabetica);

                break;

            case 4:
                System.out.println("");
                System.out.println("Codificar Cadenas");
                System.out.println("");

                System.out.println("Ingrese el texto que desea codificar: ");
                entrada.nextLine();
                String TextoCod = entrada.nextLine();
                String TextoCodificado = CodificarTexto(TextoCod);
                System.out.println("");
                System.out.println("El texto codificado es");
                System.out.println(TextoCodificado);

                break;

            case 5:
                System.out.println("");
                System.out.println("Jugando con Arreglos");
                System.out.println("");

                int[] Arreglo = new int[10];
                LlenarArray(Arreglo);
                ImprimirArreglo(Arreglo);
                break;
        }

    }

    public static String PalabraFormada(String cadena1, String cadena2) {
        // Determinar cuál cadena es más larga
        String cadenaLarga;
        String cadenaCorta;
        if (cadena1.length() >= cadena2.length()) {
            cadenaLarga = cadena1;
            cadenaCorta = cadena2;
        } else {
            cadenaLarga = cadena2;
            cadenaCorta = cadena1;
        }

        for (int i = 0; i < cadenaCorta.length(); i++) {
            char caracter = cadenaCorta.charAt(i);
            caracter = Character.toLowerCase(caracter);

            // Verificar si el caracter está presente en la cadena larga
            int indice = cadenaLarga.indexOf(caracter);

            if (indice != -1) {
                // Si está presente, quitar el caracter de la cadena larga
                //Si indexOf devuelve -1, significa que el caracter no está presente en la cadena más larga y, 
                //por lo tanto, no se puede armar la cadena más corta con las letras de la cadena más larga.
                cadenaLarga = cadenaLarga.substring(0, indice) + cadenaLarga.substring(indice + 1);
            } else {
                return "No se puede armar la cadena";
            }
        }

        return "Si se puede armar " + cadenaCorta;
    }

    public static void NumerosPrimero(String cadenaNumerica) {
        int i = 0;
        String numeros = "";
        String letras = "";
        while (i < cadenaNumerica.length()) {
            int codigoascii = (char) cadenaNumerica.charAt(i);
            if (codigoascii >= 48 && codigoascii <= 57) {
                numeros += cadenaNumerica.charAt(i);
            } else {
                letras += cadenaNumerica.charAt(i);
            }
            i++;
        }
        String cadenafinal = numeros + letras;
        System.out.println("La cadena ordenada es: " + cadenafinal);
    }

    public static void OrdenarAlfabeticamente(String CadenaParaOrdenar) {
        int i = 0;
        String numeros = "";
        String letras = "";
        while (i < CadenaParaOrdenar.length()) {
            int codigoascii = (char) CadenaParaOrdenar.charAt(i);
            if (codigoascii >= 97 && codigoascii <= 122) {
                letras += CadenaParaOrdenar.charAt(i);
            } else {
                numeros += CadenaParaOrdenar.charAt(i);
            }
            i++;
        }
        String letraA = "";
        String letraB = "";
        String letraC = "";
        String letraD = "";
        String letraE = "";
        String letraF = "";
        String letraG = "";
        String letraH = "";
        String letraI = "";
        String letraJ = "";
        String letraK = "";
        String letraL = "";
        String letraM = "";
        String letraN = "";
        String letraO = "";
        String letraP = "";
        String letraQ = "";
        String letraR = "";
        String letraS = "";
        String letraT = "";
        String letraU = "";
        String letraV = "";
        String letraW = "";
        String letraX = "";
        String letraY = "";
        String letraZ = "";

        for (int j = 0; j < letras.length(); j++) {
            int codigoascii2 = letras.charAt(j);
            switch (codigoascii2) {
                case 97:
                    letraA += letras.charAt(j);
                    break;
                case 98:
                    letraB += letras.charAt(j);
                    break;
                case 99:
                    letraC += letras.charAt(j);
                    break;
                case 100:
                    letraD += letras.charAt(j);
                    break;
                case 101:
                    letraE += letras.charAt(j);
                    break;
                case 102:
                    letraF += letras.charAt(j);
                    break;
                case 103:
                    letraG += letras.charAt(j);
                    break;
                case 104:
                    letraH += letras.charAt(j);
                    break;
                case 105:
                    letraI += letras.charAt(j);
                    break;
                case 106:
                    letraJ += letras.charAt(j);
                    break;
                case 107:
                    letraK += letras.charAt(j);
                    break;
                case 108:
                    letraL += letras.charAt(j);
                    break;
                case 109:
                    letraM += letras.charAt(j);
                    break;
                case 110:
                    letraN += letras.charAt(j);
                    break;
                case 111:
                    letraO += letras.charAt(j);
                    break;
                case 112:
                    letraP += letras.charAt(j);
                    break;
                case 113:
                    letraQ += letras.charAt(j);
                    break;
                case 114:
                    letraR += letras.charAt(j);
                    break;
                case 115:
                    letraS += letras.charAt(j);
                    break;
                case 116:
                    letraT += letras.charAt(j);
                    break;
                case 117:
                    letraU += letras.charAt(j);
                    break;
                case 118:
                    letraV += letras.charAt(j);
                    break;
                case 119:
                    letraW += letras.charAt(j);
                    break;
                case 120:
                    letraX += letras.charAt(j);
                    break;
                case 121:
                    letraY += letras.charAt(j);
                    break;
                case 122:
                    letraZ += letras.charAt(j);
                    break;

            }
        }
        String cadenaFinal = letraA + letraB + letraC + letraD + letraE + letraF + letraG + letraH + letraI + letraJ + letraK + letraL + letraM + letraN + letraO + letraP + letraQ + letraR + letraS + letraT + letraU + letraV + letraW + letraX + letraY + letraZ;

        System.out.println("La cadena de letras es: " + cadenaFinal);
        System.out.println("Valor entero retornado: " + numeros);
    }

    public static String CodificarTexto(String texto) {
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (caracter) {
                case ' ':                    
                    resultado = resultado.substring(0, resultado.length() - 1);
                    resultado += " ";
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    // Si es un número, reemplaza por la letra equivalente
                        resultado += (char) ('A' - 1 + (caracter - '0'));
                        resultado += "-"; 
                    
                    break;
                default:
                    // Si es una letra, reemplaza por el número equivalente,y se utiliza - 96 
                        resultado += (int) (caracter - 96) + "-";
                    break;
            }
        }
        // Elimina el último guión si la cadena no está vacía
        if (resultado.length() > 0) {
            resultado = resultado.substring(0, resultado.length() - 1);
        }
        return resultado;
    }

    public static void LlenarArray(int[] letras) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite los digitos del arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " Digite un caracter");
            letras[i] = entrada.nextInt();
        }
    }

    public static void ImprimirArreglo(int letras[]) {

        System.out.println("Los numeros del arreglo son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(letras[i] + " ");
        }
    }

}
