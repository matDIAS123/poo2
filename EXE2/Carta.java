
public class Carta {

    private int v_carta;
    private String v_nipe;

    public Carta(int valor, String nipe) {
        
     try{
         
        //testa se esta dentro dos valores do baralho
        if (valor < 1 || valor > 13) {
            v_carta = 0;
            v_nipe = "nulo";
        } //compara 
        else if (nipe == "copas" || nipe == "paus" || nipe == "ouros" || nipe == "espadas") {
            v_carta = valor;
            v_nipe = nipe;
        } else {
            v_carta = 0;
            v_nipe = "nulo";
        }
     }catch (Exception e){
         System.out.println("Argumento nao informado");
     }
    }

   
    public int getV_carta() {
        return v_carta;
    }

    public String getV_nipe() {
        return v_nipe;
    }

     
    @Override
    public String toString() {
        String[] names = {"nada", "as", "2", "3", "4", "5", "6", "7", "8", "9", "10", "valete", "dama", "rei"};
        return names[v_carta] + " de " + v_nipe;
    }

}
