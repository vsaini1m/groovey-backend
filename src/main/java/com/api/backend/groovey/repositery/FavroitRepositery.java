package com.api.backend.groovey.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.groovey.entity.user.Favroit;

@Repository
public interface FavroitRepositery extends JpaRepository<Favroit, Long>{

}
