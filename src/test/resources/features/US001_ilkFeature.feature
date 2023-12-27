Feature: US001 Amazon Sayfasi Testi

  @positive
  Scenario: TC01 Amazon Sayfasi arama kutusunda iphone aratilir
    Given kullanici Amazon sayfasina gider
    When basligin Amazon icerdigini test eder
    Then arama kutusunda iphone aratir
    But sonuc sayisini konsola yazdirir
    And sonuc yazisi WEB Elementinin resmini kayiteder
    And sayfayi kapatir

  @gr1
  Scenario: TC02 Amazon Sayfasi arama kutusunda samsung aratilir
    Given kullanici Amazon sayfasina gider
    When basligin Amazon icerdigini test eder
    Then arama kutusunda samsung aratir
    And sonuc sayisini konsola yazdirir
    And sonuc yazisi WEB Elementinin resmini kayiteder
    And sayfayi kapatir
