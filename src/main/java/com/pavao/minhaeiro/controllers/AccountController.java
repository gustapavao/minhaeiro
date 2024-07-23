package com.pavao.minhaeiro.controllers;

import com.pavao.minhaeiro.models.Account;
import com.pavao.minhaeiro.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/account")
    public ModelAndView index(){
        List<Account> account = this.accountRepository.findAll();
        ModelAndView mv = new ModelAndView("account/index");
        mv.addObject("account", account);

        return mv;
    }
}
