/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.RestControllers;


import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Guilherme
 */
@Controller
public class indexController {

    @RequestMapping("/index")
    public ModelAndView home() throws SQLException {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    @RequestMapping("testa-hibernate")
    public ModelAndView insereRegistro() throws SQLException{
        
         ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
