Feature: US008 BlueRentalCar positive login test

  @bluerental
  Scenario Outline: TC01 kullanici tum manager bilgileri ile giris yapabilmeli
    Given kullanici properties den "blueUrl" adresine gider
    Then kullanici login buttonuna tiklar
    Then kullanici "<email>" ve "<password>" bilgilerini girer ve login olur
    But 2 saniye bekler
    Then kullanici login oldugunu "<email>" ile dogrular
    But  2 saniye bekler
    And sayfayi kapatir
    Examples:
      | email  | password  |
      | email1 | password1 |