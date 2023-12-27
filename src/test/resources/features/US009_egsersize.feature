#https://editor.datatables.net adresine gidiniz
# Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
# Sayfayı kapatalım
Feature: US009_EDITORDATABASE.NET SAYFASI TESTI

  Scenario Outline: TC01 SAYFAYA VERI GIRISI
    Given kullanici properties den "editorUrl" adresine gider
    When kullanici sayfadaki tabloda new butonuna tiklar
    * 2 saniye bekler
    Then kullanici cikan pencerede verilen bilgileri girer "<First name>","<Last name>","<Position>","<Office>","<Extension>","<Start date>","<Salary>"
    When 2 saniye bekler
    Then kullanici Create butonuna basar
    When 2 saniye bekler
    Then kullanici search bolumune "<First name>" bilgilerini girer
    When 2 saniye bekler
    Then kullanici "<First name>" ile basarili bir sekilde giris yapildigini dogrular
    And 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | First name | Last name | Position    | Office  | Extension | Start date | Salary  |
      | john       | smith     | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam        | walton    | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy      | brown     | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george     | bush      | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry      | allen     | unknown     | Central | 2103      | 2021-02-23 | 1000000 |






