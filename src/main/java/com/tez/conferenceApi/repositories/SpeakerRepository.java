package com.tez.conferenceApi.repositories;

import com.tez.conferenceApi.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
