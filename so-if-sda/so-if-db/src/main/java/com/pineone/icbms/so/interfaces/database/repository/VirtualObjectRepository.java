package com.pineone.icbms.so.interfaces.database.repository;

import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * VirtualObjectForDB repository(DAO for table) interface.<BR/>
 *
 * Created by uni4love on 2017. 1. 13..
 */
@Repository
@Table(name = "virtual_object")
public interface VirtualObjectRepository extends JpaRepository<VirtualObjectForDB, Long> {
    VirtualObjectForDB findById(long id);
}
