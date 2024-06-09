package com.example.springwebdemo.service;

import com.example.springwebdemo.Entity.Job;
import com.example.springwebdemo.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job saveJobs(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> fetchJobDetails() {
        return jobRepository.findAll();
    }

    @Override
    public Job fetchJobById(Long job_id) {
        return jobRepository.findById(job_id).get();
    }

    @Override
    public void deleteJobById(Long job_id) {
        jobRepository.deleteById(job_id);
    }
}
