package com.kiprono.repositories;

import com.kiprono.data.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    public Iterable<Reservation> findReservationByReservationDate(Date date);
}
