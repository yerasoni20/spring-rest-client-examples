package example.springframework.springrestclientexamples.services;

import example.springframework.api.domain.User;

import java.util.List;


public interface ApiService {

    List<User> getUsers(Integer limit);
}
