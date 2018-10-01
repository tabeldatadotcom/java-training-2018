/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.belajar.maven;

import com.tabeldata.belajar.maven.no.di.OtherBean;
import com.tabeldata.belajar.maven.with.di.spring.DataBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author dimasm93
 */
public class BelajarApp {

    public static void main(String[] arsg) {
        System.out.println("Halo ini java maven");
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationSpring.class);

        DataBean aBean = context.getBean("withBeans2",DataBean.class);
        System.out.println(aBean.toString());
    }
}
