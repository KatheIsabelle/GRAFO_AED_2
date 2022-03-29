
package Grafos.matrizdeadjacencia;

import java.util.Random;

/**
 *
 * @author  Kathe Isabelle
 */
public class Grafo {

    private int matriz[][];
    private int numVertices = 20;
    private int pos[];

    //Grafo null
    public Grafo() {
        this.matriz = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                matriz[i][j] = 0;
            }

        }
    }
    //insere aresta
    public void insereAresta(Aresta aresta) {
        int v1 = aresta.getVerticeInicial();
        int v2 = aresta.getVerticeFinal();
        matriz[v1][v2] = aresta.getPeso();
    }
    //printa grafo
    public void printGrafo() {
        for (int coluna = 0; coluna < numVertices; coluna++) {
            if (coluna == 0) {
                System.out.printf("%10d", coluna);
                continue;
            }
            System.out.printf("%8d", coluna);
        }
        System.out.println();
        for (int i = 0; i < numVertices; i++) {
            System.out.printf("%2d", i);
            for (int j = 0; j < numVertices; j++) {
                System.out.printf("%8d", matriz[i][j]);
            }
            System.out.println();

        }
    }

}