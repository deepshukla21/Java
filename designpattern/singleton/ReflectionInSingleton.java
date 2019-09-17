package com.bridgelabz.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionInSingleton {
	public static void main(String[] args) {
		LazyInitialization objectOne = LazyInitialization.getInstance();
		LazyInitialization objectTwo  = null;
		 try {
	            Constructor[] constructors = LazyInitialization.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                objectTwo  = (LazyInitialization) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		System.out.println(objectOne .hashCode());
		System.out.println(objectTwo .hashCode());
		
	}

}
