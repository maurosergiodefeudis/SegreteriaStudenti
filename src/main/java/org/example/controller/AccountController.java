package org.example.controller;

import com.exercise.mauro.openapidemo.api.AccountsApi;
import com.exercise.mauro.openapidemo.api.model.Accounts;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/students/")
public class AccountController implements AccountsApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private AccountService accountService;

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Accounts> getAccounts() {
        LOGGER.info("Calling the getAccounts API!");

        Accounts accounts = accountService.retrieveAllStudents();

        if (accounts == null || accounts.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).build();

        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> keepAlive() {
        return null;
    }
}
