/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *S
 * @author veiga
 */
@Entity
@Table(name="pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String identidade;
    private String profissao;
    private String contatoemergencia;
    private String diapagamento;
    private String datainiciocontrato;
    private String datafimcontrato;
    private String nacionalidade;
    private String filiacao;
    private String enderecoatual;
    private String refbancaria;
    private String tipocontrato;
    private String locatario;
    private String Dataassinatura;
    private String Datanascimento;
    private String Loft;
    private String valor;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String email, String telefone, String cpf, String identidade, String profissao, String contatoemergencia, String diapagamento, String datainiciocontrato, String datafimcontrato, String nacionalidade, String filiacao, String enderecoatual, String refbancaria, String tipocontrato, String locatario, String Dataassinatura, String Datanascimento, String Loft, String valor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.identidade = identidade;
        this.profissao = profissao;
        this.contatoemergencia = contatoemergencia;
        this.diapagamento = diapagamento;
        this.datainiciocontrato = datainiciocontrato;
        this.datafimcontrato = datafimcontrato;
        this.nacionalidade = nacionalidade;
        this.filiacao = filiacao;
        this.enderecoatual = enderecoatual;
        this.refbancaria = refbancaria;
        this.tipocontrato = tipocontrato;
        this.locatario = locatario;
        this.Dataassinatura = Dataassinatura;
        this.Datanascimento = Datanascimento;
        this.Loft = Loft;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getContatoemergencia() {
        return contatoemergencia;
    }

    public void setContatoemergencia(String contatoemergencia) {
        this.contatoemergencia = contatoemergencia;
    }

    public String getDiapagamento() {
        return diapagamento;
    }

    public void setDiapagamento(String diapagamento) {
        this.diapagamento = diapagamento;
    }

    public String getDatainiciocontrato() {
        return datainiciocontrato;
    }

    public void setDatainiciocontrato(String datainiciocontrato) {
        this.datainiciocontrato = datainiciocontrato;
    }

    public String getDatafimcontrato() {
        return datafimcontrato;
    }

    public void setDatafimcontrato(String datafimcontrato) {
        this.datafimcontrato = datafimcontrato;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getEnderecoatual() {
        return enderecoatual;
    }

    public void setEnderecoatual(String enderecoatual) {
        this.enderecoatual = enderecoatual;
    }

    public String getRefbancaria() {
        return refbancaria;
    }

    public void setRefbancaria(String refbancaria) {
        this.refbancaria = refbancaria;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    public String getLocatario() {
        return locatario;
    }

    public void setLocatario(String locatario) {
        this.locatario = locatario;
    }

    public String getDataassinatura() {
        return Dataassinatura;
    }

    public void setDataassinatura(String Dataassinatura) {
        this.Dataassinatura = Dataassinatura;
    }

    public String getDatanascimento() {
        return Datanascimento;
    }

    public void setDatanascimento(String Datanascimento) {
        this.Datanascimento = Datanascimento;
    }

    public String getLoft() {
        return Loft;
    }

    public void setLoft(String Loft) {
        this.Loft = Loft;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.telefone);
        hash = 83 * hash + Objects.hashCode(this.cpf);
        hash = 83 * hash + Objects.hashCode(this.identidade);
        hash = 83 * hash + Objects.hashCode(this.profissao);
        hash = 83 * hash + Objects.hashCode(this.contatoemergencia);
        hash = 83 * hash + Objects.hashCode(this.diapagamento);
        hash = 83 * hash + Objects.hashCode(this.datainiciocontrato);
        hash = 83 * hash + Objects.hashCode(this.datafimcontrato);
        hash = 83 * hash + Objects.hashCode(this.nacionalidade);
        hash = 83 * hash + Objects.hashCode(this.filiacao);
        hash = 83 * hash + Objects.hashCode(this.enderecoatual);
        hash = 83 * hash + Objects.hashCode(this.refbancaria);
        hash = 83 * hash + Objects.hashCode(this.tipocontrato);
        hash = 83 * hash + Objects.hashCode(this.locatario);
        hash = 83 * hash + Objects.hashCode(this.Dataassinatura);
        hash = 83 * hash + Objects.hashCode(this.Datanascimento);
        hash = 83 * hash + Objects.hashCode(this.Loft);
        hash = 83 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.identidade, other.identidade)) {
            return false;
        }
        if (!Objects.equals(this.profissao, other.profissao)) {
            return false;
        }
        if (!Objects.equals(this.contatoemergencia, other.contatoemergencia)) {
            return false;
        }
        if (!Objects.equals(this.diapagamento, other.diapagamento)) {
            return false;
        }
        if (!Objects.equals(this.datainiciocontrato, other.datainiciocontrato)) {
            return false;
        }
        if (!Objects.equals(this.datafimcontrato, other.datafimcontrato)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidade, other.nacionalidade)) {
            return false;
        }
        if (!Objects.equals(this.filiacao, other.filiacao)) {
            return false;
        }
        if (!Objects.equals(this.enderecoatual, other.enderecoatual)) {
            return false;
        }
        if (!Objects.equals(this.refbancaria, other.refbancaria)) {
            return false;
        }
        if (!Objects.equals(this.tipocontrato, other.tipocontrato)) {
            return false;
        }
        if (!Objects.equals(this.locatario, other.locatario)) {
            return false;
        }
        if (!Objects.equals(this.Dataassinatura, other.Dataassinatura)) {
            return false;
        }
        if (!Objects.equals(this.Datanascimento, other.Datanascimento)) {
            return false;
        }
        if (!Objects.equals(this.Loft, other.Loft)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    
}
