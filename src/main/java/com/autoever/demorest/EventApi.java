package com.autoever.demorest;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventApi {

    @PostMapping("/createEvent")
    public Event createEvnet(@RequestBody @Validated(Event.UpdateGroup.class) Event event) {

        return event;
    }

}