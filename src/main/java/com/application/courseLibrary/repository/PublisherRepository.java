package com.application.courseLibrary.repository;

import com.application.courseLibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
