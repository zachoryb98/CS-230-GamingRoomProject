package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> {
	@Override
	public boolean authorize(GameUser user, String role) {

		// Return the role of the user and allow access if they have the right roles
		return user.getRoles() != null && user.getRoles().contains(role);
	}
}