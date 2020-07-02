package com.souvik.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.souvik.org.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

}
