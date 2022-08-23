package com.company.V5.Reposytory;

import com.company.V5.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<UserEntity,Long> {

}
