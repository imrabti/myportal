package org.nuvola.myportal.controller;

import org.nuvola.myportal.server.service.AccountsService;
import org.nuvola.myportal.shared.ApiPaths;
import org.nuvola.myportal.shared.PathParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.USERS + "/" + PathParams.ID + ApiPaths.ACCOUNTS)
public class AccountsController {
    private final AccountsService accountsService;

    @Autowired
    AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }
}
