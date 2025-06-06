package com.hu.backend.dto.paciente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hu.backend.entities.enums.Fototipo;
import com.hu.backend.entities.enums.PacienteSexo;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "PacienteDto", description = "DTO de resposta contendo os dados do paciente.")
public record PacienteDto(

    @Schema(description = "ID do paciente", example = "1")
    Long id,

    @Schema(description = "Nome completo do paciente", example = "João da Silva")
    String nome,

    @Schema(description = "Código do prontuário do paciente - vem da ficha do GHU", example = "PRT-2024-001")
    String prontuario,

    @Schema(description = "Sexo do paciente", implementation = PacienteSexo.class)
    PacienteSexo sexo,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Schema(description = "Data de nascimento do paciente", example = "15-08-1990")
    LocalDate dataDeNascimento,

    @Schema(description = "Nome do médico que indicou o paciente", example = "Dr. Carlos Mendes")
    String medicoIndicacao,

    @Schema(description = "Telefone do médico que indicou o paciente", example = "86999991234")
    String telefoneMedicoIndicacao,

    @Schema(description = "Telefone de contato do paciente", example = "86988885678")
    String telefonePaciente,

    @Schema(description = "Fototipo de pele do paciente", implementation = Fototipo.class)
    Fototipo fototipo,

    @Schema(description = "Resumo de tratamentos anteriores realizados pelo paciente", example = "Já realizou 20 sessões de fototerapia entre 2023 e 2024.")
    String resumoTratamentosAnteriores

) {}
