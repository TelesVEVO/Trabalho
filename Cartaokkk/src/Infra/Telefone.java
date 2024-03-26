package Infra;

import Interface.InterfaceCadastro;

public class Telefone implements InterfaceCadastro {

    private int ddd;
    private long numero;

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }


    @Override
    public void entrar() {
        System.out.println("DDD: ");
        setDdd(leia.nextInt());

        System.out.println("Número: ");
        setNumero(leia.nextLong());
    }

    @Override
    public void imprimir() {
        System.out.println("DDD: " + getDdd());
        System.out.println("Número: " + getNumero());
    }
}
