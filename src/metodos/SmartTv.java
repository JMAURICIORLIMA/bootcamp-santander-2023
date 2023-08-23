package metodos;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void almentarVolume() {
        ++volume;
        System.out.printf("Volume %d%n", volume);
    }

    public void diminuirVolume() {
        --volume;
        System.out.printf("Volume %d%n", volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.printf("Canal %d%n", canal);
    }

    public void aumentarCanal() {
        ++canal;
        System.out.printf("Canal %d%n", canal);
    }


    public void diminuirCanal() {
        --canal;
        System.out.printf("Canal %d%n", canal);
    }

}
