package com.accounts.deduplicate.controller;

import com.accounts.deduplicate.deduplication.Deduplicate;
import com.accounts.deduplicate.domain.User;
import com.accounts.deduplicate.domain.deduplicated.DeduplicatedUser;
import com.accounts.deduplicate.mapper.UsersMapper;
import com.accounts.deduplicate.repository.DeduplicatedUsersRepository;
import com.accounts.deduplicate.service.DbService;
import org.hibernate.annotations.NamedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("v1")
public class AccountsController {

    @Autowired
    private DbService service;

    @Autowired
    private Deduplicate deduplicate;

    @Autowired
    private UsersMapper mapper;



    @GetMapping(path = "/getAllUsers")
    public @ResponseBody List<User> getAllUsers() {
       return service.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveUser", consumes = APPLICATION_JSON_VALUE)
    public void saveUser(@RequestBody User user) {
         service.saveUser(user);
    }

    @GetMapping(path = "/getDeduplicatedUsers")
    public @ResponseBody Set<DeduplicatedUser> getDeduplicatedUsers() {
        for(int i = 0; i < deduplicate.deduplicatedUsers().size(); i++ ) {
            service.saveDeduplicatedUser(mapper.mapToDeduplicatedUser(deduplicate.deduplicatedUsers().get(i)));
        }
        return service.getDeduplicatedUsers();
    }
}
