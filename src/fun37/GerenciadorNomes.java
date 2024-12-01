/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fun37;

import java.util.Scanner;

public class GerenciadorNomes {

    private final String[] nomes = new String[5];

    public void executar() {
        // Preencher nomes
        preencherNomes();

        // Ordenar os nomes
        ordenarNomes();

        // Imprimir os nomes ordenados
        imprimirNomesOrdenados();
    }

    private void preencherNomes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
    }

    private void ordenarNomes() {
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    String aux = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux;
                }
            }
        }
    }

    private void imprimirNomesOrdenados() {
        System.out.println("\nNOMES ORDENADOS");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }
    }
}
