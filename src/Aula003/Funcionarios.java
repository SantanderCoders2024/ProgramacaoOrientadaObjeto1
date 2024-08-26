package Aula003;

public class Funcionarios {
    String nome;
    double horasTrabalhadas;
    double valorHora;
    boolean isMensalista;

    public Funcionarios(String nome, double horasTrabalhadas, double valorHora, boolean isMensalista) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.isMensalista = isMensalista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public boolean isMensalista() {
        return isMensalista;
    }

    public void setMensalista(boolean mensalista) {
        isMensalista = mensalista;
    }
}


