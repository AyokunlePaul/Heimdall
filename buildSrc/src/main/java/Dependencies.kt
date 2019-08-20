object Versions {
    const val targetSdkVersion = 28
    const val compileSdkVersion = 28
    const val minSdkVersion = 21

    const val versionCode = 1
    const val versionName = "1.0"
    
    const val kotlin = "1.3.41"
    const val coreKtx = "1.0.2"
    const val fragmentKtx = "1.2.0-alpha02"
    const val appCompat = "1.1.0-rc01"
    const val lifecycle = "2.0.0"
    const val javaxInject = "1"
    const val javaxAnnotation = "1.0"
    const val roomVersion = "2.1.0"
    const val rxJava = "2.2.6"
    const val rxAndroid = "2.1.1"
    const val okhttp = "3.12.0"
    const val retrofit = "2.4.0"
    const val recyclerAnimator = "3.0.0"
    const val materialComponent = "1.1.0-alpha09"
    const val dagger = "2.24"
    const val scarlet = "0.2.4"
    const val stetho = "1.5.1"
    const val timber = "4.7.1"
    const val navigation = "2.2.0-alpha01"
    const val constraintLayout = "2.0.0-beta1"
    const val rxAnimation = "0.0.6"
    const val otpView = "1.4.3"
    const val shimmerLayout = "0.4.0"
    const val fresco = "2.0.0"
    const val multidex = "2.0.1"
    const val overscrollDecor = "1.0.4"
    const val gson = "2.8.5"
    const val pinEntryEditText = "2.0.6"
    const val groupie = "2.3.0"
    const val inputMask = "4.0.0"
    const val gradle = "3.5.0-rc03"
    const val espresso = "3.2.0"
    const val runner = "1.2.0"
    const val testExt = "1.1.1"
    const val mockk = "1.9.3"
    const val junit = "4.12"
}

object RootDependencies {
    const val applicationId = "com.ayokunlepaul.heimdall"
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val javax = "javax.inject:javax.inject:${Versions.javaxInject}"
    const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotation}"
}

object AndroidTestDependencies {
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testRunner = "androidx.test:runner:${Versions.runner}"
    const val textExt = "androidx.test.ext:junit:${Versions.testExt}"
    const val mockk = "io.mockk:mockk-android:${Versions.mockk}"
}

object TestDependencies {
    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
}

object PersistenceDependencies {
    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomRxJava = "androidx.room:room-rxjava2:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
}

object AsyncDependencies {
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
}

object NetworkDependencies {
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

    const val scarlet = "com.github.tinder.scarlet:scarlet:${Versions.scarlet}"
    const val scarletRxJava = "com.github.tinder.scarlet:scarlet-stream-adapter-rxjava2:${Versions.scarlet}"
    const val scarletGson = "com.github.tinder.scarlet:scarlet-message-adapter-gson:${Versions.scarlet}"
    const val scarletWebSocket = "com.github.tinder.scarlet:scarlet-protocol-websocket-okhttp:${Versions.scarlet}"
    const val scarletLifecycle = "com.github.tinder.scarlet:scarlet-lifecycle-android:${Versions.scarlet}"
}

object UtilityDependencies {
    const val recyclerAnimator = "jp.wasabeef:recyclerview-animators:${Versions.recyclerAnimator}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val optView = "com.chaos.view:pinview:${Versions.otpView}"
    const val inputMask = "com.redmadrobot:inputmask:${Versions.inputMask}"
    const val overscrollDecor = "me.everything:overscroll-decor-android:${Versions.overscrollDecor}"
}

object AndroidXDependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val androidFragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"
}

object ViewDependencies {
    const val materialComponent = "com.google.android.material:material:${Versions.materialComponent}"
    const val rxAnimation = "com.mikhaellopez:rxanimation:${Versions.rxAnimation}"
    const val shimmerLayout = "com.facebook.shimmer:shimmer:${Versions.shimmerLayout}"
    const val fresco = "com.facebook.fresco:fresco:${Versions.fresco}"
    const val pinEntryEditText = "com.alimuzaffar.lib:pinentryedittext:${Versions.pinEntryEditText}"
    const val groupie = "com.xwray:groupie:${Versions.groupie}"
    const val groupieDatabinding = "com.xwray:groupie-databinding:${Versions.groupie}"
    const val groupieExtensions = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
}

object DependencyInjectionDependencies {
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object Classpaths {
    const val navigation = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val gradle = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}