public class SmartTv {
    boolean tvLigada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligaTv() {
        tvLigada = true;
    }

    public void desligaTv() {
        tvLigada = false;
    }

    public void aumentaCanal() {
        ++ canal;
    }

    public void diminuiCanal() {
        canal = canal - 1;
    }

    public void selecionaCanal(int numeroCanal) {
        canal = numeroCanal;
    }

    public void aumentaVolume() {
        ++ volume;
    }

    public void diminuiVolume() {
        volume = volume - 1;
    }
}
