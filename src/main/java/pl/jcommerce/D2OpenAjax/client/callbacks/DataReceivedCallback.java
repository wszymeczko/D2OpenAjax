package pl.jcommerce.D2OpenAjax.client.callbacks;

import com.google.gwt.core.client.JavaScriptObject;

import pl.jcommerce.D2OpenAjax.client.D2OpenAjaxMessageWrapper;

public class DataReceivedCallback {

	public void onDataReceived(String channel, JavaScriptObject message) {
		onDataReceived(channel, new D2OpenAjaxMessageWrapper(message));
	}

	public void onDataReceived(String channel, D2OpenAjaxMessageWrapper message) {
	}
}
