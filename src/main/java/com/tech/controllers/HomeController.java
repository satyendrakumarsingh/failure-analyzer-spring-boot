package com.tech.controllers;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import com.tech.service.UserService;

@RestController
public class HomeController {
	@Resource(name="clientService")
	UserService userService;
}