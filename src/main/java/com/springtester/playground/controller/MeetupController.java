/*
    This class is responsible for handling requests to/from the API
*/

package com.springtester.playground.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetupController {

    @RequestMapping("/")
    public String index() {
        return "Congratulations from MeetupController.java";
    }

}