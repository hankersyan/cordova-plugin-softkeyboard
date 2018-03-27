package io.hankersyan.cordova.softkeyboard;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

public class SoftKeyboard extends CordovaPlugin {
  
  private static final String actionHide = "hide";

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
	InputMethodManager imm = (InputMethodManager)cordova.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);

    if (action.equals(actionHide)) {
      try {
		imm.hideSoftInputFromWindow(webView.getView().getWindowToken(), 0);

        return true;
      } catch (Exception e) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, e.toString()));
      }
    }

    return false;
  }
}
