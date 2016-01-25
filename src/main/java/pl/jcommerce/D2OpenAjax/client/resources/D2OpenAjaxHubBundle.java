package pl.jcommerce.D2OpenAjax.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface D2OpenAjaxHubBundle extends ClientBundle {
	D2OpenAjaxHubBundle INSTANCE = GWT.create(D2OpenAjaxHubBundle.class);
	
	@Source("D2-OAH.js")
	TextResource d2OpenAjaxHub();

	@Source("OpenAjaxManagedHub-all.js")
	TextResource d2OpenAjaxManagedHub();
}
