Feature: US012 N11 sayfasi testi

  Scenario: TC01 N11 sayfasinda urun aratilir
    Given kullanici properties den "n11Url" adresine gider
    Then arama kutusunda asagidaki tabloda verilen urunleri aratir ve sayfa basliklarini test eder
      | urunler  |
      | Bisiklet |
      | Kalem    |

    When kullanici markapuani webelementine kadar scroll yapar
    And marka puanini 6 olarak ayarlar