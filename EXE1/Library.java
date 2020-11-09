/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaa;

import java.util.List;

/**
 *
 * @author diasm
 */
public class Library {
    String Nome;
    List<Livro>livros;
    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    void imprimir(){
        System.out.println("nome do livro: " + getNome());
    }
}
