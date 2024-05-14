import Financeiro.Pagar;
import Financeiro.Receber;
import Usuarios.Cliente;
import Usuarios.Fornecedor;
import Usuarios.Funcionario;

import java.util.ArrayList;

import static Interface.InterfaceCadastro.leia;

public class MenuPrincipal {
    private Receber receber;
    private Pagar pagar;
    private ArrayList<Funcionario> funcionario;
    private ArrayList<Cliente> cliente;
    private ArrayList<Fornecedor> fornecedor;
    private ArrayList<Receber> contasAReceber;
    private ArrayList<Pagar> contasAPagar;

    public MenuPrincipal() {
        this.cliente = new ArrayList<>();
        this.fornecedor = new ArrayList<>();
        this.funcionario = new ArrayList<>();
        this.contasAReceber = new ArrayList<>();
        this.contasAPagar = new ArrayList<>();
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
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo ID");
            System.out.println("c. Consultar pela posição na Lista");
            System.out.println("d. Consultar pelo CPF");
            System.out.println("e. Consultar pelo Nome");
            System.out.println("f. Excluir pelo ID");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.next().charAt(0);

            switch (opt) {
                case 'a':
                    incluirFuncionario();
                    break;
                case 'b':
                    alterarFuncionario();
                    break;
                case 'c':
                    consultarPorPosicao();
                    break;
                case 'd':
                    consultarPorCPF();
                    break;
                case 'e':
                    consultarPorNome();
                    break;
                case 'f':
                    excluirFuncionario();
                    break;
                case '0':
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opt != '0');
    }

    private void incluirFuncionario() {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.entrar();
        funcionario.add(novoFuncionario);
        System.out.println("Funcionário incluído com sucesso!");
    }

