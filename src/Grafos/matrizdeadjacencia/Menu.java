
package Grafos.matrizdeadjacencia;

import java.nio.Buffer;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author  Kathe Isabelle
 */
public class Menu {

    void inicia() {
        Scanner sc = new Scanner(System.in);
        Grafo g = new Grafo();
        int escolha = 0;
        do {
            try {
                mostraMenu();
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        g.printGrafo();
                        break;
                    case 2:

                        int v1,
                                v2,
                                peso;
                        System.out.println("Insira o vértice de partida:");
                        v1 = sc.nextInt();
                        System.out.println("Insira o vértice de chegada:");
                        v2 = sc.nextInt();
                        System.out.println("Insira o peso da aresta:");
                        peso = sc.nextInt();
                        Aresta a = new Aresta(v1, v2, peso);
                        g.insereAresta(a);

                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Operação não encontrada");
                }
            } catch (IllegalArgumentException | InputMismatchException ex) {
                System.out.println(ex.getMessage() == null? "Dado de entrada é inválido!" : ex.getMessage());
                //Clean buffer
                sc.nextLine();
            }

        } while (escolha != 3);
        sc.close();
    }

    void mostraMenu() {
        System.out.println("====================================");
        System.out.println("--------MENU DE OPCÕES--------------\n"
                + "\t1.MOSTRAR MATRIZ DE ADJACÊNCIA\n"
                + "\t2.INSERIR NOVO GRAFO\n"
                + "\t3.EXIT");
        System.out.println("====================================");
        System.out.print("SUA OPÇÃO ---->");

    }

}