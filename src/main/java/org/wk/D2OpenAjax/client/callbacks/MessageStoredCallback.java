package org.wk.D2OpenAjax.client.callbacks;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

public class MessageStoredCallback {

	public void onMessageStored(String channel, String message) {
		console("onMessageStored: " + channel + " " + message);
	}
}
