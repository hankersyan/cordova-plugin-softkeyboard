SoftKeyboard
=========

SoftKeyboard plugin for Cordova/PhoneGap that supports iOS, Android.

## Usage

Install the plugin using the CLI, for instance with PhoneGap:

	cordova plugin add https://github.com/hankersyan/cordova-plugin-softkeyboard.git

The plugin creates the object `cordova.plugins.softkeyboard` with the methods `hide`.

Example:

	function onFocus() {
	    setTimeout(function(){
		    cordova.plugins.softkeyboard.hide();
		}, 100);
	}
