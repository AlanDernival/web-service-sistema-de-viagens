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
public class Representante extends Pessoa {
    
    private long pessoaId;
    private LocalDate dataDeAdmissao;
    private String CTPS;
    private float salario;
    private Venda venda;
    
    public Representante(){
    
    }
    
    public Representante(LocalDate dataDeAdmissao, String CTPS, float salario){
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
        this.CTPS = CTPS;
    }

    /**
     * @return the pessoaId
     */
    public long getPessoaId() {
        return pessoaId;
    }

    /**
     * @param pessoaId the pessoaId to set
     */
    public void setPessoaId(long pessoaId) {
        this.pessoaId = pessoaId;
    }

    /**
     * @return the dataDeAdmissao
     */
    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    /**
     * @param dataDeAdmissao the dataDeAdmissao to set
     */
    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    /**
     * @return the CTPS
     */
    public String getCTPS() {
        return CTPS;
    }

    /**
     * @param CTPS the CTPS to set
     */
    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the venda
     */
    public Venda getVenda() {
        return venda;
    }

    /**
     * @param venda the venda to set
     */
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
}
