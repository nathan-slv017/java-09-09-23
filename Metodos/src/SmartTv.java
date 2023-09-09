public class SmartTv {
   
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarDeCanal(int canalDesejado){
        if(ligada)canal = canalDesejado;
    }

    public void aumentarVolume(){
        if(ligada)volume++;
    }

    public void diminuirVolume(){
        if(ligada)volume--;
    }

     public void power(){
        ligada = !ligada;
    }

     public void status(){
        if(ligada) System.out.println("Smart TV Ligada com o volume em " + volume + " e canal " + canal);
        else System.out.println("Smart Tv Desligada: Ligue a TV");
    }
}
