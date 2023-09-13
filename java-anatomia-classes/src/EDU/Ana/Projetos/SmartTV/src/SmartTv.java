public class SmartTv {
    boolean ligada =false;
    int canal=1;
    int volume=25;

    public void mudarcanal(int novoCanal){
        canal= novoCanal;
        
    }
    public void subirCanal(){
          //canal = canal +1 
        canal++;
    }
    public void descerCanal(){
          //canal = canal -1 
        canal--;
    }


    public void aumentarVolume(){
        //volume = volume +1
        volume++;
    }
    public void diminuirVolume(){
        //volume = volume -1
        volume--;
    }

    public void ligar(){
        ligada=true;
    }
   public void desligar(){
        ligada=false;
}
}