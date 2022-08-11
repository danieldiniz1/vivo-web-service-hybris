/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.b2b.services;

import de.hybris.platform.core.model.user.UserModel;

import java.util.Collection;


public interface SampleUserServices
{
	UserModel getUserById(String id);

	Collection<UserModel> getUsers();
}
