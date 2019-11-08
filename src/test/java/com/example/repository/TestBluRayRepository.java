package com.example.repository;

import com.example.entity.BluRay;
import com.example.entity.BluRayId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DataJpaTest
public class TestBluRayRepository {

    @Autowired
    public BluRayRepository bluRayRepository;

    @Test public void when_createBluRayInEmptyRepository_then_bluRayIsSaved() {
        //given
        bluRayRepository.save(new BluRay("Fox", "Some Film"));

        //when
        Optional<BluRay> bluRay = bluRayRepository.findById(new BluRayId("Fox", "Some Film"));

        //then
        assertThat(bluRay.isPresent(), equalTo(true));
    }
}
