package com.example.demo.repository;

import com.example.demo.model.TaskAssignment;
import com.example.demo.model.TsDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TsDetailRepository extends JpaRepository<TsDetail,Long> {
    @Query("select t from TsDetail t where t.team.id = :id")
    List<TsDetail> findByTeamId(Long id);

    List<TsDetail> findAllByUser_id(Long id);
}
