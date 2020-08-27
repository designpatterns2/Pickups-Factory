/**
 *  PacDasher application. For explanation of this class, see below. 
 *  Copyright (c) 2003-2005 James McCabe. Email: code@oranda.com 
 *  http://www.oranda.com/java/pacdasher/
 * 
 *  PacDasher is free software under the Aladdin license (see license  
 *  directory). You are free to play, copy, distribute, and modify it
 *  except for commercial purposes. You may not sell this code, or
 *  compiled versions of it, or anything which incorporates either of these.
 * 
 */
 
package com.oranda.pacdasher.uimodel;

import com.oranda.pacdasher.uimodel.visualobjects.*;
import com.oranda.util.Str;

public class VisualObjectFactory
{

    VisualObjectFactory() {}
    
	static VisualObject construct(Class visualObjectClass)
	{
		VisualObject visualObject = null;
		
		try
		{
	        visualObject = (VisualObject) visualObjectClass.newInstance();
		}
		catch (Exception e)
		{
			Const.logger.severe("Could not instantiate " 
                    + visualObjectClass.getName() + Str.getStackTraceAsStr(e));
		}
		return visualObject;
	}

	public static Fruit getFruit(Class fruit) {
		if(fruit.equals(Cherry.class)) {
			return new Cherry();
		} else if(fruit.equals(Apple.class)) {
			return new Apple();
		} else if(fruit.equals(Kiwi.class)) {
			return new Kiwi();
		} else if(fruit.equals(Peach.class)) {
			return new Peach();
		} else if(fruit.equals(Strawberry.class)) {
			return new Strawberry();
		} else return null;
	}
}