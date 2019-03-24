package com.autoever.demorest;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Event {

    public interface CreateGroup {
    }

    public interface UpdateGroup {
    }

    private Integer id;
    private String name;

    @Min(value = 0, groups = CreateGroup.class)
    private Integer limit;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDateTime startDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

}
