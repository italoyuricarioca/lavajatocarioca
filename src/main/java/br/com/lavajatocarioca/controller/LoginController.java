package br.com.lavajatocarioca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Login Controller.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Controller
public class LoginController {

  @RequestMapping("/")
  public String inicio() {
    return "index";
  }
}
