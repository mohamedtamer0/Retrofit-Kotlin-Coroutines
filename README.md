# Retrofit-Kotlin-Coroutines

![Screenshot_1633809461](https://user-images.githubusercontent.com/51374446/136672497-172b4a06-5e04-4426-813a-fd2fa754c409.png)
![Screenshot_1633809465](https://user-images.githubusercontent.com/51374446/136672499-8dff3d52-4156-4478-a349-72cdf6a84d80.png)
![Screenshot_1633809476](https://user-images.githubusercontent.com/51374446/136672500-a081a72a-e3ca-4caf-8543-9f51482ef553.png)

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
