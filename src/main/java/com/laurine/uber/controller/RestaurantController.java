package com.laurine.uber.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.RestaurantEntity;
import com.laurine.uber.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	private RestaurantService restaurantService;

	public RestaurantController(RestaurantService restaurantService) {
		super();
		this.restaurantService = restaurantService;
	}
	
	@GetMapping
	public List<RestaurantEntity> getAllRestaurants(){
		return restaurantService.getAllRestaurant();
	}
	
	@GetMapping("/{idRestaurant}")
	public RestaurantEntity getRestaurantById(@PathVariable Long idRestaurant) {
		return restaurantService.getRestaurantById(idRestaurant);
	}
	
	@PostMapping
	public RestaurantEntity addRestaurant(@RequestBody RestaurantEntity restaurant) {
		return restaurantService.addRestaurant(restaurant);
	}
	
	@PutMapping("/{idRestaurant}")
	public RestaurantEntity updateRestaurant(@PathVariable Long idRestaurant, @RequestBody RestaurantEntity updatedRestaurant) {
		return restaurantService.updateRestaurant(idRestaurant, updatedRestaurant);
	}
	
	@DeleteMapping("/{idRestaurant}")
	public void deleteRestaurant(@PathVariable Long idRestaurant) {
		restaurantService.deleteRestaurant(idRestaurant);
	}

}
