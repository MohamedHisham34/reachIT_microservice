package com.example.jobs.controller;

import com.example.jobs.service.client.JobProviderClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs-service")
public class JobsController {

    private final JobProviderClient jobProviderClient;

    public JobsController(JobProviderClient jobProviderClient) {
        this.jobProviderClient = jobProviderClient;
    }

    @GetMapping("/all")
    public List<String> fetchJobs() {
        return jobProviderClient.getJobs();
    }

    @PostMapping("/new")
    public String createJob(@RequestBody String job) {
        return jobProviderClient.addJob(job);
    }
}
