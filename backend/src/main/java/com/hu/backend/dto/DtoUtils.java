package com.hu.backend.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaCreationDto;
import com.hu.backend.dto.areaCorporalAcometida.AreaCorporalAcometidaDto;
import com.hu.backend.dto.arquivos.ArquivoCreationDto;
import com.hu.backend.dto.arquivos.ArquivoDto;
import com.hu.backend.dto.paciente.PacienteCreationDto;
import com.hu.backend.dto.paciente.PacienteDto;
import com.hu.backend.dto.sessao.SessaoCreationDto;
import com.hu.backend.dto.sessao.SessaoDto;
import com.hu.backend.dto.tratamento.TratamentoCreationDto;
import com.hu.backend.dto.tratamento.TratamentoDto;
import com.hu.backend.entities.AreaCorporalAcometida;
import com.hu.backend.entities.Arquivo;
import com.hu.backend.entities.Paciente;
import com.hu.backend.entities.Sessao;
import com.hu.backend.entities.Tratamento;
import com.hu.backend.dto.exame.ExameCreationDto;
import com.hu.backend.dto.exame.ExameDto;
import com.hu.backend.dto.particularidade.ParticularidadeCreationDto;
import com.hu.backend.dto.particularidade.ParticularidadeDto;
import com.hu.backend.entities.Exame;
import com.hu.backend.entities.Particularidade;

public class DtoUtils {

    // ========================= PACIENTE ========================== marcos
    public static Paciente toEntity(PacienteCreationDto paciente) {
        return Paciente.builder()
                .nome(paciente.nome())
                .prontuario(paciente.prontuario())
                .sexo(paciente.sexo())
                .dataDeNascimento(paciente.dataDeNascimento())
                .medicoIndicacao(paciente.medicoIndicacao())
                .telefoneMedicoIndicacao(paciente.telefoneMedicoIndicacao())
                .telefonePaciente(paciente.telefonePaciente())
                .fototipo(paciente.fototipo())
                .resumoTratamentosAnteriores(paciente.resumoTratamentosAnteriores())
                .build();
    }

    public static PacienteDto toDto(Paciente paciente) {
        return new PacienteDto(
                paciente.getId(),
                paciente.getNome(),
                paciente.getProntuario(),
                paciente.getSexo(),
                paciente.getDataDeNascimento(),
                paciente.getMedicoIndicacao(),
                paciente.getTelefoneMedicoIndicacao(),
                paciente.getTelefonePaciente(),
                paciente.getFototipo(),
                paciente.getResumoTratamentosAnteriores());
    }

    public static void updatePacienteFromDto(Paciente paciente, PacienteDto dto) {
        paciente.setNome(dto.nome());
        paciente.setProntuario(dto.prontuario());
        paciente.setSexo(dto.sexo());
        paciente.setDataDeNascimento(dto.dataDeNascimento());
        paciente.setMedicoIndicacao(dto.medicoIndicacao());
        paciente.setTelefoneMedicoIndicacao(dto.telefoneMedicoIndicacao());
        paciente.setTelefonePaciente(dto.telefonePaciente());
        paciente.setFototipo(dto.fototipo());
        paciente.setResumoTratamentosAnteriores(dto.resumoTratamentosAnteriores());
    }

    // ========================= EXAMES ========================== marcos

    public static Exame toEntity(ExameCreationDto exame) {
        return Exame.builder()
                .dataExame(exame.dataExame())
                .exameTipo(exame.exameTipo())
                .laboratorio(exame.laboratorio())
                .nomeExame(exame.nomeExame())
                .observacao(exame.observacao())
                .resultadoBoolean(exame.resultadoBoolean())
                .resultadoOutro(exame.resultadoOutro())
                .build();
    }

    public static ExameDto toDto(Exame exame) {
        return new ExameDto(
                exame.getId(),
                exame.getExameTipo(),
                exame.getNomeExame(),
                exame.getResultadoNumerico(),
                exame.getResultadoBoolean(),
                exame.getResultadoOutro(),
                exame.getDataExame(),
                exame.getLaboratorio(),
                exame.getObservacao());
    }

    // ========================= AreaCorporalAcometida ==========================
    // vitao
    public static AreaCorporalAcometida toEntity(AreaCorporalAcometidaCreationDto areaCorporalAcometida) {
        return AreaCorporalAcometida.builder()
                .cabecaPescoco(areaCorporalAcometida.cabecaPescoco())
                .bracoDireito(areaCorporalAcometida.bracoDireito())
                .bracoEsquerdo(areaCorporalAcometida.bracoEsquerdo())
                .pernaDireita(areaCorporalAcometida.pernaDireita())
                .pernaEsquerda(areaCorporalAcometida.pernaEsquerda())
                .troncoAnterior(areaCorporalAcometida.troncoAnterior())
                .troncoPosterior(areaCorporalAcometida.troncoPosterior())
                .genitalia(areaCorporalAcometida.genitalia())
                .build();
    }

