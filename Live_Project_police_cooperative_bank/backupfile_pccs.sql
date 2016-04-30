-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: pccs
-- ------------------------------------------------------
-- Server version	5.1.33-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `pccs`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `pccs` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pccs`;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `name` varchar(80) NOT NULL,
  `account_no` int(10) unsigned NOT NULL DEFAULT '0',
  `designation` varchar(20) NOT NULL,
  `batch_no` varchar(20) DEFAULT NULL,
  `voucher_no` varchar(10) NOT NULL,
  `dob` date NOT NULL,
  `doac` date NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `share_bal` int(10) unsigned NOT NULL,
  `share_interest` int(10) unsigned NOT NULL,
  `rdbal` int(10) unsigned NOT NULL,
  `rd_interest` int(10) unsigned NOT NULL,
  `unpaid_loan_amount` int(10) unsigned NOT NULL,
  `paid_interest_amount` int(10) unsigned NOT NULL,
  `loan_installment_amount` int(10) unsigned NOT NULL,
  `loan_interest_amount` int(10) unsigned NOT NULL,
  `entry_fee` smallint(5) unsigned NOT NULL,
  `mice` smallint(5) unsigned NOT NULL,
  `RD_INT_YEARS` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`account_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Shailendra Singh',123,'SP','767676','676','2014-12-27','2014-12-27','hjhj',500,0,0,0,0,0,0,0,10,90,0);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan_payment`
--

DROP TABLE IF EXISTS `loan_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loan_payment` (
  `particulars` date NOT NULL,
  `account_no` int(10) unsigned NOT NULL,
  `withdraw_loan_amount` int(10) unsigned DEFAULT NULL,
  `installment_paid` int(10) unsigned DEFAULT NULL,
  `remaining_loan_amount` int(10) unsigned NOT NULL,
  `interest_paid` int(10) unsigned DEFAULT NULL,
  `total_interest_paid` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`account_no`,`particulars`),
  CONSTRAINT `loan_payment_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan_payment`
--

LOCK TABLES `loan_payment` WRITE;
/*!40000 ALTER TABLE `loan_payment` DISABLE KEYS */;
INSERT INTO `loan_payment` VALUES ('2014-12-27',123,0,NULL,0,NULL,NULL);
/*!40000 ALTER TABLE `loan_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loan_sanction`
--

DROP TABLE IF EXISTS `loan_sanction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loan_sanction` (
  `loan_sanction_date` date NOT NULL,
  `account_no` int(10) unsigned NOT NULL,
  `loan_amount` int(10) unsigned NOT NULL,
  `no_of_installments` smallint(6) NOT NULL,
  `installment_amount` int(10) unsigned NOT NULL,
  `interest_amount` int(10) unsigned NOT NULL,
  `previous_unpaid_amount` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_no`,`loan_sanction_date`),
  CONSTRAINT `loan_sanction_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan_sanction`
--

LOCK TABLES `loan_sanction` WRITE;
/*!40000 ALTER TABLE `loan_sanction` DISABLE KEYS */;
INSERT INTO `loan_sanction` VALUES ('2014-12-27',123,0,0,0,0,0);
/*!40000 ALTER TABLE `loan_sanction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pccs_ainfo`
--

DROP TABLE IF EXISTS `pccs_ainfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pccs_ainfo` (
  `AINFO_TYPE` varchar(4) NOT NULL DEFAULT '',
  `INFO` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`AINFO_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pccs_ainfo`
--

LOCK TABLES `pccs_ainfo` WRITE;
/*!40000 ALTER TABLE `pccs_ainfo` DISABLE KEYS */;
INSERT INTO `pccs_ainfo` VALUES ('PASS','sheelu'),('USER','sheelu');
/*!40000 ALTER TABLE `pccs_ainfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pccs_values`
--

DROP TABLE IF EXISTS `pccs_values`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pccs_values` (
  `pccs_id` varchar(7) NOT NULL DEFAULT '',
  `value` smallint(5) unsigned DEFAULT NULL,
  PRIMARY KEY (`pccs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pccs_values`
--

LOCK TABLES `pccs_values` WRITE;
/*!40000 ALTER TABLE `pccs_values` DISABLE KEYS */;
INSERT INTO `pccs_values` VALUES ('EF_PCCS',10),('LI_PCCS',1),('MI_PCCS',90),('RI_PCCS',7);
/*!40000 ALTER TABLE `pccs_values` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rd`
--

DROP TABLE IF EXISTS `rd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rd` (
  `account_no` int(10) unsigned NOT NULL DEFAULT '0',
  `particulars` date NOT NULL DEFAULT '0000-00-00',
  `deposit_amount` int(10) unsigned DEFAULT NULL,
  `withdraw_amount` int(10) unsigned DEFAULT NULL,
  `balance` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_no`,`particulars`),
  CONSTRAINT `rd_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rd`
--

LOCK TABLES `rd` WRITE;
/*!40000 ALTER TABLE `rd` DISABLE KEYS */;
/*!40000 ALTER TABLE `rd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rd_interest`
--

DROP TABLE IF EXISTS `rd_interest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rd_interest` (
  `account_no` int(10) unsigned NOT NULL DEFAULT '0',
  `particulars` date NOT NULL DEFAULT '0000-00-00',
  `deposit_interest` int(10) unsigned DEFAULT NULL,
  `withdraw_interest` int(10) unsigned DEFAULT NULL,
  `total_interest` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_no`,`particulars`),
  CONSTRAINT `rd_interest_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rd_interest`
--

LOCK TABLES `rd_interest` WRITE;
/*!40000 ALTER TABLE `rd_interest` DISABLE KEYS */;
/*!40000 ALTER TABLE `rd_interest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `share`
--

DROP TABLE IF EXISTS `share`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `share` (
  `account_no` int(10) unsigned NOT NULL DEFAULT '0',
  `particulars` date NOT NULL DEFAULT '0000-00-00',
  `deposit_amount` int(10) unsigned DEFAULT NULL,
  `withdraw_amount` int(10) unsigned DEFAULT NULL,
  `balance` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_no`,`particulars`),
  CONSTRAINT `share_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `share`
--

LOCK TABLES `share` WRITE;
/*!40000 ALTER TABLE `share` DISABLE KEYS */;
INSERT INTO `share` VALUES (123,'2014-12-27',500,NULL,500);
/*!40000 ALTER TABLE `share` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `share_interest`
--

DROP TABLE IF EXISTS `share_interest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `share_interest` (
  `account_no` int(10) unsigned NOT NULL DEFAULT '0',
  `particulars` date NOT NULL DEFAULT '0000-00-00',
  `deposit_interest` int(10) unsigned DEFAULT NULL,
  `withdraw_interest` int(10) unsigned DEFAULT NULL,
  `total_interest` int(10) unsigned NOT NULL,
  PRIMARY KEY (`account_no`,`particulars`),
  CONSTRAINT `share_interest_ibfk_1` FOREIGN KEY (`account_no`) REFERENCES `customer` (`account_no`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `share_interest`
--

LOCK TABLES `share_interest` WRITE;
/*!40000 ALTER TABLE `share_interest` DISABLE KEYS */;
/*!40000 ALTER TABLE `share_interest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-28 20:05:05
