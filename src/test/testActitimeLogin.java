package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Pom.ActitimeLogin;
import generics.BaseTest;

public class testActitimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		ActitimeLogin log=new ActitimeLogin(driver);
		log.loginActitime();
	}

}
