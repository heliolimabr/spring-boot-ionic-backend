
package com.heliolima.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.heliolima.cursomc.domain.enums.EstadoPagamento;
import javax.persistence.Entity;

/**
 *
 * @author Helio Lima
 */
@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento {

    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
    
    
    
}
