package Infra;

import Interface.InterfaceCadastro;

public class Endereco implements InterfaceCadastro {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    @Override
    public void entrar() {
        System.out.println("Logradouro: ");
        setLogradouro(leia.next());

        System.out.println("Número: ");
        setNumero(leia.next());

        System.out.println("Complemento: ");
        setComplemento(leia.next());

        System.out.println("Bairro: ");
        setBairro(leia.next());

        System.out.println("Cidade: ");
        setCidade(leia.next());

        System.out.println("Estado: ");
        setEstado(leia.next());

        System.out.println("CEP: ");
        setCep(leia.nextInt());
    }

    @Override
    public void imprimir() {
        System.out.println("Logradouro: " + getLogradouro());
        System.out.println("Número: " + getNumero());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Estado: " + getEstado());
        System.out.println("CEP: " + getCep());
    }
}
