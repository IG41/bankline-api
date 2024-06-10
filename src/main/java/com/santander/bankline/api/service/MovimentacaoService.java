package com.santander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;
import org.springframework.stereotype.Service;

import com.santander.bankline.api.dto.NovaMovimentacao;
import com.santander.bankline.api.model.Correntista;
import com.santander.bankline.api.model.Movimentacao;
import com.santander.bankline.api.model.MovimentacaoTipo;
import com.santander.bankline.api.repository.CorrentistaRepository;
import com.santander.bankline.api.repository.Movimentacaorepository;

@Service
public class MovimentacaoService {
	@Autowired
	private Movimentacaorepository repository;
	@Autowired
	private CorrentistaRepository correntistaRepository;
	public void save(NovaMovimentacao novaMovimentacao){
		Movimentacao movimentacao = new Movimentacao();
		//Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		
		Double valor = novaMovimentacao.getValor();
		if(novaMovimentacao.getTipo() == MovimentacaoTipo.DESPESA);
			valor = valor *1;
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdconta(novaMovimentacao.getIdconta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdconta()).orElse(null);
		if(correntista != null) {
			correntista.getconta().setSaldo(correntista.getconta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		repository.save(movimentacao);
	
	}
}