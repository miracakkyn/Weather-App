plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.miracakkoyun.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.miracakkoyun.weatherapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding=true
    }
    /*
    Bu yapılandırma, Android'de View Binding özelliğini etkinleştirmek için kullanılır.
    View Binding, kullanıcı arayüzündeki (UI) görünümleri (views) daha güvenli ve verimli bir şekilde işlemek için kullanılan bir Android Jetpack özelliğidir.
     XML layout dosyalarıyla doğrudan bağlantı kurmayı sağlar ve findViewById() gibi eski yöntemlerin kullanımını ortadan kaldırır.
     */
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Scalable Size unit (support for different screen sizes)
    //Ölçeklenebilir Boyut birimi (farklı ekran boyutları için destek)
    //Bu bağımlılıklar, Android uygulamanızda daha esnek ve ekran boyutuna duyarlı bir tasarım yapmanızı sağlar:
    //SDP ile genel bileşenlerin boyutları ekran boyutuna göre ayarlanır.
    //SSP ile metin boyutları ekran boyutuna göre optimize edilir.
    implementation("com.intuit.sdp:sdp-android:1.1.0")
    implementation("com.intuit.ssp:ssp-android:1.1.0")

    // Navigation Component
    // Navigation Component, Android uygulamalarında ekranlar arası geçişleri (navigasyon) yönetmek için kullanılan bir araçtır.
    //Navigation Fragment KTX: Bu bağımlılık, Fragmentlar ile ekranlar arasında geçiş yapmayı sağlar. ---
    //---Ayrıca Kotlin diline özgü ek fonksiyonlar (extension functions) içerir, bu sayede daha sade ve okunabilir bir kod yazılabilir.
    //Navigation UI KTX: Bu bağımlılık ise uygulamanın kullanıcı arayüzü (UI) ile navigasyonu entegre etmeyi sağlar. ---
    // ---Örneğin, üstteki Toolbar'ın geri butonunun otomatik olarak görünmesini veya BottomNavigationView ile fragmentlar arasında geçiş yapmayı kolaylaştırır.

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

    //koin (dependency.injection)
    //Bu satır, Koin Android kütüphanesini projeye dahil eder ve Koin'in Android'e özel işlevlerinden yararlanmanızı sağlar.
    implementation("io.insert-koin:koin-android:3.4.2")

    //Retrofit
    /*implementation("com.squareup.retrofit2:retrofit:2.9.0"):
    Bu satır, Retrofit kütüphanesini projeye dahil eder. Retrofit, sunucularla HTTP istekleri yapmak ve
     sunucudan gelen yanıtları almak için kullanılan bir RESTful API istemcisidir.
     Retrofit, API'lerden gelen yanıtları kolayca işleyebilmeniz için çağrıları basit Java arayüzleriyle temsil eder ve bu sayede API çağrıları çok daha okunabilir ve yönetilebilir hale gelir.
    Özellikleri:
    HTTP istekleri (GET, POST, PUT, DELETE vb.) yapmanızı sağlar.
    API'lerden gelen JSON yanıtlarını otomatik olarak Java veya Kotlin sınıflarına dönüştürür.
    İsteklerinizi asenkron (arka planda) veya senkron (anlık) olarak gerçekleştirebilirsiniz.

    implementation("com.squareup.retrofit2:converter-gson:2.9.0"):
    Bu satır, Retrofit'in JSON verilerini işlemesi için kullanılan bir Gson dönüştürücüsünü projeye ekler.
    Gson, JSON verilerini Java/Kotlin nesnelerine ve tam tersi şekilde nesneleri JSON'a dönüştürmeye yarayan bir kütüphanedir.
    Retrofit, API'lerden gelen JSON verilerini otomatik olarak Java/Kotlin veri sınıflarına (model sınıflarına) çevirir.
    Bu, JSON verisiyle manuel olarak uğraşmayı ortadan kaldırır.

     */
    implementation("com.suqareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")



    //ViewModel
    /*
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2") Ne İşe Yarar?
    Bu bağımlılık, ViewModel yapısının Android uygulamanızda kullanılabilmesi için gerekli olan fonksiyonları sağlar.
    ktx uzantısı, ViewModel sınıfını Kotlin ile daha kolay ve sade bir şekilde kullanmanıza olanak
    tanır. Kotlin'e özgü ek fonksiyonlar (extension functions) içerir.
     */
    implementation("androidx.lifecycle-viewmodel-ktx:2.6.2")

    //Coil
    implementation("io.coil-kt:coil:2.5.0")
    /*
    implementation("io.coil-kt:coil:2.5.0") Ne İşe Yarar?
    Coil (Coroutine Image Loader), Android uygulamalarında görselleri asenkron olarak yüklemek ve görüntülemek için kullanılır.
    Coil, performans optimizasyonlarına ve Kotlin diline özgü özelliklere (örneğin, coroutine desteği) sahiptir.
    Coroutine tabanlı olduğundan, görsel yükleme işlemleri arka planda güvenli ve verimli bir şekilde yapılır.
    Bu sayede kullanıcı arayüzü yavaşlamadan veya takılmadan çalışmaya devam eder.
     */


}