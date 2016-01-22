package org.wk.D2OpenAjax.client;

import static org.wk.D2OpenAjax.client.D2OpenAjaxUtils.*;

import java.util.List;

import org.wk.D2OpenAjax.client.callbacks.ForEachCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class D2OpenAjaxMessageWrapper {
	public static final String PARAM_EQ = "==";
	public static final String PARAM_SEPARATOR = "!!";
	public static final String PARAM_ID = "oam_id";
	public static final String PARAM_CONTAINER_UID = "oam_cuid";
	public static final String PARAM_GLOBAL = "oam_global";
	public static final String PARAM_SENDER = "oam_sender";
	public static final String PARAM_VALUE = "oam_value";
	public static final String PARAM_TARGET_TYPE = "oam_target_type";
	public static final String PARAM_TARGET_ID = "oam_target_id";
	public static final String PARAM_EXCLUDED_TYPE = "oam_excluded_type";
	public static final String PARAM_EXCLUDED_ID = "oam_excluded_id";
	public static final String PARAM_VOLATILE = "oam_volatile";
	public static final String PARAM_COLON = "::";
	public static final char PARAM_SPLIT_SEPARATOR = 172;

	private JavaScriptObject d2OpenAjaxMessage;

	public D2OpenAjaxMessageWrapper() {
		init();
	}

	public D2OpenAjaxMessageWrapper(JavaScriptObject d2OpenAjaxMessage) {
		this.d2OpenAjaxMessage = d2OpenAjaxMessage;
	}

	protected void init() {
		D2OpenAjaxUtils.injectD2OpenAjaxHubScripts();
		if (d2OpenAjaxMessage == null)
			d2OpenAjaxMessage = getD2OpenAjaxMessage();
	}

	private native JavaScriptObject getD2OpenAjaxMessage() /*-{
		return new $wnd.OpenAjaxMessage();
	}-*/;

	public JavaScriptObject getJSObject() {
		return d2OpenAjaxMessage;
	}

	public native boolean isGlobal() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.isGlobal();
	}-*/;

	public native void setGlobal(boolean global) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.setGlobal(global);
	}-*/;

	public native String getId(boolean raw) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getId(raw);
	}-*/;

	public List<String> getIds() {
		return fromJsArray(getIdsAsJsArrayString());
	}

	private native JsArrayString getIdsAsJsArrayString() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getIds();
	}-*/;

	public native String setId(String id) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setId(id);
	}-*/;

	public String setIds(String[] ids) {
		return setIds(toJsArray(ids));
	}

	private native String setIds(JsArrayString ids) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setIds(ids);
	}-*/;

	public native boolean isMultipleIds() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.isMultipleIds();
	}-*/;

	public native String getTargetType() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getTargetType();
	}-*/;

	public native String setTargetType(String target) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setTargetType(target);
	}-*/;

	public native String getTargetId() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getTargetId();
	}-*/;

	public native String setTargetId(String target) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setTargetId(target);
	}-*/;

	public native String getExcludedType() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getExcludedType();
	}-*/;

	public native String setExcludedType(String excluded) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setExcludedType(excluded);
	}-*/;

	public native String getExcludedId() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getExcludedId();
	}-*/;

	public native String setExcludedId(String excluded) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setExcludedId(excluded);
	}-*/;

	public native String getCointainerUid() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getCointainerUid();
	}-*/;

	public native String setCointainerUid(String containerUid) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.setCointainerUid(containerUid);
	}-*/;

	public native boolean isVolatile() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.isVolatile();
	}-*/;

	public native void setVolatile(boolean volatileEvent) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.setVolatile(volatileEvent);
	}-*/;

	public native String getSender() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getSender();
	}-*/;

	public native void setSender(String sender) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.setSender(sender);
	}-*/;

	public native String getValue() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.getValue();
	}-*/;

	public native void setValue(String value) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.setValue(value);
	}-*/;

	public native String get(String name) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.get(name);
	}-*/;

	public native void put(String name, String value) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.put(name, value);
	}-*/;

	public native void each(ForEachCallback forEach, D2OpenAjaxMessageWrapper scope, boolean decode) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		var d2Scope = scope.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		d2Message.each(callbackForEach, d2Scope, decode);

		function callbackForEach(key, value, hasNext) {
			forEach.@org.wk.D2OpenAjax.client.callbacks.ForEachCallback::onKey(Ljava/lang/String;Ljava/lang/String;Z)(key, value, hasNext);
		}
	}-*/;

	public native String decodeParameterValue(String value) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.decodeParameterValue(value);
	}-*/;

	public native String encodeParameterValue(String value) /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		return d2Message.encodeParameterValue(value);
	}-*/;

	public native void showParameters() /*-{
		var d2Message = this.@org.wk.D2OpenAjax.client.D2OpenAjaxMessageWrapper::d2OpenAjaxMessage;
		console.log(d2Message);
	}-*/;
}
