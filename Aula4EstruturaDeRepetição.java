import java.util.Scanner;

public class Aula4EstruturaDeRepetição {
    public static void main(String[] args) {
      
        for(int UmAteDez = 1; UmAteDez<=10;UmAteDez++){
            System.out.println(UmAteDez);
        }
        System.out.println("----------------------");

        Boolean inicio = true;
        Scanner leia = new Scanner(System.in);
        
        while(inicio){
            System.out.println("Caso Queira Sair Digite 0");
            System.out.print("Digite um Número: ");
            int numero = leia.nextInt();

            if(numero == 0){
                System.out.println("Você Saiu!");
                inicio = false;
                break;
            }
            else if(numero >10){
                System.out.println("Favor digitar um Número menor que 10!");
        }
            else{
                for(int multiplicando  = 1; multiplicando<=10; multiplicando++){
                    System.out.println(numero + "X" + multiplicando + " = " + numero*multiplicando);
                }
            }
        }
        leia.close();;
    }
}
