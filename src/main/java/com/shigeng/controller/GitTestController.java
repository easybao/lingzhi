package com.shigeng.controller;

import com.shigeng.service.GitTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GitTestController {
    @Autowired
    private GitTestService gitTestService;

    public static void main(String[] args) {
        System.out.println("12365135");
        System.out.println("master");
        System.out.println("dev");
        System.out.println("feature=1324");
    }
}
