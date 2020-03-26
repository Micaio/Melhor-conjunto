
package manopoly;
import java.util.Random;

public class Manopoly {

    public static void main(String[] args) {
       Random rn =new Random();
          int dado1,dado2,local=0;
          int marrom=0,azulc=0,rosa=0,laranja=0,vermelho=0,amarelo=0,verde=0,azulE=0;
          byte rep=0;
          for(int volta =0;volta<=100;volta++){
         
           dado1 = rn.nextInt(6)+1;
           dado2 =rn.nextInt(6)+1;
        
            local =local+ dado1 + dado2;
           
             if(dado1 == dado2){
                rep++;
            } if(rep==3){
                rep=0;
                local=10;
            } if(local==30){
                local=10;
            }else{
                
            }
            
            
            
            if(local>=40){
            local=local-40;
            }else{
            if((local==1) || (local==3)){
                marrom++;
            }if((local==6) || (local==8) || (local==9)){
                azulc++;
            }if((local==11) || (local==13) || (local==14) ){
                rosa++;
            }if((local==16) || (local==18) || (local==19)){
                laranja++;
            }if((local==21) || (local==23) || (local==24)){
                vermelho++;
            }if((local==26) || (local==27) || (local==29)){
                amarelo++;
            }if((local==31) || (local==32) || (local==34)){
                verde++;
            }if((local==37) || (local==39)){
                azulE++;
            }
            }
        }
        
        System.out.println(" azule:" + azulE);
        System.out.println(" verde:" + verde);
        System.out.println(" amarelo:" + amarelo);
        System.out.println(" vermelho:" + vermelho);
        System.out.println(" laranja:" + laranja);
        System.out.println(" rosa:" + rosa);
        System.out.println(" azulc:" + azulc);
        System.out.println(" marrom:" + marrom) ;
        
        
        
        
        
        
    }
    
}
