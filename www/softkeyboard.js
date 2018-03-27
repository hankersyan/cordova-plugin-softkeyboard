var cordova = require('cordova');

/**
 * SoftKeyboard plugin for Cordova
 *
 * @constructor
 */
function SoftKeyboard() {}

/**
 * hide the soft keyboard
 */
SoftKeyboard.prototype.hide = function() {
  cordova.exec(null, null, "SoftKeyboard", "hide", []);
};

// Register the plugin
var softkeyboard = new SoftKeyboard();
module.exports = softkeyboard;
