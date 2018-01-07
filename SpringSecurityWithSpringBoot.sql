-- phpMyAdmin SQL Dump
-- version 4.7.6
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 07 Oca 2018, 09:40:14
-- Sunucu sürümü: 10.1.29-MariaDB
-- PHP Sürümü: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `SpringSecurityWithSpringBoot`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `Address`
--

CREATE TABLE `Address` (
  `Neighborhood` varchar(100) DEFAULT NULL,
  `Borough` varchar(100) DEFAULT NULL,
  `Country` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `Member`
--

CREATE TABLE `Member` (
  `name` varchar(100) DEFAULT NULL,
  `surname` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `memberUserName` varchar(30) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `Member`
--

INSERT INTO `Member` (`name`, `surname`, `city`, `company`, `address`, `password`, `memberUserName`, `enabled`) VALUES
('ilkay', 'günel', 'istanbul', 'asseco', 'Cennet Mahallesi İstanbul', '$2a$10$mv5TF/qhTBg81gJOcM2BP.2YJlJtYEqmwFCfocKz4xxnc.3cxWsCi', 'ilkay.gunel', 1),
('ertan', 'şahin', 'istanbul', 'asseco', 'Cennet Mahallesi İstanbul', '$2a$10$LURtA5UyJAHv0itdWadmB.9LCY9JHeJzlprlzRl3.XGLoK0u3Ld0e', 'ertan.sahin', 1);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `persistent_logins`
--

CREATE TABLE `persistent_logins` (
  `username` varchar(64) COLLATE utf8_turkish_ci NOT NULL,
  `series` varchar(64) COLLATE utf8_turkish_ci NOT NULL,
  `token` varchar(64) COLLATE utf8_turkish_ci NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `userroles`
--

CREATE TABLE `userroles` (
  `id` int(11) NOT NULL,
  `role` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `memberUserName` varchar(33) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `userroles`
--

INSERT INTO `userroles` (`id`, `role`, `memberUserName`) VALUES
(1, 'ROLE_ADMIN', 'ertan.sahin'),
(2, 'ROLE_USER', 'ilkay.gunel');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
