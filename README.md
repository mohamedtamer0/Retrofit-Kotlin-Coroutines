# Retrofit-Kotlin-Coroutines



```gradle

    plugins {
        id 'com.android.application'
        id 'kotlin-android'
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures{
        viewBinding true
    }

```



```gradle
dependencies {
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.3.1'


    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9'


    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-moshi:2.9.0'

    implementation 'com.squareup.moshi:moshi-kotlin:1.12.0'
    implementation 'com.squareup.moshi:moshi-adapters:1.12.0'
    }
```
