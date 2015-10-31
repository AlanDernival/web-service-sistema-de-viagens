/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Utilitarios;


import br.com.bean.Classes_Mapeamentos.Aluno;
import java.text.ParseException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Classe de Testes do Hibernate , Necessario Apenas Modificar o Conteudo
 *
 * @author pro7223
 */
public class TestaHibernate {

    public static void Teste() throws ParseException {
       incluiAluno();
    }

    public static void incluiAluno() throws ParseException {
        
        System.out.println("entrou");
        Session sessao = HibernateUtility.getSession();
        Transaction transacao = sessao.beginTransaction();

        Aluno a = new Aluno("99999999", "Analise e Desenvolvimento de Sistemas", 2);
        a.setCelular("95476-9088");
        a.setCep("09991100");
        a.setCidade("Diadema");
        a.setComplemento("Teste");
        a.setCpf("44385902801");
        a.setDataNascimento(Conversores.stringtoData("27/12/1994"));
        a.setEmail("guidelmiglio@hotmail.com");
        a.setEndereco("rua tukanos n°57");
        a.setEstado("São Paulo");
        a.setNome("Guilherme Delmiglio");
        a.setRg("487395207");
        a.setTelefone("9080-9080");
     
        sessao.saveOrUpdate(a);
        
        transacao.commit();
        sessao.close();
        
    }

//    public static void incluirPessoa() {
//        Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        
//        Usuario usuario = new Usuario();
//        usuario.setNome("Marcotti");
//       //Não se atribui nada para o identificador pessoaID
//        
//        sessao.saveOrUpdate(usuario); //Gravou a pessoa
//             
//        transaction.commit();
//        sessao.close();
//    }
//
//    private static void alterarPessoa() {
//        Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        
//        //Cria uma referencia a pessoa
//        Pessoa p = null;
//        
//        //Faz a Busca
//        //new Integer(1) indica o ID 1
//        // load -> precisa ter try..catch
//        // get  -> retorna null para o objeto
//        p = (Pessoa)sessao.load(Pessoa.class, new Integer(10));
//        
//        //Verifica se achou
//        if(p == null)
//            System.out.println("Pessoa não encontrada");
//        else {
//            //vamos alterar os dados
//            p.setNome("Pedro Antonio");
//            p.setTelefone("11-99999-1122");
//            sessao.saveOrUpdate(p); //Alterou a pessoa
//            System.out.println("Pessoa alterada com sucesso!!!");
//        }
//        
//        transaction.commit();
//        sessao.close();
//    }
//
//    private static void excluirPessoa() {
//                Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        
//        //Cria uma referencia a pessoa
//        Pessoa p = null;
//        
//        //Faz a Busca
//        //new Integer(1) indica o ID 1
//        // load -> precisa ter try..catch
//        // get  -> retorna null para o objeto
//        p = (Pessoa)sessao.load(Pessoa.class, new Integer(1));
//        
//        //Verifica se achou
//        if(p == null)
//            System.out.println("Pessoa não encontrada");
//        else {
//            sessao.delete(p); //exclui a pessoa
//            System.out.println("Pessoa excluirda com sucesso!!!");
//        }
//        
//        transaction.commit();
//        sessao.close();
//    }
//
//    private static void incluirPessoaEndereco() {
//        Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        //Cria endereco e pessoa
//        Pessoa p = new Pessoa();
//        Endereco e = new Endereco();
//        
//        p.setNome("Antonio Prado");
//        p.setEmail("prado@uol.com.br");
//        p.setTelefone("11111111");
//        
//        e.setBairro("Bairro");
//        e.setCidade("SBC");
//        e.setNumero(324);
//        e.setRua("Rua Coronel");
//        
//        //faz a referencia cruzada
//        e.setPessoa(p);
//        p.setEndereco(e);
//        
//        //salva pessoa e o hb salva sozinho endereco
//        sessao.saveOrUpdate(p);
//        transaction.commit();
//        sessao.close();
//    }
//
//    private static void incluirCursoDisciplina() {
//        Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        Curso c1 = new Curso();
//        Disciplina d1 = new Disciplina();
//        Disciplina d2 = new Disciplina();
//        Disciplina d3 = new Disciplina();
//
//        c1.setNome("ADS");
//        d1.setNome("SO");
//        d1.setCurso(c1);
//        d2.setNome("Ingles");
//        d2.setCurso(c1);
//        d3.setNome("POO");
//        d3.setCurso(c1);
//        
//        c1.getDisciplinas().add(d1);
//        c1.getDisciplinas().add(d2);
//        c1.getDisciplinas().add(d3);
//        
//        sessao.saveOrUpdate(c1);
//        transaction.commit();
//        sessao.close();
//    }
//
//    private static void listarCursoDisciplina() {
//        Session sessao = HibernateUtility.getSession();
//        Transaction transaction = sessao.beginTransaction();
//        
//        Disciplina d;
//        Curso c;
//        
//        //Busca o Curso 1
//        c = (Curso)sessao.load(Curso.class, new Integer(1));
//        //Mostra memoria livre
//        System.out.println("Mem Livre: " +
//                java.lang.Runtime.getRuntime().freeMemory());
//        //navegar via Iterador
//        Iterator it = c.getDisciplinas().iterator();
//        while(it.hasNext()) {
//            d = (Disciplina)it.next();
//            System.out.println("Disciplina:" + d.getNome());
//        }
//        
//        //Navegar Via enhanced For
//        for(Object o : c.getDisciplinas()) {
//            d = (Disciplina)o;
//            System.out.println("Disciplina:" + d.getNome());
//        }
//        
//        transaction.commit();
//        sessao.close();
//    }
}