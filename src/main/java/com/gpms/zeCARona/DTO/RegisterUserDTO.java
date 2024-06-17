package com.gpms.zeCARona.DTO;

import lombok.Getter;
import lombok.Setter;

public class RegisterUserDTO {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String senha;
}
