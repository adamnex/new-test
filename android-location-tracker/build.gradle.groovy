build.gradle

```gradle
repositories {
    maven {
        url "https://jitpack.io"
    }
}

dependencies {
        compile 'com.github.quentin7b:android-location-tracker:4.0'
}
```

```xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
```

```xml
<permission-group
   android:name="android.permission-group.LOCATION"
   android:label="A label for your permission"
   android:description="A description for the permission" />
```

