import java.util.Stack;

public class questao15 {
    public static void main(String[] args){

        Stack<String> letras = new Stack<>();

        letras.push("A");
        letras.push("B");
        letras.push("C");
        letras.push("D");

        //usando o pop agora pra ele pega o ultimo valor empilhado e retorna ele e o while vai fazer a parte de voltar os demais

        while (!letras.empty()){
            System.out.println(letras.pop());
        }
    }
}
