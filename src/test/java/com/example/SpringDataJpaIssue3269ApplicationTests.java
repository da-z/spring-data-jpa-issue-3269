package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class SpringDataJpaIssue3269ApplicationTests {

    @Autowired
    private TestRepository testRepository;

    @Test
    @DisplayName("should work fine")
    void test() {

        // At 1:26 and token 'as', no viable alternative at input 'select count(distinct 'a' *as x) from TestEntity AS __' [select count(distinct 'a' as x) from TestEntity AS __]
        testRepository.queryUsingDistinctAndPage(Pageable.unpaged());

    }

}
