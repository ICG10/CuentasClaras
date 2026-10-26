package com.cuentasclaras.user.service;

import com.cuentasclaras.user.domain.EmailAlreadyInUseException;
import com.cuentasclaras.user.domain.User;
import com.cuentasclaras.user.domain.UserNotFoundException;
import com.cuentasclaras.user.dto.CreateUserRequest;
import com.cuentasclaras.user.dto.UserResponse;
import com.cuentasclaras.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserResponse create(CreateUserRequest request) {
        User user = new User(request.email(), request.displayName());
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyInUseException(user.getEmail());
        }
        return UserResponse.from(userRepository.save(user));
    }

    @Transactional(readOnly = true)
    public void ensureExists(Long userId) {
        if (!userRepository.existsById(userId)) {
            throw new UserNotFoundException(userId);
        }
    }
}