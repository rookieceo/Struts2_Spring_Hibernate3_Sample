/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author 장인기
 */
@Entity
@Table(name="Product")
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    String pid;
    String name;
    String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
