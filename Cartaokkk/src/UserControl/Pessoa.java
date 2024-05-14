package UserControl;

import Infra.Endereco;
import Infra.Telefone;
import Interface.InterfaceCadastro;

public abstract class Pessoa implements InterfaceCadastro {

    private int id;
    private String nome;
    private String email;
    private Telefone telefone;
    private Endereco endereco;

    public Pessoa() {
       this.telefone = new Telefone();
       this.endereco = new Endereco();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void entrar() {
        System.out.println("ID: ");
        setId(leia.nextInt());

        System.out.println("Nome: ");
        setNome(leia.next());

        System.out.println("Email: ");
        setEmail(leia.next());

        this.telefone.entrar();

        this.endereco.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        this.telefone.imprimir();
        this.endereco.imprimir();
    }
}
