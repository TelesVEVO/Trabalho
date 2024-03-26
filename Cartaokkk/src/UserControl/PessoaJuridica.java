package UserControl;

import Interface.InterfaceCadastro;

public class PessoaJuridica extends Pessoa implements InterfaceCadastro {

    private String cnpj;
    private String inscricaoEstadual;
    private String contato;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public void entrar(){

        super.entrar();

        System.out.println("CNPJ: ");
        setCnpj(leia.next());

        System.out.println("Inscrição Estadual: ");
        setInscricaoEstadual(leia.next());

        System.out.println("Contato: ");
        setContato(leia.next());
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
        System.out.println("Contato: " + getContato());
    }
}
