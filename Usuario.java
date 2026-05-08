package Aula10_Nova_Api_de_Datas_labs;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Usuario {

    private String nome;
    private MonthDay dataAniversario;
    private LocalDate aniversarioEsteAno;

    public Usuario(String nome, MonthDay dataAniversario, LocalDate aniversarioEsteAno) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.aniversarioEsteAno = aniversarioEsteAno;
    }

    // ENTENDEMOS QUE UM USUÁRIO SABE CALCULAR OS DIAS PARA O SEU PRÓXIMO ANIVERSÁRIO
    public long calcularDiasProximoAniversario(LocalDate hoje){

        MonthDay dataAniversarioUsuario = dataAniversario;

        LocalDate dataAniversarioPresenteAno = aniversarioEsteAno;

        // Comparar com o ano atual e ajustar para o próximo se já passou.
        LocalDate proximoAniversario =
                dataAniversarioPresenteAno.isBefore(hoje) ? dataAniversarioUsuario.atYear(hoje.getYear() + 1) :
                        dataAniversarioPresenteAno;

        // Retornar um ChronoUnit.DAYS.between para calcular a diferença.
        return ChronoUnit.DAYS.between(hoje, proximoAniversario);
    }

    static void main(String[] args){

        // ✅DESAFIO 3: SISTEMA DE ANIVERSÁRIO
        // PRECISAMOS CALCULAR QUANTOS DIA FALTAM PARA O ANIVERSÁRIO DE UM USUÁRIO

        // Pegar a data atual (LocalDate.now()).
        LocalDate hoje = LocalDate.now();

        // Criar a data do aniversário (MonthDay.of(Month, dia))
        MonthDay dataAniversario = MonthDay.of(Month.MARCH, 26);

        // Aniversário do usuário este ano
        LocalDate aniversarioEsteAno = dataAniversario.atYear(hoje.getYear());

        // PARA CRIAR UMA SITUAÇÃO MAIS PRÓXIMA DO MUNDO REAL, CRIAMOS UM NOVO USUÁRIO COM A DATA DO SEU ANIVERSÁRIO E NO PRESENTE ANO.
        Usuario usuario = new Usuario("Pedro", dataAniversario, aniversarioEsteAno);

        // O USUÁRIO CALCULA OS DIAS PARA O SEU PRÓXIMO ANIVERSÁRIO.
        System.out.println("Dias para o próximo aniversário: " + usuario.calcularDiasProximoAniversario(hoje));
    }
}
