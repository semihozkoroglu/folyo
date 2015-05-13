#   Facebook Buck

.fx: first

Semih Özköroğlu `<semihozkoroglu@gmail.com>`

http://semihozkoroglu.github.io/

Mayıs 2015

##  Özellikleri

-   Daha hızlı derleme

-   Paralel derleme

-   Buck dosya tabanlıdır (Dosyaları hash ile cache'leme yapar değişiklik var ise derler)

-   Genel olarak odaklandığı nokta hız, ant'a göre iki kat daha hızlı derleme yapar

-   Buck 

## Kurulum

        !sh
        $ git clone https://github.com/facebook/buck.git

        $ cd buck

        $ ant

        $ sudo ln -s ${PWD}/bin/buck /usr/bin/buck

##  Süreler

İşlem          | Gradle          | Buck
---------------|-----------------|------------------
Clean          | `32.80s`        | `2.49s`
Build          | `39.50s`        | `3.44s`
After Clean    | `63.05s`        | `7.03s`
Parallel Build | `60.83s`        |

## BUCK file

```ruby
    keystore(
        name = 'debug_keystore',
        store = 'debug.keystore',
        properties = 'debug.keystore.properties',
    )

    android_resource(
        name = 'res',
        res = 'src/main/res',
        package = 'com.facebook.shimmer.example',
        visibility = ['//shimmer-android-example:src'],
    )

    android_library(
        name = 'src',
        srcs = glob(['src/main/java/**/*.java']),
        deps = [
            ':res',
            '//shimmer-android:src',
        ],
    )

    android_binary(
        name = 'bin',
        manifest = 'src/main/AndroidManifest.xml',
        keystore = ':debug_keystore',
        deps = [
            ':res',
            ':src',
        ],
    )

    project_config(
        src_target = ':bin',
        src_roots = ['src/main/java'],
    )
```

## Karşılaşılan Problemler

-   Kullanımı zor

-   Geanymotion ile çalışmıyor

-   IDE ye entegre problemi