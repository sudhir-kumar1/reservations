package com.example.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findByNumber(String number);
}
