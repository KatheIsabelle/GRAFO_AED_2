
package Grafos.matrizdeadjacencia;
/**
 *
 * @author  Kathe Isabelle
 */

public class Aresta {
    private int verticeInicial, verticeFinal, peso;
    public Aresta(int v1, int v2, int peso) throws IllegalArgumentException{
        if((v1<0 || v1>19) || (v2< 0 || v2>19)){        //determina domínio numérico do vértice
            throw new IllegalArgumentException("Este vértice está fora do domínio do grafo (intervalo = 0 a 19)");
        }
        this.verticeInicial = v1;   //para v. de partida
        this.verticeFinal = v2;     //para v. de chegada
        this.peso = peso;           //para o peso da aresta
    }

    public int getVerticeInicial() {
        return verticeInicial;
    }

    public int getVerticeFinal() {
        return verticeFinal;
    }

    public int getPeso() {
        return peso;
    }


}