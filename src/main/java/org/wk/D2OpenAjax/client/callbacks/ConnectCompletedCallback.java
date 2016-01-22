package org.wk.D2OpenAjax.client.callbacks;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

import org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper;

public class ConnectCompletedCallback {

	public void onConnectCompleted(D2OpenAjaxHubWrapper hubWrapper, boolean success, boolean error) {
		console("onConnectCompleted: " + success + " " + error);
	}

	public void onInit(String message) {
		console("onInit: " + message);
	}

	public void onActive(boolean flag) {
		console("onActive: " + flag);
	}
}
