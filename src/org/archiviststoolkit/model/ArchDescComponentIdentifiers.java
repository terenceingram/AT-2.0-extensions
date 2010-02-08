package org.archiviststoolkit.model;

import org.archiviststoolkit.mydomain.DomainObject;
import org.archiviststoolkit.structure.ExcludeFromDefaultValues;
import org.archiviststoolkit.structure.IncludeInApplicationConfiguration;


/**
 * 
 * @author tingram
 *
 */
public class ArchDescComponentIdentifiers extends DomainObject implements Comparable {
	
	public static final String PROPERTYNAME_COMPONENT_IDENTIFIER = "componentIdentifier";
	public static final String PROPERTYNAME_IDENTIFIER_TYPE = "identifierType";
	public static final String PROPERTYNAME_IDENTIFIER_LABEL = "identifierLabel";
	
	@IncludeInApplicationConfiguration
	@ExcludeFromDefaultValues
	private Long archDescComponentId;
	
	@IncludeInApplicationConfiguration
	@ExcludeFromDefaultValues
	private String componentIdentifier;
	
	@IncludeInApplicationConfiguration
	@ExcludeFromDefaultValues
	private String identifierType;
	
	@IncludeInApplicationConfiguration
	@ExcludeFromDefaultValues
	private String identifierLabel;
	
	private ResourcesComponents resourceComponent;
	private Resources resource;
	
	public ArchDescComponentIdentifiers() {
	}
	
	public ArchDescComponentIdentifiers(Resources resource) {
		this.resource = resource;
	}
	
	
	@Override
	public Long getIdentifier() {
		return getArchDescComponentId();
	}

	@Override
	public void setIdentifier(Long identifier) {
		setArchDescComponentId(identifier);
	}
	
	
	// Getters and Setters
	
	public Long getArchDescComponentId() {
		return archDescComponentId;
	}

	public void setArchDescComponentId(Long archDescComponentId) {
		this.archDescComponentId = archDescComponentId;
	}

	public String getComponentIdentifier() {
		return componentIdentifier;
	}

	public void setComponentIdentifier(String componentIdentifier) {
		this.componentIdentifier = componentIdentifier;
	}

	public String getIdentifierType() {
		return identifierType;
	}

	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}

	public String getIdentifierLabel() {
		return identifierLabel;
	}

	public void setIdentifierLabel(String identifierLabel) {
		this.identifierLabel = identifierLabel;
	}

	public ResourcesComponents getResourceComponent() {
		return resourceComponent;
	}

	public void setResourceComponent(ResourcesComponents resourceComponent) {
		this.resourceComponent = resourceComponent;
	}

	public Resources getResource() {
		return resource;
	}

	public void setResource(Resources resource) {
		this.resource = resource;
	}
	
	

}
