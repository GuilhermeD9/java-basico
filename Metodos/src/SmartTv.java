public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 5;

    public void ligar(){
        this.ligada = true;
        System.out.println("TV LIGADA");
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Volume atual: " + getVolume());
    }

    public void diminuirrVolume(){
        this.volume--;
        System.out.println("Volume atual: " + getVolume());
    }

    public void mudarCanal(int novoCanal){
        this.setCanal(novoCanal);
        System.out.println("NOVO CANAL - Canal Atual: " + getCanal());
    }


// GETTERS E SETTERS
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
