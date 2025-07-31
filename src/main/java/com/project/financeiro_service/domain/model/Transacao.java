package com.project.financeiro_service.domain.model;

import com.project.financeiro_service.domain.enums.CategoriaTransacaoEnum;
import com.project.financeiro_service.domain.enums.TipoTransacaoEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID transacao_id;

    @Column
    private String descricao;

    @Column
    private BigDecimal valor;

    @Column
    private LocalDate dataTransacao;

    @Column
    private TipoTransacaoEnum tipoTransacaoEnum;

    @Column
    private CategoriaTransacaoEnum categoriaTransacaoEnum;
}
