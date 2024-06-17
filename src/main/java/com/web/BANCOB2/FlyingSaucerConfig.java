/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.BANCOB2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xhtmlrenderer.pdf.ITextRenderer;
/**
 *
 * @author veiga
 */
@Configuration
public class FlyingSaucerConfig {
    
    
    @Bean
    public ITextRenderer iTextRenderer(){
    
    return new ITextRenderer();
    }
}
