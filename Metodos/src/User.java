public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("A TV está ligada? " + smartTv.isLigada());
        System.out.println("Canal Atual: " + smartTv.getCanal());
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.mudarCanal(5);
    }
}