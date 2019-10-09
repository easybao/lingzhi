package com.shigeng.controller;

import com.shigeng.service.GitTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GitTestController {
    @Autowired
    private GitTestService gitTestService;
}
