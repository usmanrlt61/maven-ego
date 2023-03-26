package com.maven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FunCallDeskGuestUS extends Parent {

	public void callDeskGuestUS() throws Exception {

		try {
			// Setting time
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
			String time = dateFormat.format(new Date());
			System.out.print("*** Testing for Guest user on Desktop ***     " + time +" \n");
			
			// search product desktop function call
			SearchProdDesk spd = new SearchProdDesk();
			spd.searchDesk();

			// Apply filters desktop function call
			FiltersDesk fas = new FiltersDesk();
			fas.filterDesk();

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

			// Sign in on check out desktop function call
			GuestDetailsDesk gdd = new GuestDetailsDesk();
			gdd.guestDetailsDesk();

			// Select ship desktop function call
			ShippingDeskGuest sdn = new ShippingDeskGuest();
			sdn.shippingDeskGuest();

			// Coupon code desktop function call
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
