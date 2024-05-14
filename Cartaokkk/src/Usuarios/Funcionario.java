package Usuarios;

import Interface.InterfaceCadastro;
import UserControl.PessoaFisica;

import java.util.ArrayList;

public class Funcionario extends PessoaFisica implements InterfaceCadastro  {

    private ArrayList<Funcionario> funcionario;
    private String dataAdmissao;
    private String dataDemissao;
    private String ctps;
    private double salario;

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void entrar() {

        super.entrar();

        System.out.println("Data de Admissão: ");
        setDataAdmissao(leia.next());

        System.out.println("Data de Demissão: ");
        setDataDemissao(leia.next());

        System.out.println("CTPS: ");
        setCtps(leia.next());

        System.out.println("Salário: ");
        setSalario(leia.nextDouble());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Data de Demissão: " + getDataDemissao());
        System.out.println("CTPS: " + getCtps());
        System.out.println("Saláiro: " + getSalario());
    }

    private void incluirFuncionario() {
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.entrar();
        funcionario.add(novoFuncionario);
        System.out.println("Funcionário incluído com sucesso!");
    }
}
