package com.huucon.securingweb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_menu;
	private String ten_menu;
	private boolean isActive;
	private String href;

}
