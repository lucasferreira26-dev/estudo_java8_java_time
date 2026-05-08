package Aula10_Nova_Api_de_Datas_labs;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Aluno {

    private String nome;
    private YearMonth anoEmesMatricula;

    public Aluno(String nome, YearMonth anoEmesMatricula) {
        this.nome = nome;
        this.anoEmesMatricula = anoEmesMatricula;
    }

    public long calcularQuantidadeSemestres (LocalDate dataAtual){

        YearMonth matriculaAnoEMes = anoEmesMatricula;

        LocalDate matriculaCompleta = matriculaAnoEMes.atDay(1);

        return ChronoUnit.MONTHS.between(matriculaCompleta, dataAtual) / 6;
    }

    static void main(String[] args){

        // ✅DESAFIO 6: SISTEMA ACADÊMICO
        // CALCULAR QUANTOS SEMESTRES UM ALUNO JÁ COMPLETOU DESDE DE SUA MATRICULA EM 2019-02 ATÉ HOJE.

        LocalDate dataAtual = LocalDate.now();

        YearMonth mesEanoMatricula = YearMonth.of(2019,2);

        Aluno aluno = new Aluno("Lucas", mesEanoMatricula);

        long semestres = aluno.calcularQuantidadeSemestres(dataAtual);

        System.out.printf("Total de semestres: %s", semestres);
    }
}
