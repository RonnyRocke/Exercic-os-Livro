
import java.util.Scanner;

public class Aula5EstruraDeControle {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        byte dia;
        boolean menu = true;

        while(menu){
        System.out.print("Digite Um Dia:");
        dia = leia.nextByte();


        switch (dia) {
            case 1:
            System.out.println("Domingo");
                break;

            case 2:
            System.out.println("Segunda-Feira");
                break;

            case 3:
            System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case 5:
            System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sabádo");
                break;

            case 8:
            System.out.println("Você Saiu!");
            menu = false;

            default:
            System.out.println("OPÇÃO INVÁLIDA!");
                break;

        }
    }
        leia.close();

    }
    
}
