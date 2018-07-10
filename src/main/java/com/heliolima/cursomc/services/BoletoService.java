package com.heliolima.cursomc.services;

import com.heliolima.cursomc.domain.PagamentoComBoleto;
import java.util.Calendar;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author Helio
 */
@Service
public class BoletoService {
    
    public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido){
        Calendar cal = Calendar.getInstance();
        cal.setTime(instanteDoPedido);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        pagto.setDataVencimento(cal.getTime());
    }
    
}
