/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.BANCOB2;

import com.lowagie.text.Document;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import model.Pessoa;


@Service
public class PdfService {

  @Autowired
  private PessoaRepository repo;

  public Document getPdf() {
    //Pessoa pessoa = repo.findById(id).get();
    Document document = new Document();

      try {

        PdfWriter.getInstance(document, new FileOutputStream("Relatorio1.pdf"));
        document.open();
       // document.setPageSize(PageSize.A3);
 Paragraph paragrafoTeste = new Paragraph("aqui vai o contrato");

            document.add(paragrafoTeste);
      //  document.addHeader(pessoa.getNome(), "Contrato de Compra");
      // document.addAuthor("Marcelo Thomé");
       // document.addCreationDate();
      //  document.add(new Paragraph("Contrato de Venda - " + pessoa.getNome()));
//        document.add(new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
//                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Euismod elementum nisi quis eleifend" +
//                " quam adipiscing vitae proin sagittis. Pellentesque adipiscing commodo elit at imperdiet. Quis enim lobortis scelerisque fermentum dui faucibus. Leo duis ut diam quam nulla porttitor massa id. Augue neque gravida in fermentum et sollicitudin ac orci phasellus. Placerat in egestas erat imperdiet sed euismod nisi porta. Ut placerat orci nulla pellentesque dignissim enim. Ornare lectus sit amet est placerat in. Enim eu turpis egestas pretium aenean pharetra. Vestibulum sed arcu"
//                + " non odio euismod lacinia. Nunc faucibus a pellentesque sit. Fermentum iaculis eu non diam phasellus vestibulum.\n" +
//                "\n" +
//                "Fames ac turpis egestas sed tempus urna. Arcu ac tortor dignissim convallis aenean et. " +
//                "Est ultricies integer quis auctor elit. Cursus vitae congue mauris rhoncus aenean vel elit" +
//                " scelerisque. Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh. Maecenas ultricies mi eget mauris pharetra. Ornare suspendisse sed nisi lacus. Tincidunt tortor aliquam nulla facilisi cras fermentum odio. Pharetra pharetra massa massa ultricies mi quis hendrerit. Purus ut faucibus pulvinar elementum integer enim. Diam sollicitudin tempor id eu nisl nunc mi ipsum. Porta nibh venenatis cras sed felis eget velit. Justo donec enim diam vulputate. Volutpat diam ut venenatis tellus in metus. Turpis egestas integer eget aliquet nibh praesent tristique magna. Vitae congue mauris rhoncus aenean. Vitae suscipit tellus mauris a diam maecenas. Semper viverra nam libero justo laoreet sit amet cursus sit. Eget aliquet nibh praesent tristique magna sit amet purus gravida.\n" +
//                "\n" +
//                "Facilisi nullam vehicula ipsum a arcu cursus vitae. Magna fringilla urna porttitor rhoncus dolor." +
//                " Quam elementum pulvinar etiam non. Eleifend quam adipiscing vitae proin sagittis. Arcu risus quis varius quam quisque id diam vel. Maecenas volutpat blandit aliquam etiam erat velit. Porttitor rhoncus dolor purus non. Rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat. Enim sed faucibus turpis in eu mi bibendum neque egestas. A lacus vestibulum sed arcu non odio euismod. Interdum varius sit amet mattis vulputate enim nulla aliquet porttitor. Ipsum suspendisse ultrices gravida dictum fusce ut placerat orci nulla. Tortor dignissim convallis aenean et tortor at risus. Varius duis at consectetur lorem donec massa. Sollicitudin nibh sit amet commodo nulla facilisi nullam vehicula ipsum. Maecenas ultricies mi eget mauris pharetra et ultrices neque. Consequat nisl vel pretium lectus quam id. Amet risus nullam eget felis eget nunc. Mattis pellentesque id nibh tortor id aliquet lectus. Orci porta non pulvinar neque laoreet suspendisse interdum consectetur."));
//        
      }
      catch(DocumentException de) {
        System.err.println(de.getMessage());
      }
      catch(IOException ioe) {
        System.err.println(ioe.getMessage());
      }
      document.close();
      System.out.println(document.getHtmlStyleClass());
        System.out.println(document);
    return document;
  }

 // public void getPdfHtml() throws IOException, DocumentException {
   // OutputStream os = new FileOutputStream("/home/surfista/Downloads/demo/src/hello.pdf");;
//    Html2Pdf.convert("<h1 style=\"font-family: Roboto, Helvetica, sans-serif;\">Contrato de Venda</h1>" +
//                           "<p style=\"font-family:Roboto\">  sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Euismod elementum nisi quis eleifend\" +\n" +
//            "                \" quam adipiscing vitae proin sagittis. Pellentesque adipiscing commodo elit at imperdiet. Quis enim lobortis scelerisque fermentum dui faucibus. Leo duis ut diam quam nulla porttitor massa id. Augue neque gravida in fermentum et sollicitudin ac orci phasellus. Placerat in egestas erat imperdiet sed euismod nisi porta. Ut placerat orci nulla pellentesque dignissim enim. Ornare lectus sit amet est placerat in. Enim eu turpis egestas pretium aenean pharetra. Vestibulum sed arcu non odio euismod lacinia. Nunc faucibus a pellentesque sit. Fermentum iaculis eu non diam phasellus vestibulum.</p>" , os);
//   
//os.close();
  //}
}