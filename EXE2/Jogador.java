
public class Jogador {
    public String v1;
    Carta[] cartas = new Carta[9];
    int nCartas = 0;
    
    public Carta RecebeCarta(){
        nCartas ++;
        return cartas[nCartas];
    }
}
