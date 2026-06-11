package com.kutay.spring_core_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {

        System.out.println("In constructor: TennisCoach");

    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }
}
