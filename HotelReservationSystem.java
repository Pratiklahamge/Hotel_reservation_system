package HotelReservation.com.HotelReservation;
import java.util.ArrayList;
import java.util.List;
/**
 * Purpose  - To build a Hotel Reservation System
 */

public class HotelReservationSystem {
	  List<Hotel> hotels = new ArrayList<>();
	     
	    public boolean addHotel(Hotel hotel) {
	        return hotels.add(hotel);
	    }
	}
/**
 * This method is used to add hotel to the Hotel List
 */