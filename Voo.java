package Aula10_Nova_Api_de_Datas_labs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Voo {

    private LocalDateTime dataEhoraVoo;
    private ZonedDateTime saidaVoo;

    public Voo(LocalDateTime dataEhoraVoo, ZonedDateTime saidaVoo) {
        this.dataEhoraVoo = dataEhoraVoo;
        this.saidaVoo = saidaVoo;
    }

    // O MÉTODO conversaoDeZona vai o responsável de fazer a conversao de zona do voo que criarmos
    public ZonedDateTime converterZona(long totalHorasVoo, String idZone){

        ZonedDateTime vooDeSaida = saidaVoo;

        return vooDeSaida.plusHours(totalHorasVoo).withZoneSameInstant(ZoneId.of(idZone));

    }

    static void main(String[] args){

        // ✅DESAFIO 2: CONTROLE DE VOOS INTERNACIONAIS
        // UM VOO SAI DE FORTALEZA ÀS 22H E CHEGA EM LISBOA APÓS 7H DE VIAGEM. QUAL SERÁ O HORÁRIO LOCAL DE CHEGADA?

        LocalDateTime dataEhoraDoVoo = LocalDate.now().atTime(22,00,00);

        // CRIAR UM ZONEDATETIME COM ZONEID.OF("AMERICA/FORTALEZA");
        ZonedDateTime timeZoneDoVoo = dataEhoraDoVoo.atZone(ZoneId.of("America/Fortaleza"));

        // CRIANDO UM NOVO VOO COM AS DATAS E HORA QUE JÁ DEFINIMOS PARA TRAZER UM CONTEXTO DO MUNDO REAL
        Voo voo = new Voo(dataEhoraDoVoo, timeZoneDoVoo);

        // SOMAR A DURAÇÃO DOS VOO E CONVERTER PARA O FUSO DE LISBOA: withZoneSameInstant(ZoneId.of("Europe/Lisbon")
        System.out.println(voo.converterZona(7, "Europe/Lisbon"));
    }

}
