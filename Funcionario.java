package Aula10_Nova_Api_de_Datas_labs;

import java.time.Duration;
import java.time.LocalTime;

public class Funcionario {

    private String nome;
    private LocalTime horarioEntrada;
    private LocalTime horarioSaida;

    public Funcionario(String nome, LocalTime horarioEntrada, LocalTime horarioSaida) {
        this.nome = nome;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }

    // UM FUNCIONÁRIO CALCULA SUA HORAS TOTAIS TRABALHADAS, OS MINUTOS RESTANTES DESSAS HORAS, E O MINUTOS TOTAIS.

    public long calcularHorasTrabalhadas(){

        LocalTime entrada = horarioEntrada;
        LocalTime saida = horarioSaida;

        Duration duration = Duration.between(entrada, saida);

        return duration.toHours();
    }

    public long calcularMinutosExtras(){

        LocalTime entrada = horarioEntrada;
        LocalTime saida = horarioSaida;

        Duration duration = Duration.between(entrada, saida);

        // SE HOUVER MINUTOS EXTRAS, ESSES MINUTOS ENTRAM DENTRO DO TEMPO TRABALHADO PELO FUNCIONÁRIO
        return duration.toMinutes() % 60;
    }

    public long calcularMinutosTotais(){

        LocalTime entrada = horarioEntrada;
        LocalTime saida = horarioSaida;

        Duration duration = Duration.between(entrada, saida);

        return duration.toMinutes();
    }

    static void main(String[] args){

        // ✅DESAFIO 4: RELÓGIA DE PONTO
        // UM FUNCIONÁRIO BATE O PONTO ÀS 08:15 E SAI ÀS 17:45. CALCULAR O TOTAL DE HORAS TRABALHADAS

        LocalTime entrada = LocalTime.of(8,15,0);
        LocalTime saida = LocalTime.of(17,45,0);

        // Para criar uma situação so mundo real criamos um novo funcionários que recebe um nome e um horário de entrada e saída
        Funcionario funcionario = new Funcionario("Lucas", entrada, saida);

        long horas = funcionario.calcularHorasTrabalhadas();

        long minutosExtras = funcionario.calcularMinutosExtras();

        long minutos = funcionario.calcularMinutosTotais();

        System.out.printf("Total de horas trabalhadas: %s horas e %s minutos", horas, minutosExtras);
        System.out.printf("\nTotal de minutos trabalhados: %s minutos", minutos);
    }
}
