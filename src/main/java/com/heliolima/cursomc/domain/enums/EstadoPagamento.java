/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heliolima.cursomc.domain.enums;

/**
 *
 * @author Helio Lima
 */
public enum EstadoPagamento {
    
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");
    
    private int cod;
    private String descricao;
    
    private EstadoPagamento(int cod, String desc){
        this.cod = cod;
        this.descricao = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static EstadoPagamento toEnum(Integer cod){
        if(cod == null) return null;
        
        for(EstadoPagamento x : EstadoPagamento.values()){
            if(cod.equals(x.getCod()))
                return x;
        }
        
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
