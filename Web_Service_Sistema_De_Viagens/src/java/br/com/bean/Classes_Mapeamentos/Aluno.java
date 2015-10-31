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
public class Aluno extends Pessoa {

   
    private long pessoaId;
    private String numeroCarteiraFaculdade;
    private String curso;
    private int semestre;
    private Turma turma;
    private Set<Pagamento> pagamentos;
    private Set<Dependente> Dependente;
    
    public Aluno(){
        
    }
    
    public Aluno(String numeroCarteiraFaculdade, String curso, int semestre){
        this.numeroCarteiraFaculdade = numeroCarteiraFaculdade;
        this.semestre = semestre;
        this.curso = curso;
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
     * @return the numeroCarteiraFaculdade
     */
    public String getNumeroCarteiraFaculdade() {
        return numeroCarteiraFaculdade;
    }

    /**
     * @param numeroCarteiraFaculdade the numeroCarteiraFaculdade to set
     */
    public void setNumeroCarteiraFaculdade(String numeroCarteiraFaculdade) {
        this.numeroCarteiraFaculdade = numeroCarteiraFaculdade;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the turma
     */
    public Turma getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    /**
     * @return the pagamentos
     */
    public Set<Pagamento> getPagamentos() {
        return pagamentos;
    }

    /**
     * @param pagamentos the pagamentos to set
     */
    public void setPagamentos(Set<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    /**
     * @return the Dependente
     */
    public Set<Dependente> getDependente() {
        return Dependente;
    }

    /**
     * @param Dependente the Dependente to set
     */
    public void setDependente(Set<Dependente> Dependente) {
        this.Dependente = Dependente;
    }

}
