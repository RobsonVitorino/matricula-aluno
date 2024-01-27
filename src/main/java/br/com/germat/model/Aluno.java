package br.com.germat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Aluno {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}