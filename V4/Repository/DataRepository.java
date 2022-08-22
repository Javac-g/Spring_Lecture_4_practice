package com.company.V4.Repository;

import com.company.V4.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<UserEntity, Long> {
}
