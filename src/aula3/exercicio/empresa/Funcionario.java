package aula3.exercicio.empresa;

public abstract class Funcionario {
    private String nome;
    private double valorHora;
    private double qtdHora;
    private double salario;
    private boolean isMensalista;

//construtor
    public Funcionario(String nome, double valorHora, double qtdHora, double salario) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.salario = salario;
        this.isMensalista = isMensalista;
    }
//getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public boolean isMensalista() {
        return isMensalista;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMensalista(boolean mensalista) {
        isMensalista = mensalista;
    }

    // métodos
   public double salario(double salario){
        return salario;
   }

    public abstract double salario();
}
