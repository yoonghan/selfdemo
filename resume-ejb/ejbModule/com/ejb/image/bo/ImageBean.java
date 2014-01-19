package com.ejb.image.bo;


import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.image.entity.Image;
import com.ejb.image.interfaces.local.IImageLocal;
import com.ejb.image.interfaces.remote.IImageRemote;

@Stateless
@Remote(IImageRemote.class)
@Local(IImageLocal.class)
public class ImageBean implements IImageRemote, IImageLocal {

	@PersistenceContext(unitName = "primary")
    private EntityManager em;
	
	@Override
	public boolean insertImage(String name,
			String description, 
			String location, 
			String settings, 
			String cUser) {
		
		Image image = new Image();
		image.setName(name);
		image.setDescription(description);
		image.setLocation(location);
		image.setSettings(settings);
		image.setCUser(cUser);
		
		try{

			em.persist(image);
			em.flush();

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
