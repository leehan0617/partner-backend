package com.wine.partner.repository;

import com.wine.partner.model.entity.MemberDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDetailRepository extends JpaRepository<MemberDetail, Integer> {
}
