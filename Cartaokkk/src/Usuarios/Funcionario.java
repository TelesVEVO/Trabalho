package Usuarios;

import Interface.InterfaceCadastro;
import UserControl.PessoaFisica;

public class Funcionario extends PessoaFisica implements InterfaceCadastro  {

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
        String novaDta = leia.next();
        setDataAdmissao(novaDta);

        System.out.println("Data de Demissão: ");
        String novaDtd = leia.next();
        setDataDemissao(novaDtd);

        System.out.println("CTPS: ");
        String novoCtps = leia.next();
        setCtps(novoCtps);

        System.out.println("Salário: ");
        double novoSalario = leia.nextDouble();
        setSalario(novoSalario);
    }

    @Override
    public void imprimir() {
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Data de Demissão: " + getDataDemissao());
        System.out.println("CTPS: " + getCtps());
        System.out.println("Saláiro: " + getSalario());
    }
}
