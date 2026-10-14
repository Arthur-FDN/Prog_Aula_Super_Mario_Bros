import java.util.Scanner;

public class SimuladoMario {
    public static void main(String[] args) {
        int fase,fase_facil, fase_dificil;
        Double hora_facil, hora_dificil,total_hora, gasto;
        Scanner escreve = new Scanner(System.in);
        System.out.println("==================================================================================================");
        System.out.println("Jogo: SUPER MARIO BROS.");
        System.out.println("==================================================================================================");
        System.out.print("Quantas fases tiveram o jogo?");
        fase=escreve.nextInt();
        System.out.print("Digite quantas fases fáceis tiveram sua jogatina:");
        fase_facil=escreve.nextInt();
        fase_dificil=fase-fase_facil;
        System.out.println("Quantidade fases difíceis:"+fase_dificil);
        hora_facil=fase_facil*1.0;
        hora_dificil=fase_dificil*2.0;
        System.out.println("Hora nas fases fáceis:"+hora_facil);
        System.out.println("Hora nas fases difíceis:"+hora_dificil);
        total_hora=hora_dificil+hora_facil;
        System.out.println("Total de horas gastas até concluir o jogo:"+total_hora);
        gasto=5*total_hora;
        System.out.println("Valor em reais da jogatina:"+gasto);
        escreve.close();

    }
}
