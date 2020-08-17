package com.evaldo.cursomc.services;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.evaldo.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
	

}
