public class BolaDeFutebol extends Bola {

    public BolaDeFutebol (String nomeDaMarca){
        super(nomeDaMarca);
        
    }
    public void lancar(){
        System.out.println(" A Bola da" +getNomeDaMarca()+ "e muito boa pra chutar");

    }
    public void quicar(){
         System.out.println(" A Bola de futebol quicam muito");

    }
}
