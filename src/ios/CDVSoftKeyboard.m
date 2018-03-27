#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>
#import <Cordova/CDVPluginResult.h>
#import "CDVSoftKeyboard.h"

@implementation CDVSoftKeyboard

- (void)hide:(CDVInvokedUrlCommand*)command {
	[self.commandDelegate runInBackground:^{
		[cordova.view endEditing:YES];
	    
	    CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
	    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
	}];
}

@end