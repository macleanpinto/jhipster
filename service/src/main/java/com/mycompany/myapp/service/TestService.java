package com.mycompany.myapp.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestService
{

@GetMapping("/test")
public String testService()
{
return "Test service";
}

}
