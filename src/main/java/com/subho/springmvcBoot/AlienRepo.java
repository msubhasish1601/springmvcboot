package com.subho.springmvcBoot;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subho.springmvcBoot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
