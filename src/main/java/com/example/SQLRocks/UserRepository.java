package com.example.SQLRocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    //First part in <> : with whom to connect (Entity) (or here i want Jparepository connect to "User" entity/table), datatype of the primary key.
    //in case i have another table that time, naa yinnond entity/class create madabekagathethi.
}
