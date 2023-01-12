package com.treina.recife.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.treina.recife.model.Contato;


public interface ContatoService extends JpaRepository<Contato, Long> {
}