/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Classes_Mapeamentos;

/**
 *
 * @author Guilherme
 */
public class Usuario extends Pessoa {
    
    private long codigo;
    private String senha;
    private int nivelPermissao;

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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivelPermissao
     */
    public int getNivelPermissao() {
        return nivelPermissao;
    }

    /**
     * @param nivelPermissao the nivelPermissao to set
     */
    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }
    
}
