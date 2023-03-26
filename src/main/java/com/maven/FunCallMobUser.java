package com.maven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FunCallMobUser extends Parent {

	public void callMobUser() throws Exception {

		try {
			// Setting time
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			System.out.print("*** Testing for Guest user on Mobile ***     " + time + "\n");

			// Sign in mobile function call
			SignInMob sim = new SignInMob();
			sim.signInMob();
			Boolean signedmob = sim.setterSignInMob();

			// Sign up mobile function call
			SignUpMob spm = new SignUpMob();

			if (signedmob == true) {

				spm.signUpMob();
			}

			// Search product mobile function call
			SearchProdMob sm = new SearchProdMob();
			sm.searchMob();

			// Apply filters desktop function call
			FiltersMobile fm = new FiltersMobile();
			fm.filterMob();

			// Find product function call
			FindProdMob fpm = new FindProdMob();
			fpm.findProductMob();

			// Add to cart mobile function call
			AddToCartMob acm = new AddToCartMob();
			acm.cartAddMob();

			// Edit cart mobile function call
			EditCartMob ecm = new EditCartMob();
			ecm.editCartMob();

			// Proceed to checkout mobile function call
			CheckoutMob cm = new CheckoutMob();
			cm.proceedCheckoutMob();

			// Sign in on check out mobile function call
			int signedUpMob = spm.setterSignUpMob();

			if (signedUpMob == 1) {

				// New user details mobile function call
				NewUserDetailsMob ndm = new NewUserDetailsMob();
				ndm.newDetailsMob();
			}

			if (signedUpMob == 2) {

				GuestDetailsMob gdm = new GuestDetailsMob();
				gdm.guestDetailsMob();

			}

			// Select shipping mobile function call
			SelectShippingMob ssm = new SelectShippingMob();
			ssm.shippingMob();

//			// Coupon code function call
//			CouponCodeMob ccm = new CouponCodeMob();
//			ccm.addCouponMob();

			// Pay by card mobile function call
			PayByCardMob pbm = new PayByCardMob();
			pbm.cardPayMob();

			// Quitting the web driver, which will close the window
			driver.quit();
			Thread.sleep(2000);

		} catch (Exception e) {
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}

	}
}