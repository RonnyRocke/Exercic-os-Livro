import java.util.Scanner;

public class Aula7OOP {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aula7OOP2 A72 = new Aula7OOP2(" Carlos ", 20, 1000);

        Aula7OOP2 A73 = new Aula7OOP2("Edu", 31, 100);

        Aula7OOP2 A74 = new Aula7OOP2(null, 0, 0);

        System.out.println("RESULTADO A72");
        A72.Listartudo();
        System.out.println("-----------------------------");

        System.out.println("RESULTADO A73");
        A73.Listartudo();
        System.out.println("-----------------------------");

        System.out.println("RESULTADO A73 MODIFICADO");
        A73.name = " Carlinhos ";
        A73.age = 19;
        A73.saldo = 982;
        A73.Listartudo();
        System.out.println("-----------------------------");

        
        System.out.print("DIGITE UM NOME PARA O A74: ");
        A74.name = sc.next();

        System.out.print("DIGITE UMA IDADE PARA  O A74: ");
        A74.age = sc.nextInt();

        System.out.print("DIGITE UM SALDO PARA A74: ");
        A74.saldo = sc.nextFloat(); // CONVERTI DOUBLE PARA FLOAT.
        
        System.out.println("-----------------------------");
        System.out.println("RESULTADO A74");
        A74.Listartudo();
        
        
        sc.close();
    }
    
    
}
