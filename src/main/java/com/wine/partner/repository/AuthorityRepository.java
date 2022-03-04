package com.wine.partner.repository;

import com.wine.partner.model.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
//    @Query(value = "select * from authority where member_id = :id", nativeQuery = true)
//    List<Authority> findByMemberId(@Param("id") int id);
}
