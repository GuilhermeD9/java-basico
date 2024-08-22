package apps;
public abstract class ServicoMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Dispositivo conectado a internet!");
    }
}
