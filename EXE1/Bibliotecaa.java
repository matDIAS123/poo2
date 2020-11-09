/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaa;

/**
 *
 * @author diasm
 */
public class Bibliotecaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Library lb = new Library();
        lb.setNome("Bradock");
        
        Livro lv = new Livro();
        lv.setISBN("43242");
        
        Autor atr = new Autor();
        atr.setNome("Joaozinho");
        
    
       lb.imprimir();
      lv.imprimir();
      atr.imprimir();
     
        
    }
    
}
