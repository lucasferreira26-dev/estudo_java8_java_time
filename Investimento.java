package Aula10_Nova_Api_de_Datas_labs;

import java.time.LocalDate;
import java.util.Arrays;

public class Investimento {

    private static LocalDate dataInicialRendimento;
    private static final int DIA_RENDIMENTO = 5;
    private static LocalDate[] DATAS = new LocalDate[12];

    public static String calcularProximasDatasRendimento(){

        dataInicialRendimento = LocalDate.now().withDayOfMonth(DIA_RENDIMENTO);

        for (int i = 0; i < DATAS.length; i++){
            DATAS[i] = dataInicialRendimento.plusMonths(i);
        }

        return Arrays.toString(DATAS);
    }

    static void main(String[] args){

        // ✅DESAFIO 7: JUROS COMPOSTOS MENSAIS
        // UM INVESTIMENTO RENDE JUROS TODO DIA 5 DE CADA MÊS. CALCULAR AS PRÓXIMAS 12 DATAS DE RENDIMENTO

        System.out.println(Investimento.calcularProximasDatasRendimento());
    }
}
