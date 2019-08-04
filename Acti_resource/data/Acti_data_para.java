package data;

import org.testng.annotations.DataProvider;

public class Acti_data_para {
	@DataProvider(name = "Login_UNPW")
	public static Object[][] unpw_Holder() {
		return new Object[][] { { "raghav", "aloshi" }, { "karthik", "ven" }, { "admin", "manager" } };

	}

}
