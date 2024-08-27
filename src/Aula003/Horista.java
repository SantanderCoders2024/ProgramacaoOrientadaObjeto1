package Aula003;

public class Horista extends Funcionario {

    public Horista(String nome, double horasTrabalhadas, double valorHora, double salario) {
        super(nome, horasTrabalhadas, valorHora, salario);
    }

    public static double salario(double horas, double valorHora){
        double salarioTotal = 0;
        if(horas <= 8){
            salarioTotal = valorHora * horas;
        } else if(horas > 8 && horas <= 10){
            double horaFinal = valorHora + (valorHora * 0.7);
            salarioTotal = horaFinal * horas;
        }
        else{ //menos de duas horas extras
            salarioTotal = (horas * valorHora) * 2; ; // mais de duas horas extras
        }


        return salarioTotal;
    }
}
