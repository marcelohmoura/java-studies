public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligaTv();
        System.out.println("TV Ligada: " + smartTv.tvLigada);

        smartTv.desligaTv();
        System.out.println("TV Ligada: " + smartTv.tvLigada);

        smartTv.aumentaCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.diminuiCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.selecionaCanal(31);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.aumentaVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuiVolume();
        System.out.println("Volume: " + smartTv.volume);
    }
}
