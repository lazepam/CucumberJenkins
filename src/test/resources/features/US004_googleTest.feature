Feature: US004 Google Sayfasi Testi

  Background: Google Sayfasi Ortak adimlari
    Given kullanici "https://google.com" adresine gider
    Then sayfa basliginin "Google" icerdigini test eder

  Scenario: TC001 arama kutusunda BMW aratir
    When arama kutusunda "bmw" aratir
    Then kullanci sonuc sayisini konsola yazdirir

  @positive @negative
  Scenario: TC002 arama kutusunda ford aratir
    When arama kutusunda "ford" aratir
    Then kullanci sonuc sayisini konsola yazdirir

  Scenario: TC003 arama kutusunda audi aratir
    When arama kutusunda "audi" aratir
    Then kullanci sonuc sayisini konsola yazdirir
    And sayfayi kapatir