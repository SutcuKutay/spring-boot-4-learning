# spring-boot-4-learning
https://www.udemy.com/course/spring-hibernate-tutorial

# Why Spring Boot?
* Makes it easier to get started with the Spring environment.
* Minimize the amount of manuel configuration
* Help to resolve dependency conflicts (Maven or Gradle)
* Provide an embedded HTTP server so you can get started quickly (Tomcat, Jetty, Undertow...)

### https://metintopcu1.medium.com/spring-vs-spring-boot-nedir-badad8ef7c72
## Spring
Hemen her şey hakkında yardımcı olmaya çalışan bir uygulama çatısı(Framework) olarak düşünebiliriz. Hemen Her şey derken sosyal medya entegrasyonlarından, veri tabanı Transaction yönetimine, Aspect Oriented kod yazmaktan, çeşitli veri tabanlarına bağlantı işlemlerine kadar bayağı geniş bir yelpazede yardım eder.
Ayrıca Java ve .NET için geliştirilmiş açık kaynak kodlu bir framework’tür. JavaEE uygulamalarını geliştirmeyi kolaylaştırır. Spring’i “frameworks of framework” olarak düşünebiliriz çünkü Struts, Hibernate, Tapestry, EJB, JSF gibi frameworklerin kullanımını destekleyen bir frameworktur.

## Spring Boot
Spring Boot, Spring’teki gibi yapılandırma için çok fazla zaman kaybetmeden hızlı ve kolay bir şekilde Java uygulamasını çalıştırmamızı sağlayan bir frameworktür. Kendi içerisinde Tomcat’i barındırdığı içinde sizin Tomcat ayarlaması yapmadan uygulamanızı hızlıca ayağa kaldrımanıza yardımcı olur.

## Spring ve Spring Boot Faydaları
* Bağımsız uygulamalar yaratmanızı sağlar.
* Tomcat, Jetty, Undertow direkt gömülü olarak gelir (bunların war dosyalarını deploy etmeye gerek yoktur.)
* Maven yapılandırmasını kolaylaştırmak için başlangıç POM’larını sağlar.
* Mümkün oldukça otomatik olarak Spring’i yapılandırır.
* Metrikler, sağlık kontrolleri ve dışsallaşmış yapılandırma gibi üretime hazır özellikleri sağlar.
* XML yapılandırması için kesinlikle hiçbir kod yaratma ve gereksinim yoktur.
* Spring bağımlılıklarını kolaylaştırır, versiyon çakışmalarını önler.
* Bir uygulama konteynır olmadan komut satırından direkt olarak çalıştırılabilir.
* boilerplate yani basmakalıp kodlardan sıyrılıp sadece ihtiyacımız olan kodları yazmamızı sağlar.

## Spring ile Spring Boot Farkı
Prensipte aynı şeylerdir. Aradaki farkı;

* Spring boot, spring çatısının daha kolaylaştırılmış halidir.
* Spring ile çalışacaksan bir web sunucu üzerinde çalışman gerekir (web uygulamaları için söylüyorum) Spring Boot ise hazırda içine eklenmiş sunucu ile geliyor. Yani ek olarak kurman gerekmiyor.
* Spring Boot starter paketleriyle beraber proje tipine göre hazır kütüphaneler eklenmiş olarak gelir. Spring ile çalışırken core, security, web, data taraflarını kendiniz eklemeniz gerekir.

## Spring Kelime Anlamı
Spring hafif (lightwight) bir frameworktur. Dilimize çevirdiğimizde kulağa ne kadar tuhaf gelse de, bu framework e neden hafif denilmiştir?

1. Spring birçok modülü ve üçüncü parti kütüphaneleri kullanıma sunarak onlarla sıkıntısız bir şekilde entegrasyon işlemi sağladığından.

2. Spring ile çok daha az kod ve konfigürasyon işlemleri ile uğraşırız. Böylece ciddi bir iş yükünden kurtularak business logic(iş katmanı) dediğimiz uygulamamızda verinin yorumlandığı ve iş kurallarının uygulandığı katmana odaklanma şansı buluruz. Bu da Spring’in hafif olmasının bir diğer sebebidir.
