package Financeiro;

import Interface.InterfaceCadastro;
import Usuarios.Fornecedor;

public class Pagar extends Financeiro implements InterfaceCadastro {

    private String boleto;
    private Fornecedor fornecedor;

    public Pagar(){
        this.fornecedor = new Fornecedor();
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public double calcularTotal() {
        return getValor() + getJuros() - getDesconto();
    }

    @Override
    public void entrar(){
        super.entrar();

        System.out.println("Boleto: ");
        setBoleto(leia.next());

        this.fornecedor.entrar();
    }

    @Override
    public void imprimir(){

        if (getBoleto() == null || this.fornecedor == null) {
            System.out.println("Não há dados suficientes para exibir o Fluxo de Caixa.");
            return;
        }

        System.out.println("Boleto: " + getBoleto());
        this.fornecedor.imprimir();
        System.out.println("Total a Pagar: " + calcularTotal());
    }
}
