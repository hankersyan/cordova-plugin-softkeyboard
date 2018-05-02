#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>
#import <Cordova/CDVPluginResult.h>
#import "CDVSoftKeyboard.h"

@implementation CDVSoftKeyboard

- (void)hide:(CDVInvokedUrlCommand*)command {
    [self.webView endEditing:YES];
}

@end
