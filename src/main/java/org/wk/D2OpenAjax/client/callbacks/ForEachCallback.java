package org.wk.D2OpenAjax.client.callbacks;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

public class ForEachCallback {

	public void onKey(String key, String value, boolean hasNext) {
		console("onKey: " + key + " " + value + " " + hasNext);
	}
}
