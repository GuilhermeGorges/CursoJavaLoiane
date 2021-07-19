/* atividade 3 etapa 1 - implementar função de busca de usuário
* atividade 3 etapa 2 - implementar função de remover usuário
 */

import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Cadastro cadastro = new Cadastro(1);

        cadastro.menu(scan);

    }

    private final int ITENSDECADASTRO = 2;
    private String[][] cadastros;
    private int tamanho;

    public Cadastro(int capacidade) {
        this.cadastros = new String[capacidade][ITENSDECADASTRO];
        this.tamanho = 0;
    }

    public void menu(Scanner scan) { // painel de opções 
        int menu;
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Digite uma das opções:");
            System.out.println("[0] Sair ");
            System.out.println("[1] Cadastrar novo usuário ");
            System.out.println("[2] Listar todos os usuários cadastrados. ");
            System.out.println("[3] Buscar usuário");
            System.out.println("[4] Remover usuário");
            menu = scan.nextInt();

            switch (menu) {
                case 0: {
                    if (sairDoMenu()) {
                        exit = true;
                    }
                    break;
                }
                case 1: {
                    cadastrarUsuarioMenu(scan);
                    break;
                }
                case 2: {
                    listarUsuarios();
                    break;
                }
                case 3: {
                    buscarUsuarioMenu(scan); // atividade 3.1
                    break;
                }
                case 4: {
                    removeMenu(scan); // atividade 3.2
                    break;
                }
                default:
                    System.out.println("Opção inválida, tente novamente");
            }

        }

    }

    public boolean sairDoMenu() {
        System.out.println("Obrigado. volte sempre!");
        return true;
    }

    public void cadastrarUsuarioMenu(Scanner scan) {
        System.out.println("Digite o nome:");
        String nome = scan.next();
        System.out.println("Digite a idade: ");
        String idade = scan.next();
        cadastrarUsuario(nome, idade);
    }

    public void cadastrarUsuario(String nome, String idade) {
        this.aumentaCapacidade();
        if (this.tamanho < this.cadastros.length) {
            this.cadastros[this.tamanho][0] = nome;
            this.cadastros[this.tamanho][1] = idade;
            this.tamanho++;
            System.out.println("Cadastro efetuado com sucesso");
        }
    }

    private void aumentaCapacidade() {
        if (this.tamanho == cadastros.length) {
            String[][] elementosNovos = new String[this.cadastros.length * 2][ITENSDECADASTRO];
            for (int i = 0; i < this.cadastros.length; i++) {
                for (int j = 0; j < ITENSDECADASTRO; j++) {
                    elementosNovos[i][j] = this.cadastros[i][j];
                }
            }
            this.cadastros = elementosNovos;
        }
    }

    public void listarUsuarios() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println((i + 1) + " - " + this.cadastros[i][0] + " tem " + this.cadastros[i][1] + " anos.");

        }
    }

    public void buscarUsuarioMenu(Scanner scan) { // atividade 3.1 metodo buscar usuario 

        System.out.println("Digite o nome que pretende buscar:");
        String nome = scan.next();
        buscarUsuario(nome);
        if (buscarUsuario(nome) == -1) {
            System.out.println("Usuário inexistente " + buscarUsuario(nome));
        } else {
            System.out.println("O usuário está na posição " + buscarUsuario(nome));

        }
    }

    public int buscarUsuario(String nome) { // atividade 3.1 metodo buscar usuario 

        for (int i = 0; i < this.tamanho; i++) {
            if (this.cadastros[i][0].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void removeMenu(Scanner scan) {// atividade 3.2 metodo remover usuário 
        System.out.println("Digite o nome do usuario que deseja remover");
        String nome = scan.next();
        int posicao = buscarUsuario(nome);
        remove(posicao);
    }

    public void remove(int posicao) {// atividade 3.2 metodo remover usuário 
        if (!(posicao >= 0 && posicao < tamanho)) {
            System.out.println("Usuaário Inválido");
        } else {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                for (int j = 0; j < ITENSDECADASTRO; j++) {
                    this.cadastros[i][j] = this.cadastros[i + 1][j];
                }
            }
            this.tamanho--;
            System.out.println("Usuário removido com sucesso.");
        }
    }

}
