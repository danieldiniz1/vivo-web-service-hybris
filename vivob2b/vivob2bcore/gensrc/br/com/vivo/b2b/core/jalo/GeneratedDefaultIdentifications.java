/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25 de ago de 2022 11:47:35                  ---
 * ----------------------------------------------------------------
 */
package br.com.vivo.b2b.core.jalo;

import br.com.vivo.b2b.core.constants.Vivob2bCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DefaultIdentifications}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDefaultIdentifications extends GenericItem
{
	/** Qualifier of the <code>DefaultIdentifications.defaultIdentificationNumber</code> attribute **/
	public static final String DEFAULTIDENTIFICATIONNUMBER = "defaultIdentificationNumber";
	/** Qualifier of the <code>DefaultIdentifications.defaultIdentificationType</code> attribute **/
	public static final String DEFAULTIDENTIFICATIONTYPE = "defaultIdentificationType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFAULTIDENTIFICATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(DEFAULTIDENTIFICATIONTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefaultIdentifications.defaultIdentificationNumber</code> attribute.
	 * @return the defaultIdentificationNumber
	 */
	public String getDefaultIdentificationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEFAULTIDENTIFICATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefaultIdentifications.defaultIdentificationNumber</code> attribute.
	 * @return the defaultIdentificationNumber
	 */
	public String getDefaultIdentificationNumber()
	{
		return getDefaultIdentificationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefaultIdentifications.defaultIdentificationNumber</code> attribute. 
	 * @param value the defaultIdentificationNumber
	 */
	public void setDefaultIdentificationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEFAULTIDENTIFICATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefaultIdentifications.defaultIdentificationNumber</code> attribute. 
	 * @param value the defaultIdentificationNumber
	 */
	public void setDefaultIdentificationNumber(final String value)
	{
		setDefaultIdentificationNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefaultIdentifications.defaultIdentificationType</code> attribute.
	 * @return the defaultIdentificationType
	 */
	public String getDefaultIdentificationType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEFAULTIDENTIFICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefaultIdentifications.defaultIdentificationType</code> attribute.
	 * @return the defaultIdentificationType
	 */
	public String getDefaultIdentificationType()
	{
		return getDefaultIdentificationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefaultIdentifications.defaultIdentificationType</code> attribute. 
	 * @param value the defaultIdentificationType
	 */
	public void setDefaultIdentificationType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEFAULTIDENTIFICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefaultIdentifications.defaultIdentificationType</code> attribute. 
	 * @param value the defaultIdentificationType
	 */
	public void setDefaultIdentificationType(final String value)
	{
		setDefaultIdentificationType( getSession().getSessionContext(), value );
	}
	
}
