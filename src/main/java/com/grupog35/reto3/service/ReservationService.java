package com.grupog35.reto3.service;



import com.grupog35.reto3.model.ReservationModel;
import com.grupog35.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> obtener(){

        return reservationRepository.findAll();
    }
    public void crear(ReservationModel reservation){
       if(!reservationRepository.existsById(reservation.getIdReservation())) {
           reservationRepository.save(reservation);
       }

    }
}
