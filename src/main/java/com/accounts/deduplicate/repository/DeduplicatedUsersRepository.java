package com.accounts.deduplicate.repository;

import com.accounts.deduplicate.domain.deduplicated.DeduplicatedUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface DeduplicatedUsersRepository extends CrudRepository<DeduplicatedUser, Long> {

    @Override
    Set<DeduplicatedUser> findAll();


}
