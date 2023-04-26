package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entiteien.Artist;
import com.example.demo.entiteien.BookingRequest;
import com.example.demo.persistance.IArtistRepository;
import com.example.demo.persistance.IBookingRequestRepository;
import com.example.demo.persistance.IStageRepository;


@Service
public class BookingRequestService {
	
	@Autowired
	public IBookingRequestRepository repo;
	
	@Autowired
	public IArtistRepository artistRepo;
	
	@Autowired
	public IStageRepository stageRepo;
	
	public boolean update(BookingRequest a, long id) {
		BookingRequest bookingRequest = repo.findById(id).get();
		bookingRequest.setDay(a.getDay());
		bookingRequest.setTimeSlot(a.getTimeSlot());
		bookingRequest.setHasVj(a.isHasVj());
		bookingRequest.setNeedVj(a.isNeedVj());
		bookingRequest.setStatus(a.getStatus());
		bookingRequest.setSynopsis(a.getSynopsis());
		bookingRequest.getArtist().getId(); //Deze moet wel weer aan, of niet, maar dit is commented zodat postman werkt
//		bookingRequest.getStage().getId(); 
		
		repo.save(bookingRequest);
		return true;
	}
	
	public void save() {
		repo.save(new BookingRequest());
	}
	
	public boolean save(BookingRequest a) {
		repo.save(a);
		return true;
	}
	
	public boolean save(BookingRequest a, long aid, long sid) {
		//get artist
		//get stage
		//a.set artist artist
		
		a.setArtist(artistRepo.findById(aid).get());
		a.setStage(stageRepo.findById(sid).get());
		
		
		repo.save(a);
		return true;
	}



	public BookingRequest findById(long id) {
		return repo.findById(id).get();
	}
	

	public List<BookingRequest> findAll() {
		return repo.findAll();
	}
	
	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}
	public List<BookingRequest> filterBookingRequest(long id) {
		 Artist artist = artistRepo.findById(id).get();
				 List<BookingRequest> brs = repo.findByArtist(artist);
				 return brs;
	}
}
