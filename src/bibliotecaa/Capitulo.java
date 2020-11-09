
package bibliotecaa;

public class Capitulo {

    public Capitulo(int Number, Livro livro) {
        this.Number = Number;
        this.livro = livro;
    }

  int Number;
  Livro livro;

    
    public int getNumber() {
        return Number;
    }

    /**
     * @param Number the Number to set
     */
    public void setNumber(int Number) {
        this.Number = Number;
    }
 
    void imprimir(){
        System.out.println("capitulo: " + getNumber());
    }
}
