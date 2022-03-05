package com.wine.partner.repository;

import com.wine.partner.model.entity.MemberDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MemberDetailRepository extends JpaRepository<MemberDetail, Integer> {
//    @Query(value = "select * from member_detail where member_id = :id", nativeQuery = true)
    MemberDetail findByMemberId(@Param("id") int id);
}
