@all
Feature: US002 Google sayfasinda arama Testi

  Scenario: TC01 Google sayfasinda araclar aratilir
    Given kullanici "https://google.com" adresine gider
    When sayfa basliginin "Google" icerdigini test eder
    Then arama kutusunda "audi" aratir
    And 2 saniye bekler
    And sayfa basliginin "audi" icerdigini test eder
    But kullanci sonuc sayisini konsola yazdirir
    And sonuc yazisinin resmini alir
    And sayfayi kapatir

  Scenario: TC01 Google sayfasinda araclar aratilir
    Given kullanici "https://google.com" adresine gider
    When sayfa basliginin "Google" icerdigini test eder
    Then arama kutusunda "ford" aratir
    And 2 saniye bekler
    And sayfa basliginin "ford" icerdigini test eder
    But kullanci sonuc sayisini konsola yazdirir
    And sonuc yazisinin resmini alir
    And sayfayi kapatir

  Scenario: TC01 Google sayfasinda araclar aratilir
    Given kullanici "https://google.com" adresine gider
    When sayfa basliginin "Google" icerdigini test eder
    Then arama kutusunda "tesla" aratir
    And 2 saniye bekler
    And sayfa basliginin "tesla" icerdigini test eder
    But kullanci sonuc sayisini konsola yazdirir
    And sonuc yazisinin resmini alir
    And sayfayi kapatir
