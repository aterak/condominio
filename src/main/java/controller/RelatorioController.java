/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xhtmlrenderer.pdf.ITextRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.xhtmlrenderer.pdf.ITextRenderer;

//import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author veiga
 */
@Controller
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private ITextRenderer renderer;

    @GetMapping("/pdfsemmobilia")
    public void gerarRelatorioPDFSemMobiia(HttpServletResponse response) throws IOException {
        Map<String, Object> model = new HashMap<>();
        model.put("titulo", "Contrato Sem Mobilia");
        model.put("conteudo", "<center>Contrato De Prestação de Servicos de Aluguel de Imovel Residencial</center>"
                + "<p>Os Signatários do presente instrumento, de um lado como Locador:Condomínio AGIEV,"
                + " situado à Rua Acerolas 96, Ilha dos Bentos, Vila Velha - ES, CEP 29104351. "
                + "Representado por:"
               + "    <tr>\n"
                + "        <td>CNPJ</td>\n"
                + "        <td> CNPJ 50.441.879/0001-85(Amanda Armini)</td>\n"
                + "    </tr>\n"
                + ""
                + "  e de outro lado como Locatários:.</p>"
                + "<p> <table border=\"1\">\n"
                + "    <tr>\n"
                + "        <td>Nome</td>\n"
                + "        <td> NOME</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>TEL: </td>\n"
                + "        <td> TELEFONE</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>ID: </td>\n"
                + "        <td>IDENTIDADE</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>CPF: </td>\n"
                + "        <td>CPF</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Data Nasc.: </td>\n"
                + "        <td>NASCIMENTO</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Email: </td>\n"
                + "        <td>EMAIL</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Nascionalidade: </td>\n"
                + "        <td>NASCIONALIDADE</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Profissao: </td>\n"
                + "        <td>PROFISSAO</td>\n"
                + "    </tr>\n"
                + "<tr><td>FILIACAO: </td>\n"
                + "        <td>FILIACAO</td>"
                + "    </tr>\n"
                + "<tr><td>REF. PESSOAL: </td>\n"
                + "        <td>CONTATO</td>\n"
                + "    </tr>\n"
                + "<tr><td>Ref. Bancaria: </td>\n"
                + "        <td>Banco</td>\n"
                + "    </tr>\n"
                + "<tr><td>ENDERECO ATUAL: </td>\n"
                + "        <td>ENDERECO</td>\n"
                + "    </tr>\n"
                + "</table> </p>"
                
                
                
                + "<tr><td> CLÁUSULA 02ª – Do Aluguel</td></tr>\n"
                + "<tr><td> a)O aluguel mensal será de R$ 1070 (Hum mil e setenta reais), estando já incluído neste valor o rateio das despesas de condomínio e taxa de administração.O LOCATÁRIO(A) terá  desconto de R$ 100,00 (CEM REAIS) como forma de bônus pontualidade, pagando o aluguel até a data do vencimento. O atraso no pagamento resultará na perda do desconto de R$ 100,00 (CEM REAIS) mais multa de 10% (DEZ POR CENTO) e juros de 1% (UM POR CENTO) ao mês.</td></tr>\n"
                + "<tr><td> b) Será cobrado 13 reais de cada mês referente ao valor do IPTU até ao término deste contrato no qual deverá ser pago juntamente com o valor do aluguel.</td></tr>\n"
                + "<tr><td> c) Este valor não inclui o consumo de água e energia, o qual  deverá ser pago todo dia 20 de cada mês . </td></tr>\n"
                + "<tr><td> d) As medições de água e energia serão realizadas por representante do condomínio e informado ao locatário(equipamentos de uso próprio do Condomínio.</td></tr>\n"
                + "<tr><td> *Caso haja aumento de energia e ou água por parte da concessionária os valores serão repassados para o inquilino.</td></tr>\n"
                + "<tr><td> Os cálculos serão da seguinte forma:</td></tr>\n"
                + "<tr><td> Água: Será acrescido os valores referentes ao consumo m³ + Impostos</td></tr>\n"
                + "<tr><td> Energia: Será acrescido os valores referentes ao consumo KW + Impostos.</td></tr>\n"
                + "<tr><td> e) Taxa  Pintura: 250 Reais, Pago na hora da assinatura do contrato (não será devolvido).</td></tr>\n"
                + "<tr><td> f) Depósito de Seguro:1000 Reais, Pago na hora da assinatura do contrato, Não podendo usar como pagamento. A mesma será devolvida após inspeção de saída. Caso haja alguma despesa será descontado deste valor.</td></tr>\n"
                + "<tr><td> g) É expressamente vedada a permanência de mais de 2 (duas) pessoas no imóvel, sob pena de multa equivalente a 30% do aluguel vigente por pessoa excedente por semana. </td></tr>\n"
                + "<tr><td> h) O atraso do aluguel em 15 dias rescindirá automaticamente este contrato devendo o locatário retirar-se automaticamente. Após receberá um aviso de cobrança (Administrativa) pela administração do condomínio e seu nome será incluído no Serviço de Proteção ao Crédito (SPC).</td></tr>\n"
                + "<tr><td> OBS: Após 30 dias da data do vencimento, a administração do condomínio procederá com a cobrança judicial do condômino que tiver em atraso com seu aluguel, sendo que em tal caso, ficam acrescidas da respectiva dívida, os honorários advocatícios, custas e despesas processuais, etc.</td></tr>\n"
                + "<tr><td> </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 03ª - Do Prazo </td></tr>\n"
                + "<tr><td> a) O presente contrato tem início no dia 18/05/2024, término independente de qualquer formalidade no dia 18/05/2025.(Com data de pagamento todo dia 7 de cada mês)</td></tr>\n"
                + "<tr><td> b) Na hipótese do LOCATÁRIO desocupar o imóvel antes do prazo previsto, ficará sujeito à multa de 03 (três) meses do valor do aluguel prevista neste contrato.</td></tr>\n"
                + "<tr><td> c) A renovação do presente contrato se dará somente após a manifestação inequívoca do(a) LOCATÁRIO(A), e por expresso consentimento do(a) LOCADOR(A), antes de expirada a sua vigência, desde que o LOCATÁRIO(A) esteja de acordo com o valor de aluguel proposto para o novo período pelo(a) LOCADOR(A).	</td></tr>\n"
                + "<tr><td> d) O(A) LOCATÁRIO(A) se obriga a comunicar por escrito e com antecedência de 30 (trinta) dias a rescisão da locação, ficando responsáveis pelo pagamento da multa estabelecida na cláusula bª. Finda a locação, o(a) LOCATÁRIO*(A) se obriga a devolver ao(à) LOCADOR(A), o imóvel ora locado, da mesma forma em que recebeu, sendo a aceitação e entrega das chaves pelo(a) LOCATÁRIO(A) ao(à) LOCADOR(A) dependerá de prévia vistoria no imóvel locado, por parte do(a) LOCADOR(A) ou seu representante, quando então, será fornecido ao(à) LOCATÁRIO(A) recibo das chaves e descrição das condições do imóvel.</td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 04ª – Da Manutenção do Imóvel </td></tr>\n"
                + "<tr><td> a) O(A) LOCATÁRIO(A), salvo as obras que importem na segurança do imóvel, obriga-se por todas as demais, devendo trazer o imóvel locado em boas condições de higiene e limpeza, com os aparelhos sanitários e de iluminação, pinturas e telhados, vidraças, fechos, torneiras, pias, banheiros, ralos e demais acessórios em perfeito estado de conservação e funcionamento, para assim o restituir, quando findo ou rescindido este contrato, sem direito a reembolso, ressarcimentos, retenção ou indenização por quaisquer benfeitorias, ainda que, necessárias, úteis ou voluptuárias, as quais ficarão desde logo incorporadas ao imóvel. </td></tr>\n"
                + "<tr><td> § 1º - O locatário fica rigorosamente impedido de armazenar ou utilizar no interior do imóvel ou nas áreas comuns, substâncias químicas, tóxicas, entorpecentes, alucinógenas ou psicoativas de uso proibido por lei (LEI Nº 11.343) vigente em território nacional. E equipamentos ou materiais com perigo potencial, ou ainda,  corrosivos, explosivos ou inflamáveis, de modo que possa expor a riscos a saúde, segurança e tranquilidade dos demais condôminos, ou ainda, acarretar o aumento das taxas de seguro de condôminos ou do condomínio em caso de flagrante de irregularidade fica o contrato automaticamente rescindido, com desocupação imediata. O locatário será denunciado à autoridade competente.  </td></tr>\n"
                + "<tr><td> b) O(A) LOCATÁRIO(A) também não poderá sublocar nem emprestar o imóvel, no todo ou em parte, SEM A AUTORIZAÇÃO EXPRESSA DO(A) LOCADOR(A), SOB PENA DE INCIDIR EM INFRAÇÃO CONTRATUAL, COM IMPOSIÇÃO DA CLÁUSULA PENAL PREVISTA E RESCISÃO DE PLENO DIREITO DO CONTRATO, devendo, no caso de ser dado o consentimento, providenciar a devida comunicação junto aos ocupantes, a fim de que o imóvel esteja desimpedido no termo do presente contrato.  </td></tr>\n"
                + "<tr><td> c) No caso de desapropriação do imóvel locado, ficará o(a) LOCADOR(A) desobrigado por todas as cláusulas deste contrato. </td></tr>\n"
                + "<tr><td> d) Obriga mais o(a) LOCATÁRIO(A) a satisfazer a todas as exigências dos poderes públicos a que der causa e a não transferir este contrato, nem fazer modificações ou transformações no imóvel, SEM A AUTORIZAÇÃO EXPRESSA DO(A) LOCADOR(A), sob pena de incidir em infração contratual e rescisão automática. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 05ª – Da Vistoria do Imóvel </td></tr>\n"
                + "<tr><td> a) O(A) LOCATÁRIO(A) desde já faculta ao(à) LOCADOR(A), examinar ou vistoriar o imóvel locado, sempre que o(a) segundo(a) entender conveniente, a fim de fiscalizar a fiel execução deste contrato. Se for constatada alguma irregularidade no imóvel, que possa comprometê-lo no entendimento do(a) LOCADOR(A), este(a) se reserva no direito de providenciar a devida manutenção sem necessidade de aviso ou notificação, pois, a demora no reparo seria prejudicial ao imóvel. O custo de mão-de-obra, somado ao dos materiais utilizados para a manutenção será pago pelo(a) LOCATÁRIO(A) junto com o próximo pagamento do aluguel subsequente ao serviço prestado (sempre com a apresentação das notas ou recibos referentes a tais serviços, pelo(a) LOCADOR(A) ou seu representante). </td></tr>\n"
                + "<tr><td> b) No caso do(a) LOCADOR(A) desejar vender ou alugar o imóvel o(a) LOCATÁRIO(A) desde já permite a visita de pessoas interessadas, em dia e horário pré-estabelecido entre as partes. Renuncia o(a) LOCATÁRIO(A) do direito de preferência na compra do imóvel locado. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 06ª - Dos Pagamentos </td></tr>\n"
                + "<tr><td> O não cumprimento pelo(a) LOCATÁRIO(A) das condições aqui estabelecidas será considerada falta grave, suscetível de rescisão contratual, além do que, ficará o(a) mesmo(a) responsável por todas as despesas, multas, ressarcimento de vantagens pecuniárias e fiscais que teria direito o(a) LOCADOR(A) e ou todos outros fatos, originários por culpa do(a) LOCATÁRIO(A). </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 07ª – Do Estado Atual do Imóvel e Seu Uso </td></tr>\n"
                + "<tr><td> a) O imóvel objeto desta locação foi vistoriado pelo(a) LOCATÁRIO(A) que confessa encontrá-lo em ordem e condição de uso, no que diz respeito à pintura e ao acabamento, quanto aos aparelhos e instalações gerais de elétrica e rede de esgoto, hidráulica, tudo em funcionamento, sem qualquer defeito ou dano. </td></tr>\n"
                + "<tr><td> b) Deverá o(a) LOCATÁRIO(A) no prazo de 30 (trinta) dias a contar da assinatura do presente contrato, comunicar por escrito ao(à) LOCADOR(A) qualquer defeito ou avaria existente no imóvel. O(A) LOCATÁRIO(A) dará ciência imediata ao(à) LOCADOR(A) de todo e qualquer dano ocorrido no imóvel, que implique em consertos em sua estrutura, tais como: rachaduras, destelhamentos, vazamentos, enchentes, incêndios, infiltrações, etc. </td></tr>\n"
                + "<tr><td> c) Finda a locação o(a) LOCATÁRIO(A) se compromete a devolver o imóvel nas condições em que o recebeu, independentemente de qualquer aviso ou notificação. Tal aferição será procedida na “vistoria final”, e o recebimento das chaves em caráter definitivo se dará neste momento, não sendo permitida a permanência do LOCATÁRIO(A) no imóvel após a vistoria. </td></tr>\n"
                + "<tr><td> d) O Pátio da propriedade, poderá ser usado como acomodação de moto e bicicleta e similares (Sendo proibido a qualquer instante e horário o acionamento do motor destes na área interna do condomínio). O Locador não se responsabilizará por danos  ou atos causados por batidas, furtos, intempéries ou prejuízos materiais de qualquer natureza a estes itens ficando proibida a entrada de bicicleta ou moto de visitantes e prestadores de serviço;  </td></tr>\n"
                + "<tr><td> e) O inquilino poderá utilizar a caixa de correio desde que assuma inteira responsabilidade por suas correspondências. Deve estar ciente de que não dispomos de nenhum funcionário que possa supervisionar ou receber contas, cartas, pacotes ou qualquer tipo de encomenda. </td></tr>\n"
                + "<tr><td> f) O condomínio dispõe de câmeras de segurança nas áreas comuns as quais estão ligadas 24 horas e 7 dias por semana e as imagens são de uso exclusivo do condomínio. Sendo liberadas somente em pedido judicial. </td></tr>\n"
                + "<tr><td> g) Após a assinatura do contrato o Locatário receberá 1 chave da Porta de entrada, 1 chave da porta do banheiro, 1 chave da porta dos fundos (unidades de baixo), 1 Tag de acesso ao Portão principal(as quais serão devolvidas no término deste contrato).	 </td></tr>\n"
                + "<tr><td>*(Qualquer troca de miolo de fechadura deverá ter autorização por parte do síndico).		OBS: O portão principal será monitorado todas as vezes que a fechadura for acionada. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 08ª – Da Conservação do Imóvel  </td></tr>\n"
                + "<tr><td> a) Todas as obras necessárias à conservação do imóvel ora locado, bem como todos os reparos por qualquer dano causado, deverão ser feitos imediatamente às expensas do(a) LOCATÁRIO(A) de forma que, reparados os danos, permaneça o imóvel objeto deste, nas condições em que foi recebido. Esses reparos deverão ser feitos empregando-se na parte danificada, material da mesma qualidade anteriormente existente.	 </td></tr>\n"
                + "<tr><td> b) Qualquer anormalidade que por ventura venha a surgir no imóvel, por vício oculto ou força maior, no que se refere a solidez de sua construção ou de uso de suas partes componentes, deverá ser imediatamente comunicada por escrito ao(à) LOCADOR(A), que se responsabilizará em proceder às obras necessárias, podendo de comum acordo entre as partes, ser abatido do valor do aluguel, caso o reparo corra por conta do(a) LOCATÁRIO(A), ou ser pago diretamente ao(à) LOCADOR(A). </td></tr>\n"
                + "<tr><td> c) Quaisquer avarias ou estragos ocasionados ao imóvel e suas instalações, bem como despesas a que o(a) LOCADOR(A) for obrigado(a) por eventuais modificações feitas no imóvel, pelo(a) LOCATÁRIO(A) não ficam compreendidas na multa contratual, e serão pagas sempre à parte. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 9ª – DAS MULTAS </td></tr>\n"
                + "<tr><td> a) Fica estipulada a multa contratual de 03 (três) aluguéis, não calculados os descontos, se existirem, vigentes na época do evento, na qual incorrerá a parte que infringir qualquer cláusula deste contrato, reservada à parte inocente a faculdade de considerar simultaneamente rescindida a locação, independentemente, de qualquer formalidade. A multa será sempre paga integralmente, seja qual for o tempo decorrido do presente contrato. </td></tr>\n"
                + "<tr><td> b) O(A) LOCATÁRIO(A) fica desobrigado(a) do pagamento da multa por decorrência de casos fortuitos ou força maior, de reparos urgentes para manutenção da perfeita condição de habitação do imóvel ou ainda em virtude de outras previsões da legislação em vigor, especialmente ao parágrafo único do art. 4º e parágrafo único do art. 26º, ambos da Lei 8.245/91. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 10ª - DOS DIREITOS E  DEVERES DOS CONDÔMINOS </td></tr>\n"
                + "<tr><td> a) Informar imediatamente ao síndico, a incidência de doença infectocontagiosa nas pessoas residentes em sua unidade autônoma: </td></tr>\n"
                + "<tr><td> b) Observar no âmbito do condomínio, os mais rigorosos comportamentos de moralidade, decência e respeito ao próximo, responsabilizando-se ainda, pelos atos daqueles a quem permitir o ingresso no imóvel objeto desta locação, sob pena de multa contratual.  </td></tr>\n"
                + "<tr><td> c) Será permitida a entrada de visitantes após a devida identificação e mediante autorização do síndico. </td></tr>\n"
                + "<tr><td> d) Ressarcir os prejuízos causados por si próprio, dependentes, ou visitantes, as coisas comuns do condomínio, seus condôminos ou a terceiros, em áreas do condomínio, provocados pelo mau uso ou descuido na conservação, manutenção ou condução de veículos, ou ainda, de qualquer outro equipamento, material ou acessório de suas respectivas propriedades ou posses.  </td></tr>\n"
                + "<tr><td> e) Manter livre os pavimentos, passeios, entradas, garagens, áreas de circulação, escadas, hall e outras dependências comuns, de qualquer objeto ou veículo. </td></tr>\n"
                + "<tr><td> f) Observar o horário de silêncio das 22h às 08h. </td></tr>\n"
                + "<tr><td> g) 0 lixo dos apartamentos e outras varreduras deverão estar acondicionados em sacolas plásticas, e colocados diretamente na área externa, pelo próprio morador podendo ser disponibilizado para recolhimento da prefeitura nos dias pré estabelecidos  </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 11ª DAS PROIBIÇÕES </td></tr>\n"
                + "<tr><td> a) É proibida o uso de patins, bicicleta, skates e semelhantes ou Jogar bola na área comum, bem coma remover plantas ou arrancá-las; </td></tr>\n"
                + "<tr><td> b) Depositar objetos de qualquer natureza nas áreas de uso comum; </td></tr>\n"
                + "<tr><td> c) Estender, pendurar, depositar, bater ou secar tapetes, roupas,bandeiras, lençóis, vasos e utensílios em janelas e sacadas, halls\" e corredores de circulação, instalação de toldos, cortinas ou varais na parte externa; colocar ou afixar cartazes, inscrições, letreiros,\" avisos, anúncios de qualquer natureza nas quais tambem nao poderao ser instalados varais, antenas ou acessórios externos a área interna do apartamento, ou seja, na parte externa da parede limite de sua unidade. </td></tr>\n"
                + "<tr><td> d) É proibido regar plantas ou lavar as janelas, a fim de que não caia água nas janelas das unidades situadas abaixo; </td></tr>\n"
                + "<tr><td> e) É proibido sobrecarregar a estrutura e lajes do edifício com peso superior a 150 kg/ m 2, ou ainda as instalações elétricas, hidráulicas, de intercomunicação e sinal de televisão de sua unidade autônoma, com uso indevido de equipamentos não dimensionados no projeto, de maneira que possa comprometer a segurança ou o perfeito funcionamento das coisas, utilidades ou serviços comuns. </td></tr>\n"
                + "<tr><td> f)  É proibido Depositar nas bacias sanitárias, pias e ralos, objetos que possam 	congestionar os encanamentos, jogar cigarros,charutos, papel absorvente, preservativo e outros objetos pelas janelas ou sacadas, ou ainda, no piso das dependências comuns e fumar na área comum; Jogar pontas de cigarros e objetos de qualquer natureza pelas janelas, e nas áreas de circulação do condomínio; </td></tr>\n"
                + "<tr><td> g) É proibido realizar a lavagem e conserto de veículos e  bicicletas ou similares  em quaisquer das áreas do condomínio, 	 </td></tr>\n"
                + "<tr><td> H) É proibido o trânsito de prestadores de serviço e ou pessoas estranhas à Administração e nas áreas comuns, exceto quando acompanhados do morador; </td></tr>\n"
                + "<tr><td> I) Fica terminantemente proibido o uso de cigarros e bebidas alcoólicas ou drogas nas áreas comuns do condomínio.   </td></tr>\n"
                + "<tr><td> J) É expressamente vedada a permanência de animais de estimação (mesmo que de pequeno porte) no imóvel ou área comum do condomínio.  </td></tr>\n"
                + "<tr><td> l) É extremamente proibida a circulação nas áreas comuns do condomínio com trajes de banho ou sem camisa.	 </td></tr>\n"
                + "<tr><td> m) Os condôminos são diretamente responsáveis por todos os atos praticados por seus dependentes, empregados, ou ocupantes a qualquer título de seus apartamentos. </td></tr>\n"
                + "<tr><td> n)  É proibido usar máquina de lavar no período de 21:00hs até as 8:00hs. </td></tr>\n"
                + "<tr><td> O) O Condomínio, em hipótese alguma, responsabilizar-se-á por furtos, roubos ou danos ocorridos nas unidades  ou no interior do Condomínio. 	 </td></tr>\n"
                + "<tr><td> P) E proibido provocar qualquer espécie de ruído e ou fumaca que possa perturbar o sossego dos demais condôminos. </td></tr>\n"
                + "<tr><td> Q) O morador que não cumprir o determinado acima será aplicada multa equivalente 30% sobre o valor da taxa do aluguel vigente no mês. Caso haja descumprimentos das regras acima o contrato poderá ser rescindido de imediato. </td></tr>\n"
                + "<p></p>"
                + "<tr><td> CLÁUSULA 12ª DA ASSINATURA </td></tr>\n"
                + "<tr><td> a)O LOCATÁRIO receberá uma via deste contrato, não podendo alegar a sua ignorância.  </td></tr>\n"
                + "<tr><td>b) Fica eleito o Foro da Comarca do município de Vila Velha no Estado do Espírito Santo, com renúncia de quaisquer outros, por mais especiais que sejam para qualquer ação ou procedimento decorrente da aplicação dos dispositivos deste Contrato.    </td></tr>\n"
                + "<p> <table border=\"1\">\n"
                + "    <tr>\n"
                + "        <td>Locatario:</td>\n"
                + "        <td>NOME</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Testemunha:</td>\n"
                + "        <td>TESTEMUNHA</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Locador:</td>\n"
                + "        <td>LOCADOR</td>\n"
                + "    </tr>\n"
                + "    <center> <tr>\n"
                + "       <td>DATA: </td>\n"
                + "    </tr></center>\n"
                + "</table> </p>"
                + "");

        String html = "<html><head><title>" + model.get("titulo") + "</title></head><body>"
                + model.get("conteudo")
                + "</body></html>";

        // Converte HTML para PDF
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        renderer.setDocumentFromString(html);
        renderer.layout();
        renderer.createPDF(outputStream);

        // Define a resposta HTTP para o navegador
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=relatorio.pdf");
        response.setContentLength(outputStream.size());

        // Escreve o PDF para o response do servlet
        response.getOutputStream().write(outputStream.toByteArray());
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }

    @GetMapping("/mobiliado")
    public void gerarRelatorioPDFMobiliado(HttpServletResponse response) throws IOException {
        Map<String, Object> model = new HashMap<>();
        model.put("titulo", "Contrato Sem Mobilia");
        model.put("conteudo", "Contrato De Prestação de Servicos de Aluguel de Imovel Residencial"
                + "<p>Os Signatários do presente instrumento, de um lado como Locador:Condomínio AGIEV,"
                + " situado à Rua Acerolas 96, Ilha dos Bentos, Vila Velha - ES, CEP 29104351. "
                + "Representado pelo CNPJ 50.441.879/0001-85(Amanda Armini) e de outro lado como Locatários:.</p>"
                + "<p> <table border=\"1\">\n"
                + "    <tr>\n"
                + "        <td>Jardel Nogueira</td>\n"
                + "        <td>Cpf: 156.779.967-18</td>\n"
                + "        <td>Profissão</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Identidade: 3333967- ES</td>\n"
                + "        <td>Data nasc: 16 de 11 de 1996</td>\n"
                + "        <td>Tel: +55 27 997287672</td>\n"
                + "    </tr>\n"
                + "    <tr>\n"
                + "        <td>Profissão: Empregado empresa privada UVV</td>\n"
                + "        <td>Filiação: Hildo alves nogueira e Delza silva nogueira</td>\n"
                + "        <td>Designer ruas das ostras numero 33</td>\n"
                + "    </tr>\n"
                + "<tr><td>Ref. Bancaria: Banco: Santander</td></tr>\n"
                + "<tr><td>Ref. Bancaria: Banco: Santander</td></tr>\n"
                + "<tr><td>Ref. Bancaria: Banco: Santander</td></tr>\n"
                + "<tr><td>Ref. Bancaria: Banco: Santander</td></tr>\n"
                + "</table> </p>");

        String html = "<html><head><title>" + model.get("titulo") + "</title></head><body>"
                + model.get("conteudo")
                + "</body></html>";

        // Converte HTML para PDF
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        renderer.setDocumentFromString(html);
        renderer.layout();
        renderer.createPDF(outputStream);

        // Define a resposta HTTP para o navegador
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=relatorio.pdf");
        response.setContentLength(outputStream.size());

        // Escreve o PDF para o response do servlet
        response.getOutputStream().write(outputStream.toByteArray());
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }

}
