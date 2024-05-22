package com.zahar.users.api;

import com.zahar.users.api.domain.Subscriber;
import com.zahar.users.api.domain.User;

/**
 * Helper class that provides consistent ID for {@link Subscriber}, and
 * {@link User} which includes Admin/Super.
 * 
 * @author zahar
 */
public class IdGenerator {

	/**
	 * ID
	 */
	private static Long ID = 0L;

	/**
	 * Generates a sequential ID
	 * @return id
	 */
	public static Long generateId() {
		return ++ID;
	}

}
