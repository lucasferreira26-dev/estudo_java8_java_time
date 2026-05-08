package Aula10_Nova_Api_de_Datas_labs;

import java.time.*;

public class Live {

    private LocalDateTime dataEhoraLive;

    public Live(LocalDateTime dataEhoraLive) {
        this.dataEhoraLive = dataEhoraLive;
    }

    public ZonedDateTime converterZonaLive(String zoneInicial, String zoneFinal){

        LocalDateTime liveDataEhora = dataEhoraLive;

        ZonedDateTime zoneInicialLive = liveDataEhora.atZone(ZoneId.of(zoneInicial));

        // USAR withZoneSameInstante NÃO PARA MUDAR O INSTANTE DA LIVE, MAS PARA MOSTRAR EM QUE MOMENTO
        // A LIVE ESTÁ ACONTECENDO EM OUTRAS PARTE DO MUNDO
        return zoneInicialLive.withZoneSameInstant(ZoneId.of(zoneFinal));

    }

    static void main(String[] args){

        // ✅DESAFIO 8: EVENTO COM FUSOS DIFERENTES
        // UMA LIVE COMEÇA ÀS 20h EM SÃO PAULO. QUAL SERÁ O HORÁRIO EM NOVA YORK?

        // DEFININDO DATA E HORÁRIO DA LIVE
        LocalDate dataLive = LocalDate.now();
        LocalTime horarioLive = LocalTime.of(20,0);

        // CONVERTENDO PARA UM LOCALDATETIME
        LocalDateTime dataEhorarioLive = dataLive.atTime(horarioLive);

        // CRIANDO UMA NOVA LIVE PARA SIMBOLIZAR UM OBJETO DO MUNDO REAL
        Live live = new Live(dataEhorarioLive);

        // FAZEND0 A CONVERSÃO DE FUSOS POR MEIO DO MÉTODO PRESENTE NA CLASSE LIVE
        ZonedDateTime liveDataEHorarioNovaYork =
                live.converterZonaLive("America/Sao_Paulo", "America/New_York");

        System.out.println(liveDataEHorarioNovaYork);
    }
}
