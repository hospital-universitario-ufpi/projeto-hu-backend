package com.hu.backend.dto.auth;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "RegisterRequest", description = "DTO para registro de novo usuário")
public record RegisterRequest(
    
    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email deve ter um formato válido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Schema(description = "Email do usuário", example = "usuario@example.com")
    String email, 
    
    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, max = 50, message = "A senha deve ter entre 8 e 50 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$", 
             message = "A senha deve conter pelo menos uma letra minúscula, uma maiúscula e um número")
    @Schema(description = "Senha do usuário (mín. 8 chars, com maiúscula, minúscula e número)", 
            example = "MinhaSenh@123")
    String password
) {}
