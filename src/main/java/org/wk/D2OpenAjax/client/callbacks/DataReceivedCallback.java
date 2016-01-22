package org.wk.D2OpenAjax.client.callbacks;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

import org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper;

import com.google.gwt.core.client.JavaScriptObject;

public class DataReceivedCallback {

	public void onDataReceived(String channel, JavaScriptObject message) {
		onDataReceived(channel, new D2OpenAjaxMessageWrapper(message));
	}

	public void onDataReceived(String channel, D2OpenAjaxMessageWrapper message) {
		console("onDataReceived: " + channel);
	}
}
