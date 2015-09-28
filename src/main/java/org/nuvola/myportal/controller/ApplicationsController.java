package org.nuvola.myportal.controller;

import org.nuvola.myportal.server.service.ApplicationsService;
import org.nuvola.myportal.shared.ApiPaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.APPLICATIONS)
public class ApplicationsController {
    private final ApplicationsService applicationsService;

    @Autowired
    ApplicationsController(ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }
}
