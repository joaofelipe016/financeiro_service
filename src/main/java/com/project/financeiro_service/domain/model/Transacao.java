package com.project.financeiro_service.domain.model;

import com.project.financeiro_service.domain.enums.CategoriaTransacaoEnum;
import com.project.financeiro_service.domain.enums.TipoTransacaoEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Transacao {

    private UUID transacaoId;

    private String descricao;

    private BigDecimal valor;

    private LocalDate dataTransacao;

    private TipoTransacaoEnum tipoTransacaoEnum;

    private CategoriaTransacaoEnum categoriaTransacaoEnum;

    public Transacao(
            UUID transacaoId,
            String descricao,
            BigDecimal valor,
            LocalDate dataTransacao,
            TipoTransacaoEnum tipoTransacaoEnum,
            CategoriaTransacaoEnum categoriaTransacaoEnum
            ) throws Exception {
        this.transacaoId = transacaoId;
        this.descricao = descricao;
        this.valor = this.valorIsReal(valor);
        this.dataTransacao = dataTransacao;
        this.tipoTransacaoEnum = tipoTransacaoEnum;
        this.categoriaTransacaoEnum = categoriaTransacaoEnum;
    }

    public UUID getTransacaoId() {
        return transacaoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public TipoTransacaoEnum getTipoTransacaoEnum() {
        return tipoTransacaoEnum;
    }

    public CategoriaTransacaoEnum getCategoriaTransacaoEnum() {
        return categoriaTransacaoEnum;
    }

    public BigDecimal valorIsReal(BigDecimal valor) throws Exception {
        if (valor == null) {
            throw new Exception("Campo valor está vazio!!");
        }
        return valor;
    }
}
