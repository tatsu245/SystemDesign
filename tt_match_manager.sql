-- MySQL dump 10.13  Distrib 8.0.11, for osx10.13 (x86_64)
--
-- Host: localhost    Database: tt_match_manager
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Player`
--

DROP TABLE IF EXISTS `Player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Player` (
  `player_id` int(11) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `tall` double DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `team` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`player_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Player`
--

LOCK TABLES `Player` WRITE;
/*!40000 ALTER TABLE `Player` DISABLE KEYS */;
INSERT INTO `Player` VALUES (1,'デビッド・ベッカム','1975-05-02',183,74,NULL,'ACミラン'),(2,'デビッド・ベッカム','1975-05-02',183,74,'ft','ACミラン');
/*!40000 ALTER TABLE `Player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Result`
--

DROP TABLE IF EXISTS `Result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Result` (
  `result_id` int(11) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(50) DEFAULT NULL,
  `result_date` date DEFAULT NULL,
  `tournament_name` varchar(50) DEFAULT NULL,
  `count` varchar(50) DEFAULT NULL,
  `match_place` varchar(50) DEFAULT NULL,
  `opponent_name` varchar(50) DEFAULT NULL,
  `match_form` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`result_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Result`
--

LOCK TABLES `Result` WRITE;
/*!40000 ALTER TABLE `Result` DISABLE KEYS */;
INSERT INTO `Result` VALUES (1,'デビッド・ベッカム','2018-07-22','小金井夏季市民大会','11-9','準決勝','ネイマール・ダ・シウバ','シングルス');
/*!40000 ALTER TABLE `Result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tournament`
--

DROP TABLE IF EXISTS `Tournament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Tournament` (
  `tournament_id` int(11) NOT NULL AUTO_INCREMENT,
  `tournament_name` varchar(50) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `place` varchar(100) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `participant` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tournament_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tournament`
--

LOCK TABLES `Tournament` WRITE;
/*!40000 ALTER TABLE `Tournament` DISABLE KEYS */;
INSERT INTO `Tournament` VALUES (1,NULL,'2018-04-15','2018-04-15','小平市民総合体育館',NULL,'一般'),(2,NULL,'2018-04-22','2018-07-22','小平市民総合体育館',NULL,'一般'),(3,NULL,'2018-07-08','2018-07-08','小平市民総合体育館',NULL,'一般'),(4,'小金井夏季市民大会','2018-07-22','2018-07-29','小平市民総合体育館','ft','一般');
/*!40000 ALTER TABLE `Tournament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `User` (
  `user_id` varchar(50) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `student_number` varchar(10) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `password` (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES ('','','',''),('ft','古田龍将','e165413','mallow'),('na','市川なつみ','23416023','nmm777'),('test','古田龍将','e165413','test');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-26 19:51:04
