package Financeiro;

import Interface.InterfaceCadastro;
import Usuarios.Cliente;

public class Receber extends Financeiro implements InterfaceCadastro {

    private String nota_fiscal;
    private Cliente cliente;

    public Receber(){
        this.cliente = new Cliente();
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public double calcularTotal() {
        return getValor() + getJuros() - getDesconto();
    }
    @Override
    public void entrar(){
        super.entrar();

        System.out.println("Nota Fiscal: ");
        setNota_fiscal(leia.next());

        this.cliente.entrar();
    }

    @Override
    public void imprimir(){

        super.imprimir();

        if (getNota_fiscal() == null || this.cliente == null) {
            System.out.println("Não há dados suficientes para exibir o Fluxo de Caixa.");
            return;
        }

        System.out.println("Nota Fiscal: " + getNota_fiscal());
        this.cliente.imprimir();
        System.out.println("Total a Receber: " + calcularTotal());
    }
}
