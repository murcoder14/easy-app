package org.muralis.easy.controller;

import org.muralis.easy.dto.Bozo;
import org.muralis.easy.repository.BozosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bozos")
public class EasyController {

    @Autowired
    private BozosRepository repository;

    @GetMapping("/{bozoName}")
    public Mono<Bozo> getBozo(@PathVariable String bozoName) {
        return repository.findByName(bozoName);
    }

    @GetMapping("/all")
    public Flux<Bozo> getBozos() {
        return repository.findAll();
    }
}