package br.com.kaiomelo.service;

import br.com.kaiomelo.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
