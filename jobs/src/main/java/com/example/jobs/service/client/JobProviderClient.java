package com.example.jobs.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "Job-Provider") // Eureka name of the producer
public interface JobProviderClient {
    @GetMapping("/jobs")
    List<String> getJobs();

    @PostMapping("/jobs")
    String addJob(@RequestBody String job);
}
