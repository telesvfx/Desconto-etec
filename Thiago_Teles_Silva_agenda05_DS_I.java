import java.util.Scanner;

public class Thiago_Teles_Silva_agenda05_DS_I {
        public static void main(String[] args) {

 Scanner leitor = new Scanner(System.in);

 System.out.print("Por favor, digite o seu nome: ");
 String cliente = leitor.nextLine();

 double total;
 double valor;
 double desconto;
 double resultado;

 desconto = 0;
 valor = 0;
 resultado = 0;

 System.out.print(cliente + ", digite o valor total de sua compra: R$ ");
 total = leitor.nextDouble();

 if (total < 200) {
     desconto = 5;  
}


else if (total >= 200.0 && total < 300) {
     desconto = 10; 
} 


else if (total >= 300) {
     desconto = 15; 
}

 
 valor = (total / 100) * desconto;
 resultado = total - valor;

 System.out.printf("Sr. ª " + cliente + " o desconto aplicado foi de: R$ %.2f%n ", valor);
 
 System.out.printf("O total da compra com o desconto aplicado foi de: R$ %.2f%n", resultado);

 leitor.close();
}
}
