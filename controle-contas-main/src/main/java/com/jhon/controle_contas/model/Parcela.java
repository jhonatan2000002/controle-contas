package com.jhon.controle_contas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class Parcela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataVencimento;
    private Integer numeroParcela;
    private Double valorParcela;
    private String status;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;
}
