package com.maven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FunCallDeskUser extends Parent {

	public void callDeskUser() throws Exception {

		try {
			// Setting time
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			System.out.print("*** Testing for Registered user on Desktop ***     "+time+"\n");
			
			// Sign in desktop function call
			SignInDesk sid = new SignInDesk();
			sid.signInDesk();
			Boolean signedDesk = sid.setterSignInDesk();

			// Sign up desktop function call
			SignUpDesk sud = new SignUpDesk();

			if (signedDesk == true) {

				sud.signUpDesk();
			}

			// Search product desktop function call
			SearchProdDesk spd = new SearchProdDesk();
			spd.searchDesk();

			// Apply filters desktop function call
			FiltersDesk fd = new FiltersDesk();
			fd.filterDesk();

			// Find product desktop function call
			FindProdDesk fpd = new FindProdDesk();
			fpd.findProductDesk();

			// Add to cart desktop function call
			AddToCartDesk acd = new AddToCartDesk();
			acd.cartAddDesk();

			// Edit cart desktop function call
			EditCartDesk ecd = new EditCartDesk();
			ecd.editCartDesk();

			// Proceed to checkout desktop function call
			CheckoutDesk cd = new CheckoutDesk();
			cd.proceedCheckoutDesk();

			// Signed up user details on check out desktop function call
			int signedUp = sud.setterSignUpDesk();

			if (signedUp == 1) {

				// New user details desktop function call
				NewUserDetailsDesk ndd = new NewUserDetailsDesk();
				ndd.newDetailsDesk();

				// Select shipping for new user desktop function call
				ShippingDeskNewUser sdn = new ShippingDeskNewUser();
				sdn.shippingDeskNewUser();

			}

			if (signedUp == 2) {

				GuestDetailsDesk gdd = new GuestDetailsDesk();
				gdd.guestDetailsDesk();

			}

			// Select ship desktop function call
			SelectShippingDesk ss = new SelectShippingDesk();
			ss.shippingDesk();

			// Adding coupon code		
			CouponCodeDesk ccd = new CouponCodeDesk();
			ccd.addCouponDesk();

			// Pay by card desktop function call
			PayByCardDesk pbd = new PayByCardDesk();
			pbd.cardPayDesk();

			// Quitting the web driver, which will close the window
			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
			
		}

	}
}
