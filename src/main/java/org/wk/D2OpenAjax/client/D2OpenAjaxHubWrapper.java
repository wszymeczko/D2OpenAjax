package org.wk.D2OpenAjax.client;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

import org.wk.D2OpenAjax.client.callbacks.ConnectCompletedCallback;
import org.wk.D2OpenAjax.client.callbacks.DataReceivedCallback;
import org.wk.D2OpenAjax.client.callbacks.MessageStoredCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class D2OpenAjaxHubWrapper {
	private JavaScriptObject d2OpenAjaxHub;
	
	public D2OpenAjaxHubWrapper() {
	}
	
	public D2OpenAjaxHubWrapper(JavaScriptObject d2OpenAjaxHub) {
		this.d2OpenAjaxHub = d2OpenAjaxHub;
	}
	
	public void init() {
		if (d2OpenAjaxHub == null)
			d2OpenAjaxHub = getD2OpenAjaxHub();
	}
	
	private native JavaScriptObject getD2OpenAjaxHub() /*-{
		return new $wnd.D2OpenAjaxHub();
	}-*/;
	
	public JavaScriptObject getJSObject() {
		return d2OpenAjaxHub;
	}
	
	public native void connectHub(ConnectCompletedCallback connectCallback) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		var javaThis = this;
		d2Hub.connectHub(connectCompleted, onInitWidget, onActiveWidget);
		
		function connectCompleted(hubClient, success, error) {
			connectCallback.@org.wk.D2OpenAjax.client.callbacks.ConnectCompletedCallback::onConnectCompleted(Lorg/wk/D2OpenAjax/client/D2OpenAjaxHubWrapper;ZZ)(javaThis, success, error);
		}

		function onInitWidget(message) {
			connectCallback.@org.wk.D2OpenAjax.client.callbacks.ConnectCompletedCallback::onInit(Ljava/lang/String;)(message);
		}

		function onActiveWidget(bActiveFlag) {
			connectCallback.@org.wk.D2OpenAjax.client.callbacks.ConnectCompletedCallback::onActive(Z)(bActiveFlag);
		}
	}-*/;
	
	public native void disconnectHub() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.disconnectHub();
	}-*/;

	public native String getContextUid() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		return d2Hub.getContextUid();
	}-*/;
	
	public native String getWidgetType() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		return d2Hub.getWidgetType();
	}-*/;
	
	public native String getWidgetId() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		return d2Hub.getWidgetId();
	}-*/;
	
	public native void setActive() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.setActive();
	}-*/;
	
	public native boolean isActive() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		return d2Hub.isActive();
	}-*/;
	
	public native void sendMessage(String channel, D2OpenAjaxMessageWrapper message) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		var d2Message = message.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Hub.sendMessage(channel, d2Message);
	}-*/;
	
	public void sendMessages(String[] channels, D2OpenAjaxMessageWrapper message) {
		JsArrayString jsChannels = toJsArray(channels);
		sendMessages(jsChannels, message);
	}
	
	private native void sendMessages(JsArrayString channels, D2OpenAjaxMessageWrapper message) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		var d2Message = message.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Hub.sendMessages(channels, d2Message);
	}-*/;
	
	public native void sendMessageString(String channel, String message) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.sendMessageString(channel, message);
	}-*/;

	public void sendMessageStrings(String[] channels, String message) {
		sendMessageStrings(toJsArray(channels), message);
	}

	private native void sendMessageStrings(JsArrayString channels, String message) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.sendMessageString(channels, message);
	}-*/;

	public native void subscribeToChannel(String channel, DataReceivedCallback dataReceived, boolean handleMessageIfInactive) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.subscribeToChannel(channel, callbackDataReceived, handleMessageIfInactive);

		function callbackDataReceived(channel, message) {
			dataReceived.@org.wk.D2OpenAjax.client.callbacks.DataReceivedCallback::onDataReceived(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(channel, message);
		}
	}-*/;

	public void subscribeToChannels(String[] channels, DataReceivedCallback dataReceived, boolean handleMessageIfInactive) {
		subscribeToChannels(toJsArray(channels), dataReceived, handleMessageIfInactive);
	}

	private native void subscribeToChannels(JsArrayString channels, DataReceivedCallback dataReceived, boolean handleMessageIfInactive) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.subscribeToChannels(channels, callbackDataReceived, handleMessageIfInactive);

		function callbackDataReceived(channels, message) {
			dataReceived.@org.wk.D2OpenAjax.client.callbacks.DataReceivedCallback::onDataReceived(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(channels, message);
		}
	}-*/;
	
	public native void unsubscribeFromChannel(String channel, boolean log) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.unsubscribeFromChannel(channel, log);
	}-*/;
	
	public void unsubscribeFromChannels(String[] channels, boolean log) {
		unsubscribeFromChannels(toJsArray(channels), log);
	}
		
	private native void unsubscribeFromChannels(JsArrayString channels, boolean log) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.unsubscribeFromChannels(channels, log);		
	}-*/;
	
	public native void unsubscribeFromAllChannels() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.unsubscribeFromAllChannels();		
	}-*/;
	
	public native void logRegisteredChannels() /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.logRegisteredChannels();
	}-*/;
	
	public native void storeMessage(String channel, String message, MessageStoredCallback messageStored, boolean handleMessageIfInactive) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.storeMessage(channel, message, callbackStoreMessage, handleMessageIfInactive);
		
		function callbackStoreMessage(channel, message) {
			messageStored.@org.wk.D2OpenAjax.client.callbacks.MessageStoredCallback::onMessageStored(Ljava/lang/String;Ljava/lang/String;)(channel, message);
		}
	}-*/;
	
	public native void replayMessage(boolean forceReplay) /*-{
		var d2Hub = this.@org.wk.D2OpenAjax.client.D2OpenAjaxHubWrapper::d2OpenAjaxHub;
		d2Hub.replayMessage();
	}-*/;
}
