package Usuarios;

import Infra.Endereco;
import Interface.InterfaceCadastro;
import UserControl.PessoaJuridica;

public class Cliente extends PessoaJuridica implements InterfaceCadastro {

    Endereco enderecoCobranca;
    private double limiteCredito;

    public Cliente(){
        this.enderecoCobranca = new Endereco();
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void entrar(){

        super.entrar();

        System.out.print("Limite de Crédito: ");
        setLimiteCredito(leia.nextDouble());

        this.enderecoCobranca.entrar();

    }

    @Override
    public void imprimir(){
        System.out.println("Limite de Crédito: " + getLimiteCredito());
        this.enderecoCobranca.imprimir();
    }
}
