package Projetos_Individuais;
import java.util.Scanner;

public class Binario {
public static void main(String[] args) {
//Declarar variáveis
    int Resultado, num;
    Scanner dado = new Scanner(System.in);

//Chamar Menu
    do {
        Menu();
        Resultado = verificaInt();
        if (Resultado == 1) {
            System.out.println("Digite um número Binário:");
            num = dado.nextInt();
            int temp = 0;
            int dec = 0;
            int power = 0;
                while (num > 0) {
                    temp = num%10;
                    if(temp == 0 || temp == 1){                    
                        dec += temp*Math.pow(2, power);
                        num = num/10;
                        power++;
                    }
                    else{
                        System.out.println("Número Inválido");
                        break;
                    }
                }
            System.out.println("O número decimal é " + dec);
        }

        if (Resultado == 2) {
            System.out.println("Digite um número Decimal:");
            num = dado.nextInt();
            int temp = 0;
            int bin = 0;
            double power = 0;
            int sub = 0;
            for(int i = 0; power < num; i++){
                power = Math.pow(2, i);
                System.out.println(power);
            }                           
        }

        if (Resultado == 0){
            break;
        }
    }while(Resultado != 0);
}

public static void Menu(){
    System.out.println("-----Menu-----");
    System.out.println("1.Transformar binário em decimal\n2.Transformar decimal em binário\n0.Sair");
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
