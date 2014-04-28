/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenproject1.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author guilherme
 */
@ManagedBean
@SessionScoped
public class Bean {
    
    private String prop;

    public String getProp() {
        setProp("akjshdaj");
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
    
    
    
}