    public static AreaCorporalAcometidaDto toDto(AreaCorporalAcometida areaCorporalAcometida) {
        return new AreaCorporalAcometidaDto(
                areaCorporalAcometida.getId(),
                areaCorporalAcometida.getCabecaPescoco(),
                areaCorporalAcometida.getBracoDireito(),
                areaCorporalAcometida.getBracoEsquerdo(),
                areaCorporalAcometida.getPernaDireita(),
                areaCorporalAcometida.getPernaEsquerda(),
                areaCorporalAcometida.getTroncoAnterior(),
                areaCorporalAcometida.getTroncoPosterior(),
                areaCorporalAcometida.getGenitalia());
    }

    // ========================= Particularidade ========================== marcos

    public static Particularidade toEntity(ParticularidadeCreationDto particularidade) {
        return Particularidade.builder()
                .descricaoExporFace(particularidade.descricaoExporFace())
                .descricaoOutros(particularidade.descricaoOutros())
                .descricaoPosicaoCabine(particularidade.descricaoPosicaoCabine())
                .descricaoProtecaoGenital(particularidade.descricaoProtecaoGenital())
                .exporFace(particularidade.exporFace())
                .protecaoGenital(particularidade.protecaoGenital())
                .usoDegrau(particularidade.usoDegrau())
                .usoOculos(particularidade.usoOculos())
                .build();
    }

    public static ParticularidadeDto toDto(Particularidade particularidade) {
        return new ParticularidadeDto(
                particularidade.getId(),
                particularidade.isUsoDegrau(),
                particularidade.isUsoOculos(),
                particularidade.isExporFace(),
                particularidade.getDescricaoExporFace(),
                particularidade.isProtecaoGenital(),
                particularidade.getDescricaoProtecaoGenital(),
                particularidade.getDescricaoPosicaoCabine(),
                particularidade.getDescricaoOutros());
    }

    // ========================= Sessao ========================== vitao
    public static Sessao toEntity(SessaoCreationDto sessao) {
        return Sessao.builder()
                .dataSessao(sessao.dataSessao())
                .dose(sessao.dose())
                .reacaoPosSessao(sessao.reacaoPosSessao())
                .observacoes(sessao.observacoes())
                .tempoExposicao(sessao.tempoExposicao())
                .build();
    }

    public static SessaoDto toDto(Sessao sessao) {
        return new SessaoDto(
                sessao.getId(),
                sessao.getDataSessao(),
                sessao.getDose(),
                sessao.getReacaoPosSessao(),
                sessao.getObservacoes(),
                sessao.getTempoExposicao());
    }

    // ========================= Tratamento ========================== vitao
    public static Tratamento toEntity(TratamentoCreationDto tratamento) {
        return Tratamento.builder()
                .nomeTratamento(tratamento.nomeTratamento())
                .dataInicio(tratamento.dataInicio())
                .dataFim(tratamento.dataFim())
                .finalizado(tratamento.finalizado())
                .frequenciaTratamento(tratamento.frequenciaTratamento())
                .respostaTratamento(tratamento.respostaTratamento())
                .diasSessao(tratamento.diasSessao())
                .diagnostico(tratamento.diagnostico())
                .build();
    }

    public static TratamentoDto toDto(Tratamento tratamento) {
        return new TratamentoDto(
                tratamento.getId(),
                tratamento.getNomeTratamento(),
                tratamento.getDataInicio(),
                tratamento.getDataFim(),
                tratamento.isFinalizado(),
                tratamento.getModalidade(),
                tratamento.getDiagnostico(),
                tratamento.getFrequenciaTratamento(),
                new HashSet<>(tratamento.getDiasSessao()), // se usar em DTO
                tratamento.getRespostaTratamento(),
                DtoUtils.toDto(tratamento.getAreaCorporalAcometida()),
                DtoUtils.toDto(tratamento.getParticularidade()),
                DtoUtils.toDtoList(new ArrayList<>(tratamento.getExames()), DtoUtils::toDto),
                DtoUtils.toDtoList(new ArrayList<>(tratamento.getSessoes()), DtoUtils::toDto));
    }

    // ========================= Arquivo ==========================

    public static Arquivo toEntity(ArquivoCreationDto arquivo) {
        return Arquivo.builder()
                .url(arquivo.url())
                .titulo(arquivo.titulo()).build();
    }

    public static ArquivoDto toDto(Arquivo arquivo) {
        return new ArquivoDto(
                arquivo.getId(),
                arquivo.getUrl(),
                arquivo.getTitulo());
    }

    public static <T, R> List<R> toDtoList(List<T> modelList, Function<T, R> mapper) {
        return modelList.stream().map(mapper).collect(Collectors.toCollection(ArrayList::new));
    }

}
