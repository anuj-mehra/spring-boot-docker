package com.example.springbootdockerapp;

import com.example.springbootdockerapp.account.request.AccountDetailsRequest;
import com.example.springbootdockerapp.account.response.AccountDetailsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountsController {

    @PostMapping("/detail")
    public ResponseEntity<AccountDetailsResponse> accountDetails(@RequestBody AccountDetailsRequest request) {

        AccountDetailsResponse response =
                new AccountDetailsResponse(request.getSearchAccountNumber(), "accountNumber", "accountKey");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
