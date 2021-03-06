package br.com.viasoft.treinamento.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String usuario;

    private String nome;

    private String sobrenome;

    private String senha;

    @JsonIgnore
    private Boolean ativo;

}
