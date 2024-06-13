package com.lcv.service;

import com.lcv.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
