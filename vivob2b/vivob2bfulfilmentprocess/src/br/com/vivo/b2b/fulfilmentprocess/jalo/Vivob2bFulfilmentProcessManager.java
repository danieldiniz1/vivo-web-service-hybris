/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.b2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import br.com.vivo.b2b.fulfilmentprocess.constants.Vivob2bFulfilmentProcessConstants;

public class Vivob2bFulfilmentProcessManager extends GeneratedVivob2bFulfilmentProcessManager
{
	public static final Vivob2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Vivob2bFulfilmentProcessManager) em.getExtension(Vivob2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
