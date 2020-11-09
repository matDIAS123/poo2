
package bibliotecaa;

public class Livro {

     private String ISBN;
     Autor autor;
     Library library;
     

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    

    void imprimir(){
        System.out.println("ISBN do livro: " + getISBN());
    }
 
}
