Feature: US007 google testi

  Scenario Outline: TC01 arama kutusunda araclar aratilir
    Given kullanici properties den "googleUrl" adresine gider
    Then arama kutusunda scenario outline ile "<araclar>" aratir
    And sayfa basliginin scenario outline ile "<araclar>" icerdigini test eder
    And 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar |
      | ford    |
      | bmw     |
      | audi    |