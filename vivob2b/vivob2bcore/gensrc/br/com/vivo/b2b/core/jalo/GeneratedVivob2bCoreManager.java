/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12 de ago de 2022 12:18:15                  ---
 * ----------------------------------------------------------------
 */
package br.com.vivo.b2b.core.jalo;

import br.com.vivo.b2b.core.constants.Vivob2bCoreConstants;
import br.com.vivo.b2b.core.jalo.ApparelProduct;
import br.com.vivo.b2b.core.jalo.ApparelSizeVariantProduct;
import br.com.vivo.b2b.core.jalo.ApparelStyleVariantProduct;
import br.com.vivo.b2b.core.jalo.DefaultIdentifications;
import br.com.vivo.b2b.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Vivob2bCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVivob2bCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cpf", AttributeMode.INITIAL);
		tmp.put("rg", AttributeMode.INITIAL);
		tmp.put("address", AttributeMode.INITIAL);
		tmp.put("currency", AttributeMode.INITIAL);
		tmp.put("language", AttributeMode.INITIAL);
		tmp.put("defaultIdentifications", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx, final Customer item)
	{
		return (Address)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final Customer item)
	{
		return getAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Customer item, final Address value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Customer item, final Address value)
	{
		setAddress( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.cpf</code> attribute.
	 * @return the cpf
	 */
	public String getCpf(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.CPF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.cpf</code> attribute.
	 * @return the cpf
	 */
	public String getCpf(final Customer item)
	{
		return getCpf( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.cpf</code> attribute. 
	 * @param value the cpf
	 */
	public void setCpf(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.CPF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.cpf</code> attribute. 
	 * @param value the cpf
	 */
	public void setCpf(final Customer item, final String value)
	{
		setCpf( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Vivob2bCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Vivob2bCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Vivob2bCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public DefaultIdentifications createDefaultIdentifications(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Vivob2bCoreConstants.TC.DEFAULTIDENTIFICATIONS );
			return (DefaultIdentifications)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DefaultIdentifications : "+e.getMessage(), 0 );
		}
	}
	
	public DefaultIdentifications createDefaultIdentifications(final Map attributeValues)
	{
		return createDefaultIdentifications( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Vivob2bCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx, final Customer item)
	{
		return (Currency)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final Customer item)
	{
		return getCurrency( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Customer item, final Currency value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Customer item, final Currency value)
	{
		setCurrency( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.defaultIdentifications</code> attribute.
	 * @return the defaultIdentifications
	 */
	public DefaultIdentifications getDefaultIdentifications(final SessionContext ctx, final Customer item)
	{
		return (DefaultIdentifications)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.DEFAULTIDENTIFICATIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.defaultIdentifications</code> attribute.
	 * @return the defaultIdentifications
	 */
	public DefaultIdentifications getDefaultIdentifications(final Customer item)
	{
		return getDefaultIdentifications( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.defaultIdentifications</code> attribute. 
	 * @param value the defaultIdentifications
	 */
	public void setDefaultIdentifications(final SessionContext ctx, final Customer item, final DefaultIdentifications value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.DEFAULTIDENTIFICATIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.defaultIdentifications</code> attribute. 
	 * @param value the defaultIdentifications
	 */
	public void setDefaultIdentifications(final Customer item, final DefaultIdentifications value)
	{
		setDefaultIdentifications( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Vivob2bCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx, final Customer item)
	{
		return (Language)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final Customer item)
	{
		return getLanguage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Customer item, final Language value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Customer item, final Language value)
	{
		setLanguage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.rg</code> attribute.
	 * @return the rg
	 */
	public String getRg(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, Vivob2bCoreConstants.Attributes.Customer.RG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.rg</code> attribute.
	 * @return the rg
	 */
	public String getRg(final Customer item)
	{
		return getRg( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.rg</code> attribute. 
	 * @param value the rg
	 */
	public void setRg(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, Vivob2bCoreConstants.Attributes.Customer.RG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.rg</code> attribute. 
	 * @param value the rg
	 */
	public void setRg(final Customer item, final String value)
	{
		setRg( getSession().getSessionContext(), item, value );
	}
	
}
