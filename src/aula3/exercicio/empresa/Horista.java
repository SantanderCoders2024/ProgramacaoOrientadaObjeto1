package aula3.exercicio.empresa;

public class Horista extends Funcionario { //refactory parameters
    private double valorHora;
    private double qtdHora;
    private double horasExtras;

    public Horista(String nome, double valorHora, double qtdHora,double horasExtras) {     //novo construtor
        super(nome, valorHora * qtdHora, 0, 0);
        this.valorHora = valorHora;
        this.qtdHora = qtdHora;
        this.horasExtras = horasExtras;
    }

    @Override
    public double salario() {
        return valorHora * qtdHora + horasExtras();
    }

    public double horasExtras() {
        double qtdHorasExtras = horasExtras;
        if(qtdHorasExtras <= 2){
            this.horasExtras = qtdHorasExtras;
            double valorHora70 = valorHora + (valorHora * 0.7) ;
            return qtdHorasExtras * valorHora70;
        } else{
            return (valorHora * horasExtras ) * 2;
        }

    }

    public static void main(String[] args) {
        Horista horista = new Horista("Luiz", 1, 8, 2);
        System.out.println(horista.salario());
    }
}
