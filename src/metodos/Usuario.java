package metodos;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.printf("TV Ligada ? %b%n", smartTv.ligada);
        System.out.printf("Canal atual ? %d%n", smartTv.canal);
        System.out.printf("Volume atual ? %d%n", smartTv.volume);

        smartTv.ligar();
        System.out.printf("Novo status -> TV Ligada ? %b%n", smartTv.ligada);

        smartTv.desligar();
        System.out.printf("Novo status -> TV Ligada ? %b%n", smartTv.ligada);

        smartTv.almentarVolume();
        smartTv.almentarVolume();
        smartTv.almentarVolume();
        smartTv.almentarVolume();
        smartTv.almentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.mudarCanal(35);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.printf("Canal atual ? %d%n", smartTv.canal);
    }
}
