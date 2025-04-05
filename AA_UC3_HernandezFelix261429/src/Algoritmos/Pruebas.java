/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Algoritmos;

/**
 *
 * @author PC WHITE WOLF
 */
public class Pruebas {

    
       public static void main(String[] args) {
        int[] datos = {5, 3, 8, 1, 4};

        System.out.println("Arreglo original:");
        mostrarArreglo(datos);

        // Ordenar con Selection Sort
        Ordenamientos.selectionSort(datos);
        System.out.println("Arreglo ordenado con Selection Sort:");
        mostrarArreglo(datos);

        // Búsqueda lineal de un número
        int valorBuscado = 4;
        int resultado = Busquedas.busquedaLineal(datos, valorBuscado);
        if (resultado != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado en el índice " + resultado);
        } else {
            System.out.println("Valor " + valorBuscado + " no encontrado.");
        }
    }

    // Método auxiliar para imprimir el arreglo
    public static void mostrarArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
