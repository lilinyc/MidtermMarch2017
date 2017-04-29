-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: midterm
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `tbl_datareader`
--

DROP TABLE IF EXISTS `tbl_datareader`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_datareader` (
  `column_dataReader` mediumtext,
  `tbl_datareadercol` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`tbl_datareadercol`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_datareader`
--

LOCK TABLES `tbl_datareader` WRITE;
/*!40000 ALTER TABLE `tbl_datareader` DISABLE KEYS */;
INSERT INTO `tbl_datareader` VALUES ('',16),('Tech companies are also trying to pioneer the self-driving car. Recently, Google announced that it would be testing its prototype of a driverless car on roads this summer in California.',17),('',18),('In an in-depth report from BI Intelligence, we analyze the self-driving car market by analyzing the current state of the self-driving car and provide an in-depth analysis for how we see the self-driving car progressing over the next five years.',19),('Our in-depth analysis describes the economic impact that self-driving cars can have and look at the current barriers preventing the self-driving car from coming to market.arn and knowledge of the right steps!',20),('',21),('Tech companies are also trying to pioneer the self-driving car. Recently, Google announced that it would be testing its prototype of a driverless car on roads this summer in California.',22),('',23),('In an in-depth report from BI Intelligence, we analyze the self-driving car market by analyzing the current state of the self-driving car and provide an in-depth analysis for how we see the self-driving car progressing over the next five years.',24),('Our in-depth analysis describes the economic impact that self-driving cars can have and look at the current barriers preventing the self-driving car from coming to market.arn and knowledge of the right steps!',25);
/*!40000 ALTER TABLE `tbl_datareader` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-29  0:48:34
