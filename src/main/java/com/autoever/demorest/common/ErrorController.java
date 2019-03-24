package com.autoever.demorest.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/400")
    public String error400() {
        return "400";
    }

    @RequestMapping("/403")
    public String error403() {
        return "403";
    }

    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

    @RequestMapping("/default")
    public String errorDefault() {
        return "error";
    }
}
