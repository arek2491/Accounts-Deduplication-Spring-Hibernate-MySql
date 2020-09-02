package com.accounts.deduplicate.deduplication;

import com.accounts.deduplicate.domain.User;
import com.accounts.deduplicate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Deduplicate {

    @Autowired
    UserRepository repository;

    public List<User> deduplicatedUsers() {
        List<User> allUsers = repository.findAll();

        return allUsers.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
