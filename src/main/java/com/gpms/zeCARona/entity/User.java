package com.gpms.zeCARona.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name="Usuarios")
public class User {

    @Getter @Setter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String senha;

    @Getter @Setter
    private String tipo = "Passageiro"; //valor default
}
