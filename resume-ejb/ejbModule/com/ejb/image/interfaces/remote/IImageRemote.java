package com.ejb.image.interfaces.remote;

import javax.ejb.Remote;

@Remote(IImageRemote.class)
public interface IImageRemote {
	public boolean insertImage(String name,
			String description, 
			String location, 
			String settings, 
			String cUser);
}
