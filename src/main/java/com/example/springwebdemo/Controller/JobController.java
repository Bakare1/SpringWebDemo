package com.example.springwebdemo.Controller;

import com.example.springwebdemo.Entity.Job;
import com.example.springwebdemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/job")
    public Job saveJobs(@RequestBody Job job){
        return jobService.saveJobs(job);
    }

    @GetMapping("/job")
    public List<Job> fetchJobDetails(){
        return jobService.fetchJobDetails();
    }

    @GetMapping("/job/{id}")
    public Job fetchJobById(@PathVariable("id") Long job_id){
        return jobService.fetchJobById(job_id);
    }

    @DeleteMapping("/job/{id}")
    public String deleteJobById(@PathVariable("id") Long job_id){
        jobService.deleteJobById(job_id);
        return "Record deleted Successfully";
    }
}
