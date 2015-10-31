/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Classes_Mapeamentos;

import java.time.LocalDate;

/**
 *
 * @author Guilherme
 */
public class Pagamento {
    
    private long codigo;
    private String numeroCartao;
    private int bandeira;
    private LocalDate dataVencimento;
    private Aluno aluno;
    
    public Pagamento(){
        
    }
    
    public Pagamento(String numeroCartao, int bandeira, LocalDate dataVencimento){
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
        this.dataVencimento = dataVencimento;
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
     * @return the numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the bandeira
     */
    public int getBandeira() {
        return bandeira;
    }

    /**
     * @param bandeira the bandeira to set
     */
    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }

    /**
     * @return the dataVencimento
     */
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
