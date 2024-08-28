package aula3.exercicio.empresa;

public class Mensalista extends Funcionario{
    public Mensalista(String nome, double valorHora, double qtdHora, double salario) {
        super(nome, valorHora, qtdHora, salario);
    }

    @Override
    public double salario() {
        return 0;
    }
}
