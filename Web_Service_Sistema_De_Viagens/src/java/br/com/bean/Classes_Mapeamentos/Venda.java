/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Classes_Mapeamentos;

import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class Venda {
    
    private long codigo;
    private Set<Festa> festas;
    private Set<Viagem> viagens;
    private Set<Representante> representante;
    
    public Venda(){
        
    }
    
    
    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the festas
     */
    public Set<Festa> getFestas() {
        return festas;
    }

    /**
     * @param festas the festas to set
     */
    public void setFestas(Set<Festa> festas) {
        this.festas = festas;
    }

    /**
     * @return the viagens
     */
    public Set<Viagem> getViagens() {
        return viagens;
    }

    /**
     * @param viagens the viagens to set
     */
    public void setViagens(Set<Viagem> viagens) {
        this.viagens = viagens;
    }

    /**
     * @return the representante
     */
    public Set<Representante> getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(Set<Representante> representante) {
        this.representante = representante;
    }
    
}
