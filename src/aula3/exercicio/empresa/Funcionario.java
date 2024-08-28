package aula3.exercicio.empresa;

public class Funcionario {
    String nome;
    double valorHora;
    double qtdHora;
    double salario;

//construtor
    public Funcionario(String nome, double valorHora, double qtdHora, double salario) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.salario = salario;
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

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

// métodos

}
