package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends PagingAndSortingRepository<TestEntity, Long> {

    @Query("select distinct 'a' as x from TestEntity")
    Page<TestEntityProjection> queryUsingDistinctAndPage(Pageable pageable);

}
