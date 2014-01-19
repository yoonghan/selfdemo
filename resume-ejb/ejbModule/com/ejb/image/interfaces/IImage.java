package com.ejb.image.interfaces;

public interface IImage {

	public boolean insertImage( 
			String name, 
			String description,
			String location,
			String settings,
			String cUser);
}
