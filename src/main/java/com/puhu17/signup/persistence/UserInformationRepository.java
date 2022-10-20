package com.puhu17.signup.persistence;


import com.puhu17.signup.entity.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation,Long> {
    List<UserInformation> findById(String id);

}
