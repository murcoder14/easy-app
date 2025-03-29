package org.muralis.easy.repository;

import org.muralis.easy.dto.Bozo;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;


public interface BozosRepository extends ReactiveCrudRepository<Bozo,Long> {

    @Query("SELECT * FROM bozo WHERE name = :name")
    Mono<Bozo> findByName(String name);
}