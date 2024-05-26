package com.example.JPACourse.repositories;

import com.example.JPACourse.Models.Author;
import com.example.JPACourse.Models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
