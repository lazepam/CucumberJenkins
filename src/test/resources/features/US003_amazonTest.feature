Feature: US003 Amazon Sayfasi Testi
  Scenario: TC01 Arama kutusunda telefon aratilir
    Given kullanici "https://amazon.com" adresine gider
    When sayfa basliginin "Amazon" icerdigini test eder
    Then kullanici amazon sayfasi arama kutusunda "iphone" aratir
    * sonuc sayisini konsola yazdirir
    And cikan sonuclardan ilk 5 ine click yapar ve her sayfanin resmini alir
    And 3 saniye bekler
    And sayfayi kapatir
