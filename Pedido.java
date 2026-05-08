package Aula10_Nova_Api_de_Datas_labs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Pedido {

    private static int count = 0;

    private int idPedido;
    private LocalDate dataDoPedido;

    public Pedido(LocalDate dataDoPedido) {
        this.idPedido = ++count;
        this.dataDoPedido = dataDoPedido;
    }

    public LocalDate calcularDataEntregaPedido(long diasUteis){

        LocalDate dataRealizacaoPedido = dataDoPedido;

        LocalDate dataEntrega = dataRealizacaoPedido.plusDays(diasUteis);

        return dataEntrega.getDayOfWeek() == DayOfWeek.SATURDAY || dataEntrega.getDayOfWeek() == DayOfWeek.SUNDAY ?
                dataEntrega.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)) : dataEntrega;
    }

    static void main(String[] args){

        // ✅DESAFIO 5: ENTREGA DE ENCOMENDA
        // UMA ENCOMENDA LEVA 5 DIAS ÚTEIS PARA SER ENTREGUE. QUAL SERÁ A DATA PREVISTA DA ENTREGA?

        LocalDate dataPedido = LocalDate.of(2026,5,5);

        Pedido pedido = new Pedido(dataPedido);

        LocalDate dataEntregaDoPedido = pedido.calcularDataEntregaPedido(5);

        System.out.println("Dia de Entrega do pedido: " + dataEntregaDoPedido);
    }
}
