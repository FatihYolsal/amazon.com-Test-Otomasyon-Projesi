Feature: Amazon

  Scenario: Amazon.com sitesine git ve arama yap.
    Given Amazon.com sitesine git.
    When Cookie kabul edilir.
    When Aramaya Airpods yazilir ve aranir.
    When Urun sadece Amazon tarafindan gonderilir filtresi secilir.
    When Marka Apple secilir.
    When İlk urun secilir.
    When Sepete eklenir.
    When Sepete gidilir.
    Then Urunun sepete geldigi kontrol edilir.