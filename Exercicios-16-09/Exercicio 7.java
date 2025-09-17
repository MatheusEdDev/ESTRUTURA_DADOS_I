import java.util.*; // Importa todas as classes do pacote java.util, incluindo a classe Arrays.

public class ArrayOrdena {
    public static void main (String[] args) {
        
        String[] nomes = {"Lucas", "Daniel", "Julia", "Tatiana", "Izabela", "Matheus"};
        char[] vogais = {'i', 'u', 'a', 'o', 'e'};
        int[] numeros = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
        float[] notas = {7.6f, 8.5f, 9.7f, 5.4f, 7.4f};
        
        Arrays.sort(nomes);
        
        System.out.println("\nNomes:");
        for (String nome: nomes) {
            System.out.print(nome + ", ");
        }
        
        Arrays.sort(vogais);
        System.out.print("\nVogais: ");
        for (char vogal: vogais){
            System.out.print(vogal + ", ");
        }

        Arrays.sort(numeros);
        System.out.print("\nNúmeros: ");
        for (int numero: numeros){
            System.out.print(numero + ", ");
        }
        
        Arrays.sort(notas);
        System.out.print("\nNotas: ");
        for (float nota: notas){
            System.out.print(nota + ", ");
        }
        
        // Encerra o programa. O argumento '0' indica que o programa terminou com sucesso.
        System.exit(0);
    }
}

/******************
    Qual a função do método Arrays.sort() no programa OrdenaArray.java?
    R: Ele tem a função de ordenar em ordem alfabética ou ordem crescente. 
*/
