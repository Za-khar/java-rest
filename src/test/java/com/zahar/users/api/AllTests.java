package com.zahar.users.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.zahar.users.api.domain.SubscriberTest;
import com.zahar.users.api.domain.UserTest;
import com.zahar.users.api.service.SessionServiceTest;
import com.zahar.users.api.service.SubscriberServiceTest;
import com.zahar.users.api.service.UserServiceTest;

/**
 * Test Suite. 
 * Tests cover all layers of the application Domain Controllers and Services.
 * @author zahar
 */
@RunWith(Suite.class)
@SuiteClasses({ 
	UserTest.class, 
	SubscriberTest.class, 
	SessionServiceTest.class,
	UserServiceTest.class,
	SubscriberServiceTest.class })
public class AllTests {

}
