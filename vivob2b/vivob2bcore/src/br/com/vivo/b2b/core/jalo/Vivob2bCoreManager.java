package br.com.vivo.b2b.core.jalo;

import br.com.vivo.b2b.core.constants.Vivob2bCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class Vivob2bCoreManager extends GeneratedVivob2bCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Vivob2bCoreManager.class.getName() );
	
	public static final Vivob2bCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Vivob2bCoreManager) em.getExtension(Vivob2bCoreConstants.EXTENSIONNAME);
	}
	
}
