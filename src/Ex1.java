import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }


        Integer numero[] = {1,2,3,4,5};
        List<Integer> lista = Arrays.asList(numero);
        System.out.println(lista);

    }
}