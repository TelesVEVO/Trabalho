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

    /* Menu */
    public void Menu() {
        int opt;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1 - Cadastro de Funcionários");
            System.out.println("2 - Cadastro de Clientes");
            System.out.println("3 - Cadastro de Fornecedores");
            System.out.println("4 - Contas a Receber");
            System.out.println("5 - Contas a Pagar");
            System.out.println("6 - Exibir Fluxo de Caixa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opt = leia.nextInt();

            switch(opt) {
                case 1:
                    subMenuFuncionario();
                    break;
                case 2:
                    subMenuCliente();
                    break;
                case 3:
                    subMenuFornecedor();
                    break;
                case 4:
                    subMenuContasReceber();
                    break;
                case 5:
                    subMenuContasPagar();
                    break;
                case 6:
                    exibirFluxoCaixa();
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

    /* Submenu Funcionario*/
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

    /* Submenu Clientes */

    public void subMenuCliente() {
        int opt;

        do {
            System.out.println("\n==== CADASTRO DE CLIENTES ====");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.nextInt();

            switch(opt) {
                case 1:
                    cliente.entrar();
                    break;
                case 2:
                    alterarCliente();
                    break;
                case 3:
                    cliente.imprimir();
                    break;
                case 4:
                    deletarCliente();
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

    private void alterarCliente() {
        System.out.println("Digite o ID do funcionário que deseja alterar: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario.entrar();
            System.out.println("Funcionário alterado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    private void deletarCliente() {
        System.out.println("Digite o ID do funcionário que deseja excluir: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario = null;
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    /* Submenu Fornecedor */

    public void subMenuFornecedor() {
        int opt;

        do {
            System.out.println("\n==== CADASTRO DE FORNECEDORES ====");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.nextInt();

            switch(opt) {
                case 1:
                    fornecedor.entrar();
                    break;
                case 2:
                    alterarFornecedor();
                    break;
                case 3:
                    fornecedor.imprimir();
                    break;
                case 4:
                    deletarFornecedor();
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

    private void alterarFornecedor() {
        System.out.println("Digite o ID do funcionário que deseja alterar: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario.entrar();
            System.out.println("Funcionário alterado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    private void deletarFornecedor() {
        System.out.println("Digite o ID do funcionário que deseja excluir: ");
        int idBusca = leia.nextInt();

        if(funcionario.getId() == idBusca) {
            funcionario = null;
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    /* Submenu Contas Receber */

    private void subMenuContasReceber() {
        int opcao;

        do {
            System.out.println("\n==== SUBMENU CONTAS A RECEBER ====");
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Consultar");
            System.out.println("4. Excluir");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                    receber.entrar();
                    break;
                case 2:
                    alterarContasReceber();
                    break;
                case 3:
                    receber.imprimir();
                    break;
                case 4:
                    deletarContasReceber();
                    break;
                case 5:
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while(opcao != 5);
    }

    private void alterarContasReceber() {
        System.out.println("Digite o ID da conta a receber que deseja alterar: ");
        int idBusca = leia.nextInt();

        if(receber.getId() == idBusca) {
            receber.entrar();
            System.out.println("Conta a receber alterada com sucesso!");
        } else {
            System.out.println("Conta a receber não encontrada!");
        }
    }

    private void deletarContasReceber() {
        System.out.println("Digite o ID da conta a receber que deseja excluir: ");
        int idBusca = leia.nextInt();

        if(receber.getId() == idBusca) {
            receber = null;
            System.out.println("Conta a receber excluída com sucesso!");
        } else {
            System.out.println("Conta a receber não encontrada!");
        }
    }

    /* Submenu Contas Pagar */

    private void subMenuContasPagar() {
        int opcao;

        do {
            System.out.println("\n==== SUBMENU CONTAS A PAGAR ====");
            System.out.println("1. Incluir");
            System.out.println("2. Alterar");
            System.out.println("3. Consultar");
            System.out.println("4. Excluir");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                    pagar.entrar();
                    break;
                case 2:
                    alterarContasPagar();
                    break;
                case 3:
                    pagar.imprimir();
                    break;
                case 4:
                    deletarContasPagar();
                    break;
                case 5:
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while(opcao != 5);
    }

    private void alterarContasPagar() {
        System.out.println("Digite o ID da conta a pagar que deseja alterar: ");
        int idBusca = leia.nextInt();

        if(pagar.getId() == idBusca) {
            pagar.entrar();
            System.out.println("Conta a pagar alterada com sucesso!");
        } else {
            System.out.println("Conta a pagar não encontrada!");
        }
    }

    private void deletarContasPagar() {
        System.out.println("Digite o ID da conta a pagar que deseja excluir: ");
        int idBusca = leia.nextInt();

        if(pagar.getId() == idBusca) {
            pagar = null;
            System.out.println("Conta a pagar excluída com sucesso!");
        } else {
            System.out.println("Conta a pagar não encontrada!");
        }
    }

    /* FLUXO DE CAIXA */

    public void exibirFluxoCaixa() {
        double totalReceitas = 0;
        double totalDespesas = 0;

        if(receber != null) {
            totalReceitas = receber.getValor() + receber.getJuros() - receber.getDesconto();
        }

        if(pagar != null) {
            totalDespesas = pagar.getValor() + pagar.getJuros() + pagar.getMulta() - pagar.getDesconto();
        }

        System.out.println("----- FLUXO DE CAIXA -----");
        System.out.println("Receitas (Contas a Receber): R$" + totalReceitas);
        System.out.println("Despesas (Contas a Pagar): R$" + totalDespesas);
        System.out.println("Saldo Total: R$" + (totalReceitas - totalDespesas));
    }
}

