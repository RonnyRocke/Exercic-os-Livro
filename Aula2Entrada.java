
import java.util.Scanner;
public class Aula2Entrada {
   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite algo: ");
        String digiteialgo = leia.next();

        System.out.print("Digite Sua Idade: ");
        int idade = leia.nextInt();
        leia.close();

        System.out.println("Você Digitou: " + digiteialgo);
        System.out.println("Sua Idade é: " + idade);


    }
    
}
