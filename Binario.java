import java.util.Scanner;

public class Binario {
public static void main(String[] args) {
//Declarar variáveis
    int Resultado, num, dec = 0, power = 0;
    Scanner dado = new Scanner(System.in);

//Chamar Menu
    do {
        Menu();
        Resultado = verificaInt();
        if (Resultado == 1) {
            System.out.println("Digite um número Binário:");
            num = dado.nextInt();
            System.out.println(num);
            while (num > 0) {
                int temp = num%10;
                if(temp == 0 || temp == 1){                    
                    dec += temp*Math.pow(2, power);
                    num = num/10;
                    power++;
                    System.out.println("O número é " + dec);
                }
                
                else{
                    System.out.println("Número Inválido");
                    break;
                }
            }
        }

        if (Resultado == 2) {
            System.out.println("Digite um número Decimal:");

        }

        if (Resultado == 0){
            break;
        }
    }while(Resultado != 0);
}

public static void Menu(){
    System.out.println("-----Menu-----");
    System.out.println("1.Transformar decimal em binário\n2.Transformar binário em decimal\n0.Sair");
}

public static int verificaInt(){
    Scanner dado = new Scanner(System.in);
    int op;
    while (true) {
        if (dado.hasNextInt()) {
            op = dado.nextInt();
            return op;
        } else {
            System.out.println("Opção inválida, tente novamente!");
            dado.next(); // Limpar a entrada inválida
        }
    }
}

}
