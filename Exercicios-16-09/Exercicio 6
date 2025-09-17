import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Stack para armazenar Strings.
        // Stack é uma estrutura de dados LIFO (Last-In, First-Out).
        Stack<String> historicoDeNavegacao = new Stack<>();

        // 1. Adiciona elementos na pilha usando o método push().
        // O último elemento adicionado será o primeiro a ser removido.
        historicoDeNavegacao.push("youtube.com");
        historicoDeNavegacao.push("google.com");
        historicoDeNavegacao.push("instagram.com");
        historicoDeNavegacao.push("x.com");
        historicoDeNavegacao.push("facebook.com"); // Este é o topo da pilha agora.

        // 2. Acessa o elemento do topo da pilha sem removê-lo.
        // O método peek() retorna "carrinho.com".
        System.out.println("Página atual (topo): " + historicoDeNavegacao.peek());

        // 3. Remove e retorna o elemento do topo da pilha.
        // O método pop() remove "carrinho.com" e o retorna
        historicoDeNavegacao.pop();
        System.out.println("Voltando para a página anterior: " + historicoDeNavegacao.peek());

        // 4. Acessa o novo elemento do topo da pilha.
        // O novo topo é "produtos.com".
        System.out.println("Página atual: " + historicoDeNavegacao.peek());
    }
}
