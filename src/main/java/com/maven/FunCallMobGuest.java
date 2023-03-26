package com.maven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FunCallMobGuest extends Parent {

	public void callMobGuest() throws Exception {

		try {
			// Setting time
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			System.out.print("*** Testing for Guest user on Mobile ***     " + time + "\n");

			// Search product mobile function call
			SearchProdMob spm = new SearchProdMob();
			spm.searchMob();

			// Apply filters desktop function call
			FiltersMobile fm = new FiltersMobile();
			fm.filterMob();

			// Find product mobile function call
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
			GuestDetailsMob gdm = new GuestDetailsMob();
			gdm.guestDetailsMob();

			// Select ship mobile function call
			SelectShippingMob ssm = new SelectShippingMob();
			ssm.shippingMob();

			// Coupon code mobile function call
			CouponCodeMob ccm = new CouponCodeMob();
			ccm.addCouponMob();

			// Pay by card mobile function call
			PayByCardMob pbm = new PayByCardMob();
			pbm.cardPayMob();

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
