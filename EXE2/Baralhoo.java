
import java.util.Random;

public class Baralhoo {

    private Carta[] v_carta;
    private int topo;

    public Baralhoo() {

        try {
            v_carta = new Carta[52];
            topo = 51;

            String[] nipes = {"copas", "paus", "ouros", "espadas"};

            for (int i = 0; i < 52; ++i) {
                v_carta[i] = new Carta((i % 13) + 1, nipes[i / 13]);
            }
        } catch (Exception e) {
            System.out.println("Argumento invalido");
        }
    }
    
    public String v1;
    Carta[] cartas = new Carta[9];
    int nCartas = 0;
    
    

    //distribuidor de cartas
    
    public Carta[] DistribuirCartas(){
        int i = 9;
        Carta[] retorno = new Carta[9];
        
        while(i>0){
            if(nCartas > 0 ){
                nCartas--;
                retorno[i] = cartas[nCartas+1];
                i--;
            }
        }
        return null;
    }
    
    //diz quantas cartas ainda resta
    public int cardsRemaining() {
        return topo + 1;
    }
    //retorna a carta

    public Carta getCarta() {
        Carta carta = topo >= 0 ? v_carta[topo] : null;
        --topo;
        return carta;
    }

    //embaralha
    public void embaralha() {
        Random generator = new Random();

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < 100; ++i) {
            index1 = generator.nextInt(52);
            index2 = generator.nextInt(52);
            Carta tmp = v_carta[index1];
            v_carta[index1] = v_carta[index2];
            v_carta[index2] = tmp;

        }
    }

    //reseta o baralho e embaralha
    public void reset() {
        topo = 51;
        embaralha();
    }

    @Override
    public String toString() {
        String str = "CARTAS\n";
        for (int i = 0; i < 52; ++i) {
            str = str.concat(v_carta[i] + "\n");
        }
        return str;
    }
}
