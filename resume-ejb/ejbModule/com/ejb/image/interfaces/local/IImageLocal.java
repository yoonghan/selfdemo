package com.ejb.image.interfaces.local;

import javax.ejb.Local;

@Local(IImageLocal.class)
public interface IImageLocal {
	public boolean insertImage(String name,
			String description, 
			String location, 
			String settings, 
			String cUser);
}
