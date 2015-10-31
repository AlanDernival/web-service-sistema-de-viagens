/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.RestControllers;

import br.com.bean.Utilitarios.TestaHibernate;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Programador
 */

@RestController
public class indexController { 
    
    
    @RequestMapping("testa-hibernate")
    public Boolean boaTarde() {
        TestaHibernate.Teste();
        return true;
    }
    
    
    @RequestMapping("olamundo")
    public String olaMundo() {        
        return "Olá mundo";
    }    
   
    
    @RequestMapping("olamundo2")
    public String olaMundo2(String nome) {        
        return "Olá mundo " + nome;
    }      
    
    
}
