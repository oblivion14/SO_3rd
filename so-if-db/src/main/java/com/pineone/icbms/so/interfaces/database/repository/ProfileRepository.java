package com.pineone.icbms.so.interfaces.database.repository;

import com.pineone.icbms.so.interfaces.database.model.ProfileForDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * ProfileForDB repository(DAO for table) interface.<BR/>
 *
 * Created by uni4love on 2017. 1. 13..
 */
@Repository
@Table(name = "profile")
public interface ProfileRepository extends JpaRepository<ProfileForDB, String> {

}
