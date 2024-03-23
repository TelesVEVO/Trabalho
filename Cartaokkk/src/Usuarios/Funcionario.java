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

    }

    @Override
    public void imprimir() {

    }
}
