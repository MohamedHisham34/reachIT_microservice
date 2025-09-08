package com.example.job_provider.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobProviderController {

    private final List<String> jobs = new ArrayList<>();

    @PostMapping
    public String addJob(@RequestBody String job) {
        jobs.add(job);
        return "Job added: " + job;
    }

    @GetMapping
    public List<String> getJobs() {
        return jobs;
    }
}
