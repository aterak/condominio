/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.BANCOB2;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.validation.Valid;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import model.Contrato;
import model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author veiga
 */
@Controller
public class Controler {

    @Autowired
    PessoaRepository repo;
    
    @Autowired
    ContratoRepository contrepo;
    @Autowired
    PdfService pdf;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String form() {
        return "/index";
    }

    @GetMapping(value = "/lista")
    public ModelAndView listaPessoas() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("listapessoas", repo.findAll());

        return mv;

    }

    @GetMapping(value = "/remover")
    public String deleteById(@RequestParam Long id) {
        Pessoa pessoa = repo.findById(id).get();
        repo.delete(pessoa);
        return ("redirect:/lista");
    }
    
    
// aqui o codigo  chama a pagima criar pessoa
    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form1() {
        return "/createpessoa";
    }

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public String crearPessoa(@Valid Pessoa pessoa, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos!");
            return "redirect:/createpessoa";
        }

        repo.save(pessoa);
        
        attributes.addFlashAttribute("mensagem", "Evento cadastrado com sucesso!");
        return "redirect:/lista";
    }

//    @GetMapping(value = "/detalhe{id}")
//    public String detalheById(@RequestParam Long id, Model model) {
//        Pessoa2 pessoa = repo.findById(id).get();
//        model.addAttribute("pessoa", pessoa);
//
//        return "/detalhe";
//    }
    @GetMapping(value = "/detalhe{id}")
    public ModelAndView detalheById(@RequestParam(value = "id") Long id) {
        ModelAndView mv = new ModelAndView("/editpessoa");
        Pessoa pessoa = repo.findById(id).get();
        mv.addObject("pessoa", pessoa);
        // ainda nao esta funcionando
        //pdf.getPdf();
        return mv;
    }

    
    
    
    
    
    // aqui o codigo  chama a pagima criar pessoa
    @RequestMapping(value = "/vercontrato", method = RequestMethod.GET)
    public String paginacontrato() {
        return "/contratos";
    
    }
    
    
    
    @RequestMapping(value = "/vercontrato", method = RequestMethod.POST)
    public ModelAndView detalheById(@Valid Contrato contrato) {
        ModelAndView mv = new ModelAndView("/relatorio/pdfsemmobilia");
        
         System.out.println(""+contrato.getTextolongo());
        //Contrato contrato = new Contrato();
        if(contrato.getTextolongo().equals("sem")){
            System.out.println("o contrato e  sem mobilia");
            
        }
        if(contrato.getTextolongo().equals("mobiliado")){
            System.out.println("o contrato e com mobilia");
        }
        if(contrato.getTextolongo().equals("full")){
            System.out.println("o contrato e  full");
        }
        if (contrato.getTextolongo().equals("parcial")){
            System.out.println("o contrato e  parcial");
        } 
       // mv.addObject("id", contrato);
        // ainda nao esta funcionando
        //pdf.getPdf();
        return mv;
    }
    
  
    
      // aqui o codigo  chama a pagima contrato sem mobilia
    @RequestMapping(value = "/vercontratosemmobilia", method = RequestMethod.GET)
    public String paginacontratoSemMobilia() {
        return "/relatorio/pdfsemmobilia";
    
    }
    
    
    
    
    
    
    
//    @PostMapping("/vercontrato")
//    public String salvarDados(@ Valid Contrato textolongo) {
//        // Aqui você pode processar a string longa (dados.getTexto()) como necessário
//        System.out.println("Texto recebido: " + textolongo.getTextolongo());
//        contrepo.save(textolongo);
//        // Exemplo de redirecionamento após salvar
//        return "redirect:/contratos";
//    }
//    
    
    
    
    ///////////////////////////////////////////////////////////
    // abaixo fica codigo de dashboard
    @GetMapping("/dashboard")
    public ModelAndView dashboard() {
        ModelAndView mv = new ModelAndView("dashboard");
        mv.addObject("listapessoas", repo.findAll());
        return mv;
    }

    @RequestMapping(value = "/contratos", method = RequestMethod.GET)
    public String formcontratos() {
        return "/contratos";
    }

}
