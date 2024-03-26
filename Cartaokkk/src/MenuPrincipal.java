import Financeiro.Pagar;
import Financeiro.Receber;
import Usuarios.Cliente;
import Usuarios.Fornecedor;
import Usuarios.Funcionario;

import static Interface.InterfaceCadastro.leia;

public class MenuPrincipal {
    private Cliente cliente;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Receber receber;
    private Pagar pagar;

    public MenuPrincipal() {
        this.cliente = new Cliente();
        this.fornecedor = new Fornecedor();
        this.funcionario = new Funcionario();
        this.receber = new Receber();
        this.pagar = new Pagar();
    }
    public void Menu() {
        int opt;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1 - Cadastro de Funcionários");
            System.out.println("2 - Cadastro de Clientes");
            System.out.println("3 - Cadastro de Fornecedores");
            System.out.println("4 - Contas a Receber");
            System.out.println("5 - Contas a Pagar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opt = leia.nextInt();

            switch(opt) {
                case 1:
                    subMenuFuncionario();
                    break;
                case 2:
                    // Implementar subMenuCliente();
                    break;
                case 3:
                    // Implementar subMenuFornecedor();
                    break;
                case 4:
                    // Implementar subMenuReceber();
                    break;
                case 5:
                    // Implementar subMenuPagar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while(opt != 0);
    }
//Submenu Funcionario
    public void subMenuFuncionario() {
        int opt;

        do {
            System.out.println("\n==== CADASTRO DE FUNCIONÁRIOS ====");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.nextInt();

            switch(opt) {
                case 1:
                    funcionario.entrar();
                    break;
                case 2:
                    alterarFuncionario();
                    break;
                case 3:
                    funcionario.imprimir();
                    break;
                case 4:
                    deletarFuncionario();
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while(opt != 0);
    }

    private void alterarFuncionario() {
        System.out.println("Digite o ID do funcionário que deseja alterar: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario.entrar();
            System.out.println("Funcionário alterado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    private void deletarFuncionario() {
        System.out.println("Digite o ID do funcionário que deseja excluir: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario = null;
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }
}
//Submenu Clientes