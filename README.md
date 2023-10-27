# react-native-automatic-time-detection

## Getting started

`$ npm install react-native-auto-time-enabled --save`

### Manual installation

#### Android

1. Set newArchEnabled true if it isn't already in `android/gradle.properties`:
  	```
	  # Use this property to enable support to the new architecture.
	  # This will allow you to use TurboModules and the Fabric render in
	  # your application. You should enable this flag either if you want
	  # to write custom TurboModules/Fabric components OR use libraries that
	  # are providing them.
	  newArchEnabled=true
  	```

## Usage
```javascript
import RNAutomaticTimeDetection from 'react-native-automatic-time-detection/js/NativeAutomaticTimeDetection';

const automaticTimeZone = await RNAutomaticTimeDetection?.isAutomaticTimeZoneEnabled();
console.log(automaticTimeZone);

const automaticTime = await RNAutomaticTimeDetection?.isAutomaticTimeEnabled();
console.log(automaticTime);
```
  