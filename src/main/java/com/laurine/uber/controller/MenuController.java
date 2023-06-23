package com.laurine.uber.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurine.uber.entity.MenuEntity;
import com.laurine.uber.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	private MenuService menuService;
	
	
	public MenuController(MenuService menuService) {
		super();
		this.menuService = menuService;
	}


	@GetMapping
	public List<MenuEntity> getAllMenu(){
		return menuService.getAllMenu();
	}
	@GetMapping("/{idMenu}")
	public MenuEntity getMenuById(@PathVariable Long idMenu) {
		return menuService.getMenuById(idMenu);
	}
	@PostMapping
	public MenuEntity addMenu(@RequestBody MenuEntity menu) {
		return menuService.addMenu(menu);
	}
	
	@PostMapping("/{idMenu}")
	public MenuEntity updatedMenu(@PathVariable Long idMenu, @RequestBody MenuEntity updatedMenu) {
		return menuService.updatedMenu(idMenu, updatedMenu);
	}
	
	@DeleteMapping("/{idMenu}")
	public void deleteMenu(@PathVariable Long idMenu) {
		menuService.deleteMenu(idMenu);
	}
}
