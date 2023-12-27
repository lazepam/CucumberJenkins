Feature: US002 Google sayfasinda arama Testi
  @ne
  Scenario: TC01 Google sayfasinda araclar aratilir
    Given kullanici "https://google.com" adresine gider
    When sayfa basliginin "Google" icerdigini test eder
    Then arama kutusunda "audi" aratir
    And 2 saniye bekler
    And sayfa basliginin "bmw" icerdigini test eder
    But kullanci sonuc sayisini konsola yazdirir
    And sonuc yazisinin resmini alir
    And sayfayi kapatir
