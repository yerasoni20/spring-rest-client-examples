package example.springframework.springrestclientexamples.services;

import example.springframework.api.domain.User;
import example.springframework.springrestclientexamples.services.ApiService;
import example.springframework.api.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by jt on 9/21/17.
 */
@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        List<User> userData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=" + limit, List.class);
        return userData;
    }
}