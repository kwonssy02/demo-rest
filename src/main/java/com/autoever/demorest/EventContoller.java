package com.autoever.demorest;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EventContoller {

    @GetMapping("/events/form")
    public String eventsForm(Model model, HttpSession session) {
        Event newEvent = new Event();
        newEvent.setLimit(50);
        model.addAttribute("event", newEvent);
        return "events/form";
    }

    @GetMapping("/sessionSave")
    @ResponseBody
    public String sessionSave(HttpSession session) {
        session.setAttribute("event", "test");

        return "saved";
    }

    @GetMapping("/sessionTest")
    @ResponseBody
    public String sessionTest(@SessionAttribute LocalDateTime visitTime) {
        System.out.println(visitTime);
        return "session ";
    }

    @PostMapping("/events")
    @ResponseBody
    public Event getEvent(@ModelAttribute Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("================");
            bindingResult.getAllErrors().forEach(err -> {
                System.out.println(err.toString());
            });
        }
        return event;
    }
}
