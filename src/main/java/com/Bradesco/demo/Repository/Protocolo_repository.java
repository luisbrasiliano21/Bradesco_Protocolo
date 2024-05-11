package com.Bradesco.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bradesco.demo.entity.Consulta_Protocolo;

public interface Protocolo_repository extends JpaRepository<Consulta_Protocolo, Long> {
    Consulta_Protocolo findByNumeroProtocolo(Long numeroProtocolo);
}