    private void alterarFuncionario() {
        System.out.println("Digite o ID do funcionário que deseja alterar: ");
        int idBusca = leia.nextInt();

        for (Funcionario funcionario : funcionario) {
            if (funcionario.getId() == idBusca) {
                funcionario.entrar(); // Aqui você pode implementar um método para alterar dados específicos do funcionário
                System.out.println("Funcionário alterado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    private void consultarPorPosicao() {
        System.out.println("Digite a posição na lista do funcionário que deseja consultar: ");
        int posicao = leia.nextInt();

        if (posicao >= 0 && posicao < funcionario.size()) {
            funcionario.get(posicao).imprimir();
        } else {
            System.out.println("Posição inválida!");
        }
    }

    private void consultarPorCPF() {
        System.out.println("Digite o CPF do funcionário que deseja consultar: ");
        String cpfBusca = leia.next();

        for (Funcionario funcionario : funcionario) {
            if (funcionario.getCpf().equals(cpfBusca)) {
                funcionario.imprimir();
                return;
            }
        }
        System.out.println("Funcionário com CPF " + cpfBusca + " não encontrado!");
    }

    private void consultarPorNome() {
        System.out.println("Digite o Nome do funcionário que deseja consultar: ");
        String nomeBusca = leia.next();

        boolean encontrado = false;
        for (Funcionario funcionario : funcionario) {
            if (funcionario.getNome().equalsIgnoreCase(nomeBusca)) {
                funcionario.imprimir();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário com Nome " + nomeBusca + " não encontrado!");
        }
    }


    private void excluirFuncionario() {
        System.out.println("Digite o ID do funcionário que deseja excluir: ");
        int idBusca = leia.nextInt();

        for (int i = 0; i < funcionario.size(); i++) {
            if (funcionario.get(i).getId() == idBusca) {
                funcionario.remove(i);
                System.out.println("Funcionário excluído com sucesso!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado!");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* Submenu Clientes */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void subMenuCliente() {
        int opt;

        do {
            System.out.println("\n==== CADASTRO DE CLIENTES ====");
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo ID");
            System.out.println("c. Consultar pela posição na Lista");
            System.out.println("d. Consultar pelo CPF");
            System.out.println("e. Consultar pelo Nome");
            System.out.println("f. Excluir pelo ID");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.next().charAt(0);

            switch (opt) {
                case 'a':
                    incluirCliente();
                    break;
                case 'b':
                    alterarCliente();
                    break;
                case 'c':
                    consultarPorPosicaoCliente();
                    break;
                case 'd':
                    consultarPorCNPJ();
                    break;
                case 'e':
                    consultarPorNomeCliente();
                    break;
                case 'f':
                    excluirCliente();
                    break;
                case '0':
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opt != '0');
    }

    private void incluirCliente() {
        Cliente novoCliente = new Cliente();
        novoCliente.entrar();
        cliente.add(novoCliente);
        System.out.println("Cliente incluído com sucesso!");
    }

    private void alterarCliente() {
        System.out.println("Digite o ID do cliente que deseja alterar: ");
        int idBusca = leia.nextInt();

        for (Cliente cliente : cliente) {
            if (cliente.getId() == idBusca) {
                cliente.entrar();
                System.out.println("Cliente alterado com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    private void consultarPorPosicaoCliente() {
        System.out.println("Digite a posição na lista do cliente que deseja consultar: ");
        int posicao = leia.nextInt();

        if (posicao >= 0 && posicao < cliente.size()) {
            cliente.get(posicao).imprimir();
        } else {
            System.out.println("Posição inválida!");
        }
    }

    private void consultarPorCNPJ() {
        System.out.println("Digite o CPF do cliente que deseja consultar: ");
        String cnpjBusca = leia.next();

        for (Cliente cliente : cliente) {
            if (cliente.getCnpj().equals(cnpjBusca)) {
                cliente.imprimir();
                return;
            }
        }
        System.out.println("Funcionário com CNPJ " + cnpjBusca + " não encontrado!");
    }

    private void consultarPorNomeCliente() {
        System.out.println("Digite o Nome do cliente que deseja consultar: ");
        String nomeBusca = leia.next();

        boolean encontrado = false;
        for (Cliente cliente : cliente) {
            if (cliente.getNome().equalsIgnoreCase(nomeBusca)) {
                cliente.imprimir();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente com Nome " + nomeBusca + " não encontrado!");
        }
    }


    private void excluirCliente() {
        System.out.println("Digite o ID do cliente que deseja excluir: ");
        int idBusca = leia.nextInt();

        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getId() == idBusca) {
                cliente.remove(i);
                System.out.println("Cliente excluído com sucesso!");
                return;
            }
        }

        System.out.println("Cliente não encontrado!");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* Submenu Fornecedor */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void subMenuFornecedor() {
        int opt;

        do {
            System.out.println("\n==== CADASTRO DE FORNECEDOR ====");
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo ID");
            System.out.println("c. Consultar pela posição na Lista");
            System.out.println("d. Consultar pelo CPF");
            System.out.println("e. Consultar pelo Nome");
            System.out.println("f. Excluir pelo ID");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opt = leia.next().charAt(0);

            switch (opt) {
                case 'a':
                    incluirFornecedor();
                    break;
                case 'b':
                    alterarFornecedor();
                    break;
                case 'c':
                    consultarPorPosicaoFornecedor();
                    break;
                case 'd':
                    consultarPorCNPJFornecedor();
                    break;
                case 'e':
                    consultarPorNomeFornecedor();
                    break;
                case 'f':
                    excluirFornecedor();
                    break;
                case '0':
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opt != '0');
    }

    private void incluirFornecedor() {
        Fornecedor novoFornecedor = new Fornecedor();
        novoFornecedor.entrar();
        fornecedor.add(novoFornecedor);
        System.out.println("Fornecedor incluído com sucesso!");
    }

    private void alterarFornecedor() {
        System.out.println("Digite o ID do fornecedor que deseja alterar: ");
        int idBusca = leia.nextInt();

        for (Fornecedor fornecedor : fornecedor) {
            if (fornecedor.getId() == idBusca) {
                fornecedor.entrar();
                System.out.println("Fornecedor alterado com sucesso!");
                return;
            }
        }
        System.out.println("Fornecedor não encontrado!");
    }

    private void consultarPorPosicaoFornecedor() {
        System.out.println("Digite a posição na lista do fornecedor que deseja consultar: ");
        int posicao = leia.nextInt();

        if (posicao >= 0 && posicao < fornecedor.size()) {
            fornecedor.get(posicao).imprimir();
        } else {
            System.out.println("Posição inválida!");
        }
    }

    private void consultarPorCNPJFornecedor() {
        System.out.println("Digite o CNPJ do fornecedor que deseja consultar: ");
        String cnpjBusca = leia.next();

        for (Fornecedor fornecedor : fornecedor) {
            if (fornecedor.getCnpj().equals(cnpjBusca)) {
                fornecedor.imprimir();
                return;
            }
        }
        System.out.println("Fornecedor com CNPJ " + cnpjBusca + " não encontrado!");
    }

    private void consultarPorNomeFornecedor() {
        System.out.println("Digite o Nome do fornecedor que deseja consultar: ");
        String nomeBusca = leia.next();

        boolean encontrado = false;
        for (Fornecedor fornecedor : fornecedor) {
            if (fornecedor.getNome().equalsIgnoreCase(nomeBusca)) {
                fornecedor.imprimir();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Fornecedor com Nome " + nomeBusca + " não encontrado!");
        }
    }


    private void excluirFornecedor() {
        System.out.println("Digite o ID do funcionário que deseja excluir: ");
        int idBusca = leia.nextInt();

        for (int i = 0; i < fornecedor.size(); i++) {
            if (fornecedor.get(i).getId() == idBusca) {
                fornecedor.remove(i);
                System.out.println("Fornecedor excluído com sucesso!");
                return;
            }
        }

        System.out.println("Fornecedor não encontrado!");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* Submenu Contas Receber */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void subMenuContasReceber() {
        int opcao;

        do {
            System.out.println("\n==== SUBMENU CONTAS A RECEBER ====");
            System.out.println("a. Incluir");
            System.out.println("b. Alterar pelo número");
            System.out.println("c. Consultar pelo Nome do Cliente");
            System.out.println("d. Consultar pelo Número");
            System.out.println("e. Consultar pelo Valor");
            System.out.println("f. Consultar pela Nota Fiscal");
            System.out.println("g. Excluir pelo ID");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = leia.next().charAt(0);

            switch (opcao) {
                case 'a':
                    incluirContaAReceber();
                    break;
                case 'b':
                    alterarContaAReceber();
                    break;
                case 'c':
                    consultarReceberPorNomeCliente();
                    break;
                case 'd':
                    consultarPorNumero();
                    break;
                case 'e':
                    consultarPorValor();
                    break;
                case 'f':
                    consultarPorNotaFiscal();
                    break;
                case 'g':
                    excluirContaAReceber();
                    break;
                case '0':
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != '0');
    }

    public void incluirContaAReceber() {
        Receber novaConta = new Receber();
        novaConta.entrar();
        contasAReceber.add(novaConta);
        System.out.println("Conta a receber adicionada com sucesso!");
    }

    public void alterarContaAReceber() {
        System.out.println("Digite o número da conta a receber que deseja alterar: ");
        int numeroConta = leia.nextInt();
        for (Receber conta : contasAReceber) {
            if (conta.getNumero() == numeroConta) {
                conta.entrar();
                System.out.println("Conta a receber alterada com sucesso!");
                return;
            }
        }
        System.out.println("Conta a receber não encontrada!");
    }

    public void consultarReceberPorNomeCliente() {
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = leia.next();
        boolean encontrada = false;
        for (Receber conta : contasAReceber) {
            if (conta.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                conta.imprimir();
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma conta a receber encontrada para o cliente " + nomeCliente + ".");
        }
    }

    public void consultarPorNumero() {
        System.out.println("Digite o número da conta a receber: ");
        int numeroConta = leia.nextInt();
        boolean encontrada = false;
        for (Receber conta : contasAReceber) {
            if (conta.getNumero() == numeroConta) {
                conta.imprimir();
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma conta a receber encontrada com o número " + numeroConta + ".");
        }
    }

    public void consultarPorValor() {
        System.out.println("Digite o valor da conta a receber: ");
        double valor = leia.nextDouble();
        boolean encontrada = false;
        for (Receber conta : contasAReceber) {
            if (conta.getValor() == valor) {
                conta.imprimir();
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma conta a receber encontrada com o valor " + valor + ".");
        }
    }

    public void consultarPorNotaFiscal() {
        System.out.println("Digite a nota fiscal da conta a receber: ");
        String notaFiscal = leia.next();
        boolean encontrada = false;
        for (Receber conta : contasAReceber) {
            if (conta.getNota_fiscal().equalsIgnoreCase(notaFiscal)) {
                conta.imprimir();
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma conta a receber encontrada com a nota fiscal " + notaFiscal + ".");
        }
    }

    public void excluirContaAReceber() {
        System.out.println("Digite o ID da conta a receber que deseja excluir: ");
        int id = leia.nextInt();
        boolean encontrada = false;
        for (int i = 0; i < contasAReceber.size(); i++) {
            if (contasAReceber.get(i).getId() == id) {
                contasAReceber.remove(i);
                System.out.println("Conta a receber excluída com sucesso!");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Nenhuma conta a receber encontrada com o ID " + id + ".");
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* Submenu Contas Pagar */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /* FLUXO DE CAIXA */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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

