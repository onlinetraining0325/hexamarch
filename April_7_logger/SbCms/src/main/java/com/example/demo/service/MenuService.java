package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Menu;
import com.example.demo.repo.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> showMenu() {
		return menuRepository.findAll();
	}
	
	public Menu searchByMenuId(int id) {
		Menu menuFound = menuRepository.findById(id).get();
		if (menuFound == null) {
			throw new ResourceNotFoundException("Menu Not Exists with id " +id);
		}
		return menuFound;
	}
}
