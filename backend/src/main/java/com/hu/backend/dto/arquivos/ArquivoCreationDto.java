package com.hu.backend.dto.arquivos;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ArquivoCreationDto", description = "DTO para criação de arquivos/fotos de sessões")
public record ArquivoCreationDto(
    
    @NotBlank(message = "A URL do arquivo é obrigatória")
    @Size(max = 2000, message = "A URL deve ter no máximo 2000 caracteres")
    @Pattern(regexp = "^https?://.*\\.(jpg|jpeg|png|gif|pdf|doc|docx)$", 
             message = "URL deve ser válida e apontar para um arquivo de imagem ou documento")
    @Schema(description = "URL do arquivo/foto", example = "https://example.com/photo.jpg")
    String url,
    
    @NotBlank(message = "O título do arquivo é obrigatório")
    @Size(min = 1, max = 200, message = "O título deve ter entre 1 e 200 caracteres")
    @Schema(description = "Título/descrição do arquivo", example = "Foto pré-tratamento")
    String titulo,
    
    @NotNull(message = "O ID da sessão é obrigatório")
    @Positive(message = "O ID da sessão deve ser um número positivo")
    @Schema(description = "ID da sessão à qual o arquivo pertence", example = "1")
    Long sessaoId
) {

}