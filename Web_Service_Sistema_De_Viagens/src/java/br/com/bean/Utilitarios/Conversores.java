/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bean.Utilitarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Guilherme
 */
public class Conversores {

    public static LocalDate stringtoData(String data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formato);
    }

    public static String datatoString(LocalDate data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formato);
    }

}
