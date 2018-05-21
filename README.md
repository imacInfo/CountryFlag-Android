# CountryFlag-Android

- Gradle 

Add it in your root build.gradle at the end of repositories:

	allprojects {

		repositories {

			...

			maven { url 'https://jitpack.io' }

		}

	}
	
Step 2. Add the dependency

	dependencies {
	
	        implementation 'com.github.YingInfo:CountryFlag-Android:0.1'
		
	}


Example : 

String countryCode = "us";

int flagId = new CountryFlag(context).getFlagByCountryCode(countryCode);

if (flagId > 0) {

	ivFlag.setImageResource(flagId);
	
} else {

	Toast.makeText(context, "Tip a valid country code", Toast.LENGTH_SHORT).show();
	
}
		    
		
- Maven

	<repositories>
	
		<repository>
		
		    <id>jitpack.io</id>
		    
		    <url>https://jitpack.io</url>
		    
		</repository>
		
	</repositories>
	
	
Step 2. Add the dependency

	<dependency>
	
	    <groupId>com.github.YingInfo</groupId>
	    
	    <artifactId>CountryFlag-Android</artifactId>
	    
	    <version>0.1</version>
	    
	</dependency>
	
	
[![](https://jitpack.io/v/YingInfo/CountryFlag-Android.svg)](https://jitpack.io/#YingInfo/CountryFlag-Android)
