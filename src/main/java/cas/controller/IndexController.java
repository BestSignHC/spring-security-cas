package cas.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping("/")
    public String index() {
        return "index cas";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello cas";
    }

    @GetMapping("/login")
    public String login() {
        return "login cas";
    }

    @PreAuthorize("hasAnyAuthority('READ')")
    @GetMapping("/read")
    public String query() {
        return "read cas";
    }

    @PreAuthorize("hasAnyAuthority('WRITE')")
    @GetMapping("/write")
    public String write() {
        return "write cas";
    }
}
