
import java.util.ArrayList;
import java.util.Scanner;

public class CaixaEletronico {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<ContaBancaria>contasBancarias;
   
    public static void main (String[] args) {
        contasBancarias = new ArrayList<ContaBancaria>();
        operacoes();

}
    public static void operacoes() {

        System.out.println("----------------------------------------");
        System.out.println("-----Bem vindo ao caixa Eletronico------");
        System.out.println("----------------------------------------");
        System.out.println("**********Selecione uma Opção-----------");
        System.out.println("----------------------------------------");
        System.out.println(" Opção 1 - Criar conta  |");
        
    
        int operacao = input.nextInt();

        switch(operacao) {
        case 1:
        criarConta();
        break;
         case 2:
        verSaldo();
        break;
        case 3:
        depositarContas();
        break;
      case 4:
       System.out.println("Obrigado por utilizar nossa agência");

       System.exit(0);
       
       default:
       System.out.println("Opção inválida");
       operacoes();
       break;
        }
       
    }
    




private static void depositarContas() {
    }
private static void verSaldo() {
    }
public static void criarConta() {

System.out.println("\nNome: ");
 String nome = input.next();


 System.out.println("\nSobreNome: ");
 String sobreNome = input.next();

  System.out.println("\nAgencia: ");
 String agencia = input.next();

  Pessoa pessoa = new Pessoa (nome, sobreNome, agencia);
  
  ContaBancaria conta = new ContaBancaria(pessoa);

  contasBancarias.add(conta);
  System.out.println(" Sua conta foi criada com sucesso número da CONTA 89193|");
  System.out.println("Olá--------" + nome + "------obrigado por criar uma conta em nosso banco|");
  System.out.println (", -------sua agência é-----" + agencia + "-----E seu saldo 528,35, já está disponível para saque|");

 
  operacoes();

}
public class InnerCaixaEletronico {
        
            
        }
    
    }

