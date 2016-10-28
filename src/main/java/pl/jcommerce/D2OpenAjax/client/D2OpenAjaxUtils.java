package pl.jcommerce.D2OpenAjax.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.ScriptInjector;

import pl.jcommerce.D2OpenAjax.client.resources.D2OpenAjaxHubBundle;

public class D2OpenAjaxUtils {

	public static List<String> fromJsArray(JsArrayString jsArray) {
		List<String> array = new ArrayList<>();
		for (int i=0; i<jsArray.length(); i++) {
			array.add(jsArray.get(i));
		}
		return array;
	}
	
	public static JsArrayString toJsArray(String[] array) {
		JsArrayString jsArray = JsArrayString.createArray().cast();
		for(String element : array) {
			jsArray.push(element);
		}
		return jsArray;
	}
	
	public static native void console(String msg) /*-{
		console.log(msg);
	}-*/;
	
	public static void injectD2OpenAjaxHubScripts() {
		if (!isInjected()) {
			ScriptInjector.fromString(D2OpenAjaxHubBundle.INSTANCE.d2OpenAjaxHub().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			ScriptInjector.fromString(D2OpenAjaxHubBundle.INSTANCE.d2OpenAjaxManagedHub().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
	}
	
	public static final native boolean isInjected() /*-{
	    if ((typeof $wnd.D2OpenAjaxHub === "undefined") || ($wnd.D2OpenAjaxHub === null))
		    return false;
		else
			return true;
	}-*/;
}
