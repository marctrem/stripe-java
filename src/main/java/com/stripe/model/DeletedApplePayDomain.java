package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeletedApplePayDomain extends StripeObject implements DeletedStripeObject {
	String id;
	Boolean deleted;
}
