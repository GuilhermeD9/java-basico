public class ComputadorPedrinho {
    public static void main(String[] args) {
        MsnMesseger msn = new MsnMesseger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMensager fcb = new FacebookMensager();
        System.out.println("Facebook");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        System.out.println("Telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
