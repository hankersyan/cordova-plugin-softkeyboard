#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>

@interface CDVSoftKeyboard : CDVPlugin {}

- (void)hide:(CDVInvokedUrlCommand*)command;

@end