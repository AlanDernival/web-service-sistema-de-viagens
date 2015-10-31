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
public class Turma {
    
    private long codigo;
    private int quantidadeAlunos;
    private int serie;
    private Set<Aluno> alunos;
    private Faculdade faculdade;
    
    public Turma(){
        
    }
    
    public Turma(int quantidadedeAlunos , int serie){
        this.quantidadeAlunos = quantidadedeAlunos;
        this.serie = serie;
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
     * @return the quantidadeAlunos
     */
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    /**
     * @param quantidadeAlunos the quantidadeAlunos to set
     */
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    /**
     * @return the serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(int serie) {
        this.serie = serie;
    }

     /**
     * @return the alunos
     */
    public Set<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the faculdade
     */
    public Faculdade getFaculdade() {
        return faculdade;
    }

    /**
     * @param faculdade the faculdade to set
     */
    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
    
}
