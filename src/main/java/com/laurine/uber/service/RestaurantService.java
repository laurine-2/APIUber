package com.laurine.uber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurine.uber.entity.RestaurantEntity;
import com.laurine.uber.repository.RestaurantRepository;

@Service
public class RestaurantService {
	private RestaurantRepository restaurantRepository;

	public RestaurantService(RestaurantRepository restaurantRepository) {
		super();
		this.restaurantRepository = restaurantRepository;
	}
	
	public List<RestaurantEntity> getAllRestaurant(){
		return restaurantRepository.findAll();
	}
	
	public RestaurantEntity getRestaurantById(Long idRestaurant) {
		return restaurantRepository.findById(idRestaurant)
				.orElseThrow(() -> new RuntimeException("Restaurant not found"));
	}
	
	public RestaurantEntity addRestaurant(RestaurantEntity restaurant) {
		return restaurantRepository.save(restaurant);
	}
	
	public RestaurantEntity updateRestaurant(Long idRestaurant, RestaurantEntity updatedRestaurant) {
		RestaurantEntity restaurant = getRestaurantById(idRestaurant);
        restaurant.setIdEvolution(updatedRestaurant.getIdEvolution());
        restaurant.setIdClient(updatedRestaurant.getIdClient());
        restaurant.setContenu(updatedRestaurant.getContenu());
        restaurant.setName(updatedRestaurant.getName());
        restaurant.setHoraire(updatedRestaurant.getHoraire());
        restaurant.setSpecialiteRestaurant(updatedRestaurant.getSpecialiteRestaurant());
        restaurant.setPhone(updatedRestaurant.getPhone());
        restaurant.setAddress(updatedRestaurant.getAddress());
        restaurant.setEmail(updatedRestaurant.getEmail());
        restaurant.setTimestamp(updatedRestaurant.getTimestamp());
        return restaurantRepository.save(restaurant);
	}
	
	public void deleteRestaurant(Long idRestaurant) {
		restaurantRepository.deleteById(idRestaurant);
	}

}
