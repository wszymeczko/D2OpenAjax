package org.wk.D2OpenAjax.client.callbacks;

import static org.wk.D2OpenAjax.client.D2OpenAjaxConstants.*;
import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

import org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper;
import org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper;

public class MessageCallback extends ConnectCompletedCallback {

	@Override
	public void onConnectCompleted(D2OpenAjaxHubWrapper hubWrapper, boolean success, boolean error) {
		console("onConnectCompleted (MessageCallback): " + success + " " + error);

		D2OpenAjaxMessageWrapper messageWrapper = new D2OpenAjaxMessageWrapper();
		messageWrapper.put("oam_id", "");
		messageWrapper.put("list", "a_status"+D2OpenAjaxMessageWrapper.PARAM_SPLIT_SEPARATOR+"r_object_type");
		messageWrapper.put("a_status", "Draft");
		messageWrapper.put("r_object_type", "dm_document");
		messageWrapper.put("config", "QF HR a_status");
		messageWrapper.put("eService", "Search");
		messageWrapper.put("eMethod", "runQueryFormSearch");
		messageWrapper.put("rType", "EVENT");
		messageWrapper.put("rAction",
				D2_ACTION_SEARCH_DOCUMENT
				+ D2OpenAjaxMessageWrapper.PARAM_COLON
				+ D2OpenAjaxMessageWrapper.PARAM_ID
				+ D2OpenAjaxMessageWrapper.PARAM_EQ
				+ "node_last_search");
				//"D2_ACTION_SEARCH_DOCUMENT::oam_id==node_last_search");

		messageWrapper.each(new ForEachCallback(), messageWrapper, true);
	
		hubWrapper.sendMessage("D2_ACTION_EXECUTE", messageWrapper);
	
/*
		messageWrapper.put("oam_id", "090003e88001310a");

		hubWrapper.sendMessage("D2_ACTION_OPEN_VD", messageWrapper);
*/
	}
}
