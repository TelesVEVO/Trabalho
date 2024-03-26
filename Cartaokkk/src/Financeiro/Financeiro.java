package Financeiro;

import Interface.InterfaceCadastro;

import javax.sound.midi.Soundbank;

public class Financeiro implements InterfaceCadastro {

    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private double total;




    @Override
    public void entrar() {
        System.out.println("ID: ");
        setId(leia.nextInt());

        System.out.println("Número: ");
        setNumero(leia.nextInt());

        System.out.println("Emissão: ");
        setEmissao(leia.next());

        System.out.println("Vencimento: ");
        setVencimento(leia.next());

        System.out.println("Pagamento: ");
        setPagamento(leia.next());

        System.out.println("Valor: ");
        setValor(leia.nextDouble());

        System.out.println("Juros: ");
        setJuros(leia.nextDouble());

        System.out.println("Multa: ");
        setMulta(leia.nextDouble());

        System.out.println("Desconto: ");
        setDesconto(leia.nextDouble());

        System.out.println("Total: ");
        setTotal(leia.nextDouble());
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + getId());
        System.out.println("Número: " + getNumero());
        System.out.println("Emissão: " + getEmissao());
        System.out.println("Vencimento: " + getVencimento());
        System.out.println("Pagamento: " + getPagamento());
        System.out.println("Valor: " + getValor());
        System.out.println("Juros: " + getJuros());
        System.out.println("Multa: " + getMulta());
        System.out.println("Desconto: " + getDesconto());
        System.out.println("Total: " + getTotal());
    }
}
