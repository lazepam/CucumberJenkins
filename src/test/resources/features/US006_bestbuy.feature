Feature: US006 bestbuy sayfasi testi
  Scenario: TC001 bestbuy sayfasinda arama kutusu testi
    Given kullanici properties den "bestbuyUrl" adresine gider
    When sayfa basliginin "Best" icerdigini test eder
    But 2 saniye bekler
    Then Bestbuy sayfasi arama kutusunda "iphone" aratir
    Then sayfa basliginin "iphone" icerdigini test eder
    And sonuc yazisinda "iphone" icerdigini test eder
    And Bestbuy sayfasinda sonuc sayisini konsola yazdirir
    But 2 saniye bekler
    And sayfayi kapatir


