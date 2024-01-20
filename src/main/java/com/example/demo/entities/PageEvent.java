package com.example.demo.entities;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
