package com.laurine.uber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laurine.uber.entity.MenuEntity;
import com.laurine.uber.repository.MenuRepository;

@Service
public class MenuService {
	private MenuRepository menuRepository;

	public MenuService(MenuRepository menuRepository) {
		super();
		this.menuRepository = menuRepository;
	}
	
	public List<MenuEntity> getAllMenu(){
		return menuRepository.findAll();
	}
	
	public MenuEntity getMenuById(Long idMenu) {
		return menuRepository.findById(idMenu)
				.orElseThrow(() -> new RuntimeException("Livraison not found"));
		
	}
	public MenuEntity addMenu(MenuEntity menu) {
		return menuRepository.save(menu);
	}
	
	public MenuEntity updatedMenu(Long idMenu, MenuEntity updatedMenu){
		MenuEntity menu = getMenuById(idMenu);
		menu.setName(updatedMenu.getName());
		menu.setDescriotion(updatedMenu.getDescriotion());
		
		return menuRepository.save(menu);
		
	}
	
	public void deleteMenu(Long idMenu) {
		menuRepository.deleteById(idMenu);
	}

	

}
