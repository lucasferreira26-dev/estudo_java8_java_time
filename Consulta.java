package Aula10_Nova_Api_de_Datas_labs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Consulta {

    private LocalDate dia;

    public Consulta(LocalDate dia) {
        this.dia = dia;
    }


    @Override
    public String toString() {
        return "Consulta{" +
                "dia=" + dia +
                '}';
    }
}
