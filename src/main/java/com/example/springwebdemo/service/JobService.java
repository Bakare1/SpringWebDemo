package com.example.springwebdemo.service;

import com.example.springwebdemo.Entity.Job;

import java.util.List;

public interface JobService {
    public Job saveJobs(Job job);

    public List<Job> fetchJobDetails();

    public Job fetchJobById(Long job_id);

    public void deleteJobById(Long job_id);
}
