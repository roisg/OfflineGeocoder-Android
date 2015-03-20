OfflineGeoCoder-Android
=======================

An Offline version of reverse Geo Code to retrieve Countries Name and ISO Codes.

This project is a migration of the [IOS-Offline-Geocoder](https://github.com/soheilbm/IOS-Offline-GeoCoder) by soheilbm.

#### Usage

To use the project you just need to add offline-geocoder module as a dependency to your project.

Instantiate the ReverseGeoCodingCountry using:

```
ReverseGeocodingCountry reverseGeocodingCountry = new ReverseGeocodingCountry(context);
```

```
String countryName = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_NAME, 39.474213, -6.329470);
```

```
String countryISOCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 39.474213, -6.329470);
```

There are three type of data you can retrieve from the api.

#####1. GeocodeKey.KEY_NAME   `// Name of the Country`
#####2. GeocodeKey.KEY_ISOA2  `// ISO with 2 Alpha`
#####3. GeocodeKey.KEY_ISOA3  `// ISO with 3 Alpha`

You may use any of those key to retrieve detail of the location.


#### ChangeLog

V 0.0.1
- First release of the project


#### License 

OfflineGeocoder-Android is licensed under the terms of the MIT License.
