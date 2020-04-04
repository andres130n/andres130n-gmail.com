/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mad.ejecutables;

import com.mad.conexion.posgret;

/**
 *
 * @author aleon
 */
public class pruebas_bd {
    public static void main(String[] args) {
        posgret javaPostgreSQLBasic = new posgret();
        javaPostgreSQLBasic.connectDatabase(); 
    }
}
