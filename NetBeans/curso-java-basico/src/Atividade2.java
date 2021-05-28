
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean confirmacao = false;
        String nome = "";
        int idade;
        int telefone;
        int cpf;
        int rg;
        String genero = "";
        String address = "";
        String confirm = "";
        
        do{
            System.out.println("Cadastro de novo membro: ");

            System.out.println("Nome: ");
            nome = scan.nextLine();

            System.out.println("Idade: ");
            idade = scan.nextInt();
            
            System.out.println("Telefone: ");
            telefone = scan.nextInt();

            System.out.println("CPF: ");
            cpf = scan.nextInt();

            System.out.println("RG: ");
            rg = scan.nextInt();

            System.out.println("Genero: ");
            genero = scan.nextLine();
            
            System.out.println("Endereço: ");
            address = scan.nextLine();
            
            System.out.println("Por favor confirme os seus dados: ");
            System.out.print("Nome: " + nome + "\n");
            System.out.print("Idade: " + idade + "\n");
            System.out.print("Telefone: " + telefone + "\n");
            System.out.print("CPF: " + cpf + "\n");
            System.out.print("RG: " + rg + "\n");
            System.out.print("Genero: " + genero + "\n");
            System.out.print("Endereço: " + address + "\n");
            while (true){
                System.out.print("Dados corretos [S/N]? ");
                confirm = scan.nextLine();
                if (confirm.equalsIgnoreCase("S")){
                    confirmacao = true; 
                    break;
                } else if (confirm.equalsIgnoreCase("N")){
                    confirmacao = false; 
                    break;
                } else {
                    System.out.println("Resposta incorreta...");
                }
            }
            
        } while (!confirmacao);
        
        System.out.println("Bem vindo "+nome + "!");        
            if (idade >= 18){
                System.out.println("Você é maior de idade!! então terá acesso ilimitado á nossa página.");
            } else {
                System.out.println("Você é menor de idade...");
                System.out.println("Seu acesso á nossa pagina será restrito... =(");
            }
            
    }
}
