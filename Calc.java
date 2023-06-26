import java.util.Scanner;

public class Calc {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Num n1 = new Num();
        Num n2 = new Num();
        Num result = new Num();
        String opc = "S"; 

        while(opc.equals("s") || opc.equals("S")) {
            
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());
            
            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());
            
            result.setValor(n1.getValor() + n2.getValor());
            System.out.printf("%nA soma de %d com %d eh igual a %d", n1.getValor(), n2.getValor(), result.getValor());
            
            System.out.printf("%nDeseja somar outro valor?");
            
            System.out.printf("%n s = Sim, eu quero");
            System.out.printf("%n n = Nao, eu nao quero");
            System.out.println();
            
            opc = scan.next();
            System.out.printf("%n%n");
        
            if (opc.equals("s")) {
            } else {
                System.out.println("Ate mais!");
            }

        }
    }
}