package com.example.demo.profile.rdb.repository;

import com.example.demo.profile.rdb.entity.MemberProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberProfileJpaRepository extends JpaRepository<MemberProfileEntity, UUID> {
}
