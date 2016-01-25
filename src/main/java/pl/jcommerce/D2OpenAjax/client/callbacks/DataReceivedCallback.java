package pl.jcommerce.D2OpenAjax.client.callbacks;

import com.google.gwt.core.client.JavaScriptObject;

import pl.jcommerce.D2OpenAjax.client.D2OpenAjaxMessageWrapper;

public abstract class DataReceivedCallback {

	public void onDataReceived(String channel, JavaScriptObject message) {
		onDataReceived(channel, new D2OpenAjaxMessageWrapper(message));
	}

	public abstract void onDataReceived(String channel, D2OpenAjaxMessageWrapper message);
}
