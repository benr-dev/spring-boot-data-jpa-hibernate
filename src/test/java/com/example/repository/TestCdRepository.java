package com.example.repository;

import com.example.entity.Cd;
import com.example.entity.CdId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DataJpaTest
public class TestCdRepository {

    @Autowired
    private CdRepository cdRepository;

    @Test
    public void when_saveCdToEmptyRepository_then_CdIsSaved() {
        //given
        Cd cd = new Cd("Prince", "Purple Rain");

        //when
        Cd savedCd = cdRepository.save(cd);

        //then
        CdId cdId = new CdId("Prince", "Purple Rain");
        assertThat(cdRepository.findById(cdId).isPresent(), equalTo(true));
    }
}
