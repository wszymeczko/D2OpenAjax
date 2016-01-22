package org.wk.D2OpenAjax.client;

import org.wk.D2OpenAjax.client.callbacks.MessageCallback;

import com.google.gwt.core.client.EntryPoint;

public class D2Widget implements EntryPoint {
	
	@Override
	public void onModuleLoad() {
		/*D2Hub d2Hub = new D2Hub();
		d2Hub.connect();
		

		System.out.println("uid: " + d2Hub.getContextUid());


		d2Hub.disconnect();
		//WKJs.execJs("WKD2Widget!");
		
		D2OpenAjaxHubWrapper hubWrapper = new D2OpenAjaxHubWrapper();
		hubWrapper.init();
		hubWrapper.connectHub(new ConnectCompletedCallback());*/
		
		D2OpenAjaxHubWrapper hubWrapper = new D2OpenAjaxHubWrapper();
		hubWrapper.init();
		hubWrapper.connectHub(new MessageCallback());
	}

}
