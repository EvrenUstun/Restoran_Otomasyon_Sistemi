# Restoran Otomasyon Sistemi

## Bu Proje Hakkında

Bu proje Tasarım Desenleri Yüksek Lisans dersinin ödevidir. Bu projenin kodları ChatGPT tarafından yazılmıştır.

## Ara sınavda verilen ödevin senaryosu
Bir restoran, müşterilerin siparişlerini almak ve hazırlamak için bir otomasyon sistemi kullanmak istiyor. Siparişlerin doğru bir şekilde alınması ve işlenmesi için aşağıdaki tasarım desenleri kullanılabilir:

Factory Method Pattern: Restoranın menüsünde çeşitli yemekler ve içecekler vardır. Bu öğelerin siparişlerini işlemek için Factory Method Pattern kullanarak "Sipariş Üreticisi" sınıfı yaratılabilir. Bu sınıf, müşterilerin sipariş ettiği öğeye göre doğru sınıfın örneğini oluşturur ve siparişin işlenmesine yardımcı olur.

Singleton Pattern: Restoranın sipariş işleme sistemi, tek bir "Sipariş İşleme Yöneticisi" sınıfından yönetilebilir. Bu sınıf, siparişleri alır, işler ve hazırlar. Bu sınıfın sadece bir örneği olması, sistemdeki veri bütünlüğünü sağlayacak ve siparişlerin düzgün bir şekilde işlenmesini sağlayacaktır.

Decorator Pattern: Restoranın menüsünde, müşterilerin yemeklerine ekstra malzemeler ekleyebilmesi için "Ekstra Malzeme" seçenekleri bulunur. Bu seçenekleri işlemek için Decorator Pattern kullanılabilir. "Ekstra Malzeme" sınıfları, yemek sınıflarının üzerine eklenerek, yemeklere ekstra malzeme ekleme özelliği sağlar.

Builder Pattern: Restoranın menüsünde, müşterilerin yemeklerini kendi zevklerine göre özelleştirebilmeleri için "Özelleştirme" seçenekleri bulunur. Bu özellikleri işlemek için Builder Pattern kullanılabilir. "Özelleştirme" sınıfları, yemeklerin farklı özelliklerini birleştirerek, müşterilerin taleplerine uygun özel yemekler oluşturur.

Prototype Pattern: Restoranın menüsündeki bazı yemeklerin farklı boyutları bulunur. Bu boyutlardaki yemeklerin üretimini kolaylaştırmak için Prototype Pattern kullanılabilir. "Yemek Prototipi" sınıfları, yemeklerin farklı boyutlarını önceden belirleyerek, siparişlerin işlenmesini hızlandırır.

Mediator Pattern: Restoranın sipariş işleme sistemi, farklı departmanlar arasındaki iletişimi yönetmek için Mediator Pattern kullanarak "Sipariş İletişimcisi" sınıfı yaratılabilir. Bu sınıf, siparişin hangi departman tarafından işleneceğini belirler ve departmanlar arasında bilgi akışını sağlar. Örneğin, müşteri siparişi verdiğinde, sipariş ile ilgili bilgileri "Sipariş İletişimcisi" sınıfı alır ve bu bilgileri ilgili departmanlara ileterek siparişin doğru bir şekilde işlenmesini sağlar.

Chain of Responsibility Pattern: Restoranın sipariş işleme sistemi, farklı departmanların birbirine bağlı olduğu bir zincir şeklinde işlemesi için Chain of Responsibility Pattern kullanarak "Sipariş Zinciri" sınıfı yaratılabilir. Bu sınıf, bir siparişin işlenmesi sırasında, her departmanın görevini yerine getirmesi için bir zincir oluşturur. Her departman, görevi yerine getirmediyse bir sonraki departmana geçerek, siparişin doğru bir şekilde işlenmesini sağlar.

Observer Pattern: Restoranın sipariş işleme sistemi, farklı departmanlar arasındaki değişikliklerin takip edilmesi için Observer Pattern kullanarak "Departman Gözlemcileri" sınıfı yaratılabilir. Bu sınıf, bir departmandaki değişiklikleri takip ederek, diğer departmanları bilgilendirir ve sistemin düzgün bir şekilde çalışmasını sağlar. Örneğin, siparişin hazır olduğu departman, "Departman Gözlemcileri" sınıfını bilgilendirerek, siparişin diğer departmanlara iletilmesini sağlayabilir.

Bu tasarım desenleri, restoranın sipariş işleme sisteminin doğru bir şekilde çalışmasını sağlayacak ve müşterilerin siparişlerinin hızlı ve doğru bir şekilde işlenmesini sağlayacaktır.

## Kullanılan Teknolojiler

* Java (Version 17)
* IntelliJ IDEA 2021.2.3
* Git

## Önkoşullar

Projenin çalıştırılması için bilgisyarınızda java'nın kurulu olması beklenmektedir.

## Kurulum

1. Repoyu klonlayın.

```
    git clone https://github.com/EvrenUstun/Restoran_Otomasyon_Sistemi.git
```

2. Klonladığınız projede Main.java dosyasını açın ve projeyi çalıştırın.

## ChatGPT Kullanımı

ChatGPT ye ona bir senaryo vereceğimi söyledim ve bunu istediğim programlama dilini belirterek bir kod yazacağımızı söyledim. Bu proje özelinde java programlama dilini seçtim. Daha sonra senaryomu yazdım ve bunun kodunu yazmasını istedim. Daha sonra diğer tasarım desenlerini içeren senaryoları da bu şekilde kodunu chatGPT ye yazdırdım. Son olarak bazı classların ismini aynı verdiği için bunları kendim düzelterek çalışır kod elde ettim.

## Ekran Kaydı

## Ekran Görüntüsü

<img src="/Screenshot/ChatGPT.png" />
