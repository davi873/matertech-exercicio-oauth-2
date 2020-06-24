package com.mastertech.oauth.contato;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
    List<Optional<Contato>> findAllByUserId(int userId);
}
