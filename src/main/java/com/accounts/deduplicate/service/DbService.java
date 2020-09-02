package com.accounts.deduplicate.service;

import com.accounts.deduplicate.domain.User;
import com.accounts.deduplicate.domain.deduplicated.DeduplicatedUser;
import com.accounts.deduplicate.repository.DeduplicatedUsersRepository;
import com.accounts.deduplicate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DbService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private DeduplicatedUsersRepository deduplicatedUsersRepository;

    public void saveUser(User user) {
        repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void saveDeduplicatedUser(DeduplicatedUser deduplicatedUser) {
        deduplicatedUsersRepository.save(deduplicatedUser);
    }

    public Set<DeduplicatedUser> getDeduplicatedUsers() {
        return deduplicatedUsersRepository.findAll();
    }
}
