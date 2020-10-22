package com.abubakirov.spring1task1.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("id")
@Scope("prototype")
public class Id {
    private static int next_id = 0;
    private int id;

    public Id() {
        id = next_id;
        next_id++;
    }

    public int getId() {
        return id;
    }
}
