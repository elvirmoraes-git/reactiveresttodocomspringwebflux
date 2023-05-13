package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;

// Interface responsável pela persistência
public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {
    Flux<Todo> findByFeito(Boolean feito);
}
