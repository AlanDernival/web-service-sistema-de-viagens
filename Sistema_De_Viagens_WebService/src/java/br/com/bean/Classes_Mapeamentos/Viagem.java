/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Classes_Mapeamentos;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Viagem {
    
    private long codigo;
    private String origem;
    private String destino;
    private Date dataIda;
    private Date dataVolta;
    private short vooComEscala;
    private float preco;
    private String hotel;
    private String descricao;
    private String foto;
    private Venda venda;
    
    public Viagem(String origem, String destino, Date dataIda, Date dataVolta, short vooComEscala,
            float preco, String hotel, String descricao, String foto){
        this.origem = origem;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.vooComEscala = vooComEscala;
        this.preco = preco;
        this.hotel = hotel;
        this.descricao = descricao;
        this.foto = foto;
    }
    
    public Viagem(){
        
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
     * @return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the dataIda
     */
    public Date getDataIda() {
        return dataIda;
    }

    /**
     * @param dataIda the dataIda to set
     */
    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    /**
     * @return the dataVolta
     */
    public Date getDataVolta() {
        return dataVolta;
    }

    /**
     * @param dataVolta the dataVolta to set
     */
    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    /**
     * @return the vooComEscala
     */
    public short getVooComEscala() {
        return vooComEscala;
    }

    /**
     * @param vooComEscala the vooComEscala to set
     */
    public void setVooComEscala(short vooComEscala) {
        this.vooComEscala = vooComEscala;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the hotel
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
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
