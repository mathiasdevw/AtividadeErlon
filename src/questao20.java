import java.util.HashMap;

public class questao20 {
    public static void main(String[] args){


        HashMap<Integer, String> diasDaSemana = new HashMap<>();


        diasDaSemana.put(1, "Domingo\n");
        diasDaSemana.put(2, "Segunda-Feira\n");
        diasDaSemana.put(3, "terça-feira\n");
        diasDaSemana.put(4, "Quarta-feira\n");
        diasDaSemana.put(5, "Quinta-Feira\n");

        diasDaSemana.put(3, "Quarta-feira\n");

        System.out.println(diasDaSemana);
    }
// o put atuliza o valor (: se o eu não tivesse passo o valor do 3
    //ele iria adiconar da mesma forma ao index 3 como eu defini no .put
}
