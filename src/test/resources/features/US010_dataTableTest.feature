Feature: US010 google testi

  Scenario: TC01 arama kutusunda kitaplar aratilir
    Given kullanici properties den "googleUrl" adresine gider
    When kullanici asagidaki tablodaki bilgiler ile arama yapar
      | Kitaplar |
      | java     |
      | python   |
      | sql      |
    But 3 saniye bekler
    Given kullanici properties den "blueUrl" adresine gider
    And kullanici login buttonuna tiklar
    Then verilen kullanici bilgileri ile login olur
      | email                       | password |
      | raj.khan@bluerentalcars.com | asd!_dsa |
      | jack@gmail.com              | jack123! |
    And sayfayi kapatir




