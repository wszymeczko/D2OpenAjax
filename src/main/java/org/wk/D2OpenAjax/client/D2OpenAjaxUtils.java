package org.wk.D2OpenAjax.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.JsArrayString;

public class D2OpenAjaxUtils {

	public static List<String> fromJsArray(JsArrayString jsArray) {
		List<String> array = new ArrayList<String>();
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
}
