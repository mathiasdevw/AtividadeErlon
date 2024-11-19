import java.util.LinkedList;

public class Questao12 {
    public static void main(String[] args){

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.addFirst(0);
        numbers.addLast(6);


        // ou
//        numbers.add(0, 0);
//        numbers.add(numbers.size(), 6);

        // a lista começa vai começar com 0 adicionado com index, e depois adiconar o 6 na lista pelo index tbm

        System.out.println(numbers);

    }

}
