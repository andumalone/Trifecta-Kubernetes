package com.example.demo.entiteien;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(scale = 2, precision = 8)
	private BigDecimal compensation;

	@OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
	private BookingRequest bookingRequest;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCompensation() {
		return compensation;
	}

	public void setCompensation(BigDecimal compensation) {
		this.compensation = compensation;
	}

	public BookingRequest getBookingRequest() {
		return bookingRequest;
	}

	public void setBookingRequest(BookingRequest bookingRequest) {
		this.bookingRequest = bookingRequest;
	}
	
	
}
