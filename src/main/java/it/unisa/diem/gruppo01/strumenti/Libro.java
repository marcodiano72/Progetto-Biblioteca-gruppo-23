/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.gruppo01.strumenti;

/**
 *
 * @author Marco Diano'
 */
public class Libro {
    private String codiceLibro;
    private String titolo;
    private boolean disponibile;
    
    public Libro(String codiceLibro, String titolo, boolean disponibile)
    {
        this.codiceLibro=codiceLibro;
        this.titolo=titolo;
        this.disponibile=disponibile;
    }
    
    public String getCodiceLibro()
    {
        return codiceLibro;
    }
    
    public String getTitolo()
    {
        return titolo;
    }
    
    public boolean isDisponibile()
    {
        return disponibile;
    }
    
    public void setDisponibile(boolean disponibile)
    {
        this.disponibile=disponibile;
    }
    
}
