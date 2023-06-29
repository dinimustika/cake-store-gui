-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2022 at 04:15 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cakeland`
--

-- --------------------------------------------------------

--
-- Table structure for table `cake`
--

CREATE TABLE `cake` (
  `CakeID` char(7) NOT NULL,
  `CakeName` varchar(50) NOT NULL,
  `CakePrice` int(10) NOT NULL,
  `CakeSize` varchar(10) NOT NULL,
  `CakeShape` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cake`
--

INSERT INTO `cake` (`CakeID`, `CakeName`, `CakePrice`, `CakeSize`, `CakeShape`) VALUES
('COF0001', 'Strawberry Cake', 150000, '15 cm', 'Oval'),
('COF0004', 'Curry Puff', 9000, '15 cm', 'Oval'),
('CON0003', 'Rainbow Cake', 150000, '10 x 10 cm', 'Rectangle'),
('CON0005', 'Mango Custard', 150000, '20 cm', 'Oval'),
('CRH0002', 'Mousse Cake', 250000, '30 x 30 cm', 'Rectangle'),
('CRW0006', 'Red Velvet', 190000, '20 x 20 cm', 'Rectangle');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `UserID` char(5) NOT NULL,
  `CakeID` char(7) NOT NULL,
  `Quantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transactiondetail`
--

CREATE TABLE `transactiondetail` (
  `TransactionID` char(5) NOT NULL,
  `CakeID` char(7) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactiondetail`
--

INSERT INTO `transactiondetail` (`TransactionID`, `CakeID`, `Quantity`) VALUES
('T0001', 'COF0004', 1),
('T0001', 'CRH0002', 1),
('T0001', 'CON0005', 1),
('T0002', 'CON0003', 1),
('T0002', 'COF0004', 2);

-- --------------------------------------------------------

--
-- Table structure for table `transactionheader`
--

CREATE TABLE `transactionheader` (
  `TransactionID` char(5) NOT NULL,
  `UserID` char(5) NOT NULL,
  `TransactionDate` date NOT NULL,
  `PickUpDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactionheader`
--

INSERT INTO `transactionheader` (`TransactionID`, `UserID`, `TransactionDate`, `PickUpDate`) VALUES
('T0001', 'US001', '2022-01-09', '2022-09-01'),
('T0002', 'US001', '2022-01-09', '2022-01-12');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` char(5) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `UserEmail` varchar(50) NOT NULL,
  `UserPassword` varchar(50) NOT NULL,
  `UserGender` varchar(10) NOT NULL,
  `UserDOB` date NOT NULL,
  `UserPhoneNumber` varchar(20) NOT NULL,
  `UserAddress` varchar(100) NOT NULL,
  `UserRole` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Username`, `UserEmail`, `UserPassword`, `UserGender`, `UserDOB`, `UserPhoneNumber`, `UserAddress`, `UserRole`) VALUES
('US001', 'test12', 'test12@g.ca', 'test12', 'Male', '2001-12-12', '081767890123', 'test12 Street', 'Customer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cake`
--
ALTER TABLE `cake`
  ADD PRIMARY KEY (`CakeID`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD KEY `UserID` (`UserID`),
  ADD KEY `CakeID` (`CakeID`);

--
-- Indexes for table `transactiondetail`
--
ALTER TABLE `transactiondetail`
  ADD KEY `TransactionID` (`TransactionID`),
  ADD KEY `CakeID` (`CakeID`);

--
-- Indexes for table `transactionheader`
--
ALTER TABLE `transactionheader`
  ADD PRIMARY KEY (`TransactionID`),
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `UserPhoneNumber` (`UserPhoneNumber`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
