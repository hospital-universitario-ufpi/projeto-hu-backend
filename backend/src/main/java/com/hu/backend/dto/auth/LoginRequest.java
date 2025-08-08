package com.hu.backend.dto.auth;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "LoginRequest", description = "DTO para login de usuário")
public record LoginRequest(
    
    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email deve ter um formato válido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Schema(description = "Email do usuário", example = "usuario@example.com")
    String email, 
    
    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 6, max = 50, message = "A senha deve ter entre 6 e 50 caracteres")
    @Schema(description = "Senha do usuário", example = "senha123")
    String password
) {}
