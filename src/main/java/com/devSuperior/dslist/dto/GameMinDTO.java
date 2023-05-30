package com.devSuperior.dslist.dto;

import com.devSuperior.dslist.etities.Game;
import com.devSuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}

	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
