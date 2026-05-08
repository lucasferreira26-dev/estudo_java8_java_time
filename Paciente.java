package Aula10_Nova_Api_de_Datas_labs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Paciente {

    private String nome;
    private String cpf;
    private Consulta consulta;

    public Paciente(String nome, String cpf, Consulta consulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", consulta=" + consulta +
                '}';
    }

    static void main(String[] args){

        // ✅DESAFIO 1: AGENDAMENTO DE CONSULTAS
        // UM PACIENTE SÓ PODE MARCAR CONSULTAS EM DIAS ÚLTEIS, E CADA CONSULTA DEVE SER MARCADA COM PELO MENOS 2
        // DIAS ANTECEDÊNCIA

        // PEGAR UMA DATA ATUAL E SOMAR DOIS DIAS
        LocalDate dia = LocalDate.now().plusDays(2);

        // AJUSTAR O DIA PARA O PRÓXIMO DIA ÚTIL SE CAIR NO SÁBADO OU DOMINGO
        if (dia.getDayOfWeek() == DayOfWeek.SATURDAY || dia.getDayOfWeek() == DayOfWeek.SUNDAY){
            dia = dia.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        }

        // PASSAMOS O dia PARA O OBJETO diaConsulta DA NOSSA CLASSE INTERNA CONSULTA
        Consulta diaConsulta = new Consulta(dia);

        // CRIAMOS UM NOVO PACIENTE COM NOME, CPF, E O DIA DA CONSULTA AJUSTADO
        Paciente paciente = new Paciente("Pedro", "093.982.837-23", diaConsulta);

        System.out.println(paciente);
    }
}
