package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

  @GetMapping
  public String top() {
    // top.htmlを表示
    return "top";
  }

  @GetMapping("/admin")
  public String admin() {
    // admin.htmlを表示
    return "admin";
  }

  @GetMapping("/index")
  public String index() {
    // index.htmlを表示
    return "index";
  }
}
