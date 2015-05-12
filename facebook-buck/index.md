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

##  Süreler

İşlem          | Gradle          | Buck
---------------|-----------------|------------------
Clean          | `32.80s`        | `2.49s`
Build          | `39.50s`        | `3.44s`
After Clean    | `63.05s`        | `7.03s`
Parallel Build | `60.83s`        |

## Karşılaşılan Problemler

-   Kullanımı zor

-   Geanymotion ile çalışmıyor

-   IDE ye entegre problemi

## BUCK file

        !text
        .code: code/BUCK.java