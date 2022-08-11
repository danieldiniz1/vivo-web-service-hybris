/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package br.com.vivo.b2b.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import br.com.vivo.b2b.constants.Vivob2bwebservicesConstants;

public class Vivob2bwebservicesManager extends GeneratedVivob2bwebservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger( Vivob2bwebservicesManager.class.getName() );
	
	public static final Vivob2bwebservicesManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Vivob2bwebservicesManager) em.getExtension(Vivob2bwebservicesConstants.EXTENSIONNAME);
	}
	
}
